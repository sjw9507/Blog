package com.sjw.blog.service.impl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sjw.blog.dao.ArticleDao;
import com.sjw.blog.dao.CategoryDao;
import com.sjw.blog.dto.ArticleDTO;
import com.sjw.blog.entity.Article;
import com.sjw.blog.entity.Category;
import com.sjw.blog.service.CategoryService;
import com.sjw.blog.util.Page;

/**
 * @author Jiawei Shi
 * @version 创建时间：2018年1月26日 下午2:58:46
 *
 */

@Service
public class CategoryServiceImpl implements CategoryService {
	@Autowired
	private CategoryDao categoryDao;
	
	@Autowired
	private ArticleDao articleDao;

	@Override
	public List<Category> getCategory(Integer status) throws Exception {
		return categoryDao.getCategory(status);
	}

	@Override
	public Integer countCategory(Integer status) {
		return categoryDao.countCategory(status);
	}

	@Override
	public List<ArticleDTO> listArticleWithCategoryByPage(Integer status, Integer pageNow, Integer pageSize,
			Integer cateId) throws Exception {
		List<ArticleDTO> articleDTOList = new ArrayList<ArticleDTO>();
		List<Article> articleList = new ArrayList<Article>();
		
		//获得分类的信息
		Category category = categoryDao.getCategoryById(1, cateId);
		//如果没有这个分类，返回null
		if(category==null) {
			return null;
		}

		//分页显示
		Page page = null;
		int totalCount = articleDao.countArticleByCategory(status,cateId);

		if (pageNow != null) {
			page = new Page(totalCount, pageNow,pageSize);
			articleList = categoryDao.listArticleWithCategoryByPage(status,cateId,page.getStartPos(), page.getPageSize());
		} else {
			page = new Page(totalCount, 1,pageSize);
			articleList = categoryDao.listArticleWithCategoryByPage(status,cateId,page.getStartPos(), page.getPageSize());
			
		}
		for(int i=0;i<articleList.size();i++) {
			ArticleDTO articleDTO = new ArticleDTO();
			
			//1、将文章信息装入 articleDTOList
			Article article = articleList.get(i);
			articleDTO.setArticle(article);

			//2、将分类信息装到 articleListVoList 中
			List<Category> categoryList = new ArrayList<Category>();
			Integer parentCategoryId =articleList.get(i).getArticleParentCategoryId();
			Integer childCategoryId =articleList.get(i).getArticleChildCategoryId();
			Category category1 = categoryDao.getCategoryById(status, parentCategoryId);
			Category category2 = categoryDao.getCategoryById(status,childCategoryId);
			if(category1!=null) {
				categoryList.add(category1);
			}
			if(category2!=null) {
				categoryList.add(category2);
			}
			articleDTO.setCategoryList(categoryList);

			articleDTOList.add(articleDTO);
		}
        //如果该分类还没有文章
        if(totalCount!=0) {
            //2、将Page信息存储在第一个元素中
        	articleDTOList.get(0).setPage(page);
        }
		return articleDTOList;
	}

	@Override
	public Category getCategoryById(Integer status, Integer cateId) {
		return categoryDao.getCategoryById(status, cateId);
	}

	
}

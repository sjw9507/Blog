package com.sjw.blog.service.impl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sjw.blog.dao.ArticleDao;
import com.sjw.blog.dao.CategoryDao;
import com.sjw.blog.dao.TagDao;
import com.sjw.blog.dto.ArticleDTO;
import com.sjw.blog.dto.TagDTO;
import com.sjw.blog.entity.Article;
import com.sjw.blog.entity.Category;
import com.sjw.blog.entity.Tag;
import com.sjw.blog.service.ArticleService;
import com.sjw.blog.util.Page;

/**
 * @author Jiawei Shi
 * @version 创建时间：2018年1月30日 下午3:22:48
 *
 */
@Service
public class ArticleServiceImpl implements ArticleService {

	@Autowired
	private ArticleDao articleDao;

	@Autowired
	private CategoryDao categoryDao;

	@Autowired
	private TagDao tagDao;

	@Override
	public List<ArticleDTO> getArticleByPage(Integer status, Integer pageNow, Integer pageSize) throws Exception {
		int totalCount = articleDao.countArticle(status);
		Page page = new Page(totalCount, pageNow, pageSize);

		List<Article> articleList = new ArrayList<>();
		articleList = articleDao.getArticleByPage(status, page.getStartPos(), page.getPageSize());

		List<ArticleDTO> articleDTOList = new ArrayList<>();
		for (Article article : articleList) {
			ArticleDTO articleDTO = new ArticleDTO();
			// 封装文章信息
			articleDTO.setArticle(article);

			// 封装分类目录信息
			List<Category> categoryList = new ArrayList<Category>();
			Integer parentCategoryId = article.getArticleParentCategoryId();
			Integer childCategoryId = article.getArticleChildCategoryId();
			Category category1 = categoryDao.getCategoryById(status, parentCategoryId);
			Category category2 = categoryDao.getCategoryById(status, childCategoryId);
			if (category1 != null) {
				categoryList.add(category1);
			}
			if (category2 != null) {
				categoryList.add(category2);
			}
			articleDTO.setCategoryList(categoryList);

			// 封装标签信息
			List<TagDTO> tagDTOList = new ArrayList<>();
			String tagIds = article.getArticleTagIds();
			if (tagIds != null && tagIds != "") {
				String[] tagId = tagIds.split(",");
				for (int i = 0; i < tagId.length; i++) {
					Tag tag = tagDao.selectTagById(tagId[i]);
					if (tag != null) {
						TagDTO tagDTO = Tag.transformToDTO(tag);
						tagDTOList.add(tagDTO);
					}
				}
			}
			articleDTO.setTagDTOList(tagDTOList);
			
			
			//封装文章对象，放入总的list
			articleDTOList.add(articleDTO);
		}

		// page信息存放入第一个对象中
		if (articleDTOList.size() > 0)

		{
			articleDTOList.get(0).setPage(page);
		}

		return articleDTOList;
	}

}

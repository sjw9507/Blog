<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn"%>
<%@ taglib uri="/WEB-INF/myTag.tld" prefix="sjw"%>
<%@ taglib prefix="rapid" uri="http://www.rapid-framework.org.cn/rapid"%>
<%
	String path = request.getContextPath();
	String basePath = request.getScheme() + "://" + request.getServerName() + ":" + request.getServerPort()
			+ path + "/";
%>

<rapid:override name="description">
	<meta name="description" content="${category.categoryName}" />
</rapid:override>
<rapid:override name="keywords">
	<meta name="keywords" content="${category.categoryName}" />
</rapid:override>
<rapid:override name="title">
	<title>${category.categoryName}</title>
</rapid:override>

<%--面包屑导航 start--%>
<rapid:override name="breadcrumb">
	<nav class="breadcrumb">
		<a class="crumbs" href="<%=basePath%>">
			<i class="fa fa-home"></i>首页
		</a>
		<i class="fa fa-angle-right"></i>
		<c:choose>
			<c:when test="${articleDTOList!=null}">
				<c:choose>
					<c:when test="${articleDTOList.size()!=0}">
						<a href="<%=basePath%>category/${articleDTOList[0].categoryList[0].categoryId}">${articleDTOList[0].categoryList[0].categoryName}</a>
					</c:when>
					<c:otherwise>
						<a href="<%=basePath%>category/${category.categoryId}">${category.categoryName}</a>
					</c:otherwise>
				</c:choose>
				<i class="fa fa-angle-right"></i>
                文章
            </c:when>
			<c:otherwise>
                该分类不存在
            </c:otherwise>

		</c:choose>

	</nav>
</rapid:override>
<%--面包屑导航 end--%>


<rapid:override name="left">
	<%--博客主体-左侧正文 start--%>
	<div id="primary" class="content-area">
		<main id="main" class="site-main"> <c:choose>
			<c:when test="${articleDTOList!=null}">
				<c:choose>
					<c:when test="${articleDTOList.size()!=0}">
						<%--文章列表-start--%>
						<c:forEach items="${articleDTOList}" var="a">

							<article class="post">

								<figure class="thumbnail">
									<a href="<%=basePath%>article/${a.article.articleId}">
										<img width="280" height="210" src="<%=basePath%>resource/img/thumbnail/random/img_${a.article.articleId%400}.jpg"
											class="attachment-content size-content wp-post-image" alt="${a.article.articleTitle}">
									</a>
									<span class="cat">
										<a href="<%=basePath%>category/${a.categoryList[fn:length(a.categoryList)-1].categoryId}">
											${a.categoryList[fn:length(a.categoryList)-1].categoryName} </a>
									</span>
								</figure>

								<header class="entry-header">
									<h2 class="entry-title">
										<a href="<%=basePath%>article/${a.article.articleId}" rel="bookmark"> ${a.article.articleTitle} </a>
									</h2>
								</header>
								<!-- .entry-header -->

								<div class="entry-content">
									<div class="archive-content">
										<sjw:htmlFilter>${a.article.articleContent}</sjw:htmlFilter>
										......<br> <br> <br>
									</div>
									<span class="title-l"></span>
									<span class="new-icon">
										<c:choose>
											<c:when test="${a.article.articleStatus==2}">
												<i class="fa fa-bookmark-o"></i>
											</c:when>
											<c:otherwise>
												<jsp:useBean id="nowDate" class="java.util.Date" />
												<%--当前时间--%>
												<c:set var="interval" value="${nowDate.time - a.article.articlePostTime.time}" />
												<%--时间差毫秒数--%>
												<fmt:formatNumber value="${interval/1000/60/60/24}" pattern="#0" var="days" />
												<%--取天数整数--%>
												<c:if test="${days <= 7}">NEW</c:if>
											</c:otherwise>
										</c:choose>


									</span>
									<span class="entry-meta">
										<span class="date">
											<fmt:formatDate value="${a.article.articlePostTime}" pattern="yyyy年MM月dd日" />
											&nbsp;&nbsp;
										</span>
										<span class="views">
											<i class="fa fa-eye"></i> ${a.article.articleViewCount} views
										</span>
										<span class="comment">
											&nbsp;&nbsp;
											<a href="<%=basePath%>article/${a.article.articleId}#comments" rel="external nofollow">
												<i class="fa fa-comment-o"></i>
												<c:choose>
													<c:when test="${a.article.articleCommentCount==0}">
                                                    发表评论
                                                </c:when>
													<c:otherwise>
                                                    ${a.article.articleCommentCount}
                                                </c:otherwise>
												</c:choose>
											</a>
										</span>
									</span>
									<div class="clear"></div>
								</div>
								<!-- .entry-content -->

								<span class="entry-more">
									<a href="<%=basePath%>article/${a.article.articleId}" rel="bookmark">阅读全文 </a>
								</span>
							</article>
						</c:forEach>
						<%--文章列表-end--%>
					</c:when>
					<c:otherwise>
						<section class="no-results not-found">
							<div class="post">
								<p>该分类目前还没有文章！</p>
								<br> <br> <br> <br> <br> <br> <br> <br> <br> <br> <br> <br>
								<br> <br> <br> <br> <br> <br> <br> <br>
							</div>
						</section>
					</c:otherwise>
				</c:choose>
			</c:when>
			<c:otherwise>
				<section class="no-results not-found">
					<div class="post">
						<p>该分类不存在</p>
						<br> <br> <br> <br> <br> <br> <br> <br> <br> <br> <br> <br>
						<br> <br> <br> <br> <br> <br> <br> <br>
					</div>
				</section>
			</c:otherwise>
		</c:choose> </main>
		<c:choose>
			<c:when test="${articleDTOList!=null}">
				<c:if test="${articleDTOList.size()!=0}">
					<%--分页 start--%>
					<nav class="navigation pagination" role="navigation">
						<div class="nav-links">
							<c:choose>
								<c:when test="${articleDTOList[0].page.totalPageCount <= 3 }">
									<c:set var="begin" value="1" />
									<c:set var="end" value="${articleDTOList[0].page.totalPageCount }" />
								</c:when>
								<c:otherwise>
									<c:set var="begin" value="${articleDTOList[0].page.pageNow-1 }" />
									<c:set var="end" value="${articleDTOList[0].page.pageNow + 2}" />
									<c:if test="${begin < 2 }">
										<c:set var="begin" value="1" />
										<c:set var="end" value="3" />
									</c:if>
									<c:if test="${end > articleDTOList[0].page.totalPageCount }">
										<c:set var="begin" value="${articleDTOList[0].page.totalPageCount-2 }" />
										<c:set var="end" value="${articleDTOList[0].page.totalPageCount }" />
									</c:if>
								</c:otherwise>
							</c:choose>
							<%--上一页 --%>
							<c:choose>
								<c:when test="${articleDTOList[0].page.pageNow eq 1 }">
									<%--当前页为第一页，隐藏上一页按钮--%>
								</c:when>
								<c:otherwise>
									<a class="page-numbers"
										href="<%=basePath%>category/${articleDTOList[0].categoryList[0].categoryId}/p/${articleDTOList[0].page.pageNow-1}">
										<span class="fa fa-angle-left"></span>
									</a>
								</c:otherwise>
							</c:choose>
							<%--显示第一页的页码--%>
							<c:if test="${begin >= 2 }">
								<a class="page-numbers" href="<%=basePath%>category/${articleDTOList[0].categoryList[0].categoryId}/p/1">1</a>
							</c:if>
							<%--显示点点点--%>
							<c:if test="${begin  > 2 }">
								<span class="page-numbers dots">…</span>
							</c:if>
							<%--打印 页码--%>
							<c:forEach begin="${begin }" end="${end }" var="i">
								<c:choose>
									<c:when test="${i eq articleDTOList[0].page.pageNow }">
										<a class="page-numbers current">${i}</a>
									</c:when>
									<c:otherwise>
										<a class="page-numbers" href="<%=basePath%>category/${articleDTOList[0].categoryList[0].categoryId}/p/${i}">${i }</a>
									</c:otherwise>
								</c:choose>
							</c:forEach>
							<%-- 显示点点点 --%>
							<c:if test="${end < articleDTOList[0].page.totalPageCount-1 }">
								<span class="page-numbers dots">…</span>
							</c:if>
							<%-- 显示最后一页的数字 --%>
							<c:if test="${end < articleDTOList[0].page.totalPageCount }">
								<a
									href="<%=basePath%>category/${articleDTOList[0].categoryList[0].categoryId}/p/${articleDTOList[0].page.totalPageCount}">
									${articleDTOList[0].page.totalPageCount} </a>
							</c:if>
							<%--下一页 --%>
							<c:choose>
								<c:when test="${articleDTOList[0].page.pageNow eq articleDTOList[0].page.totalPageCount }">
									<%--到了尾页隐藏，下一页按钮--%>
								</c:when>
								<c:otherwise>
									<%--如果没有结果，隐藏最后一个>--%>
									<c:if test="${articleDTOList[0].page.totalPageCount>0}">
										<a class="page-numbers"
											href="<%=basePath%>category/${articleDTOList[0].categoryList[0].categoryId}/p/${articleDTOList[0].page.pageNow+1}">
											<span class="fa fa-angle-right"></span>
										</a>
									</c:if>
								</c:otherwise>
							</c:choose>

						</div>
					</nav>
					<%--分页 end--%>
				</c:if>
			</c:when>
		</c:choose>
	</div>
	<%--  博客主体-左侧正文 end--%>
</rapid:override>

<%@ include file="../Public/framework.jsp"%>
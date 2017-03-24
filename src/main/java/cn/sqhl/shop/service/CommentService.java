package cn.sqhl.shop.service;

import java.util.List;

import cn.sqhl.shop.core.PageCond;
import cn.sqhl.shop.vo.Comment;


public interface CommentService {
	
	public List<Comment> queryCommentList(PageCond page,Object obj);
	
}

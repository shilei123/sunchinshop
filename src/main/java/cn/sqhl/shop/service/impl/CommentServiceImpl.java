package cn.sqhl.shop.service.impl;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cn.sqhl.shop.core.PageCond;
import cn.sqhl.shop.mapper.CommentMapper;
import cn.sqhl.shop.mapper.brandMapper;
import cn.sqhl.shop.mapper.categoryMapper;
import cn.sqhl.shop.mapper.dictionaryMapper;
import cn.sqhl.shop.service.CommentService;
import cn.sqhl.shop.service.SystemService;
import cn.sqhl.shop.vo.Comment;
import cn.sqhl.shop.vo.brand;
import cn.sqhl.shop.vo.category;
import cn.sqhl.shop.vo.dictionary;

@Service("commentService")
public class CommentServiceImpl implements CommentService{

	@Autowired
	private CommentMapper commentMapper;
	
	@Override
	public List<Comment> queryCommentList(PageCond page, Object obj) {
		return commentMapper.queryList(page, (Map<String, Object>)obj);
	}

}

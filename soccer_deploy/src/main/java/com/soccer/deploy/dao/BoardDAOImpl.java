package com.soccer.deploy.dao;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class BoardDAOImpl implements BoardDAO {

	@Autowired
	private SqlSession sqlSession;
	private static String namespace = "com.soccer.deploy.mapper.BoardMapper";
	@Override
	public List list() throws Exception {
	return sqlSession.selectList(namespace + ".list");
	}

}

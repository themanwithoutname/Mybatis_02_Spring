package cn.itheima.mybatis.dao;

import org.apache.ibatis.session.SqlSessionFactory;

/*
 * 原始Dao开发
 */
public class UserDaoImpl implements UserDao {
	private SqlSessionFactory sqlSessionFactory;

	public SqlSessionFactory getSqlSessionFactory() {
		return sqlSessionFactory;
	}

	public void setSqlSessionFactory(SqlSessionFactory sqlSessionFactory) {
		this.sqlSessionFactory = sqlSessionFactory;
	}

	public void insertUser() {

	}
}

package com.hhb.common.dao.base.impl;

import java.io.Serializable;
import java.sql.SQLException;
import java.util.List;
import java.util.Map;

import org.springframework.orm.ibatis.SqlMapClientCallback;
import org.springframework.orm.ibatis.support.SqlMapClientDaoSupport;

import com.hhb.common.dao.base.BaseDAO;
import com.ibatis.sqlmap.client.SqlMapExecutor;

public class BaseDAOImpl extends SqlMapClientDaoSupport implements BaseDAO {

	public Integer batchDelete(final String namespace,
			final String statementName,
			final List<? extends Serializable> params) {
		return (Integer) getSqlMapClientTemplate().execute(
				new SqlMapClientCallback() {
					public Object doInSqlMapClient(SqlMapExecutor executor)
							throws SQLException {
						executor.startBatch();
						for (Serializable serializable : params) {
							executor.delete(namespace + statementName,
									serializable);
						}
						return executor.executeBatch();
					}
				});
	}

	public <T> Integer batchInsert(final String namespace,
			final String statementName, final List<T> params) {
		return (Integer) getSqlMapClientTemplate().execute(
				new SqlMapClientCallback() {
					public Object doInSqlMapClient(SqlMapExecutor executor)
							throws SQLException {
						executor.startBatch();
						for (Object object : params) {
							executor.insert(namespace + statementName, object);
						}
						return executor.executeBatch();
					}
				});
	}

	public <T> Integer batchUpdate(final String namespace,
			final String statementName, final List<T> params) {
		return (Integer) getSqlMapClientTemplate().execute(
				new SqlMapClientCallback() {
					public Object doInSqlMapClient(SqlMapExecutor executor)
							throws SQLException {
						executor.startBatch();
						for (Object object : params) {
							executor.update(namespace + statementName, object);
						}
						return executor.executeBatch();
					}
				});
	}

	public Integer delete(String namespace, String statementName, Object param) {
		return this.getSqlMapClientTemplate().delete(namespace + statementName,
				param);
	}

	@SuppressWarnings("unchecked")
	public <T> List<T> queryForList(String namespace, String statementName,
			Object param) {
		return getSqlMapClientTemplate().queryForList(
				namespace + statementName, param);
	}

	@SuppressWarnings("unchecked")
	public <T> T queryForObject(String namespace, String statementName,
			Object param) {
		List<T> list = getSqlMapClientTemplate().queryForList(
				namespace + statementName, param);
		return list != null && !list.isEmpty() ? list.get(0) : null;
	}

	public <T> Serializable insert(String namespace, String statementName,
			T param) {
		return (Serializable) getSqlMapClientTemplate().insert(
				namespace + statementName, param);
	}

	public <T> Integer update(String namespace, String statementName, T param) {
		return getSqlMapClientTemplate().update(namespace + statementName,
				param);
	}

	public Integer deleteById(String namespace, String statementName,
			Serializable id) {
		return getSqlMapClientTemplate().delete(namespace + statementName, id);
	}

	@SuppressWarnings("unchecked")
	public <T> T queryForObjectById(String namespace, String statementName,
			Serializable id) {
		return (T) getSqlMapClientTemplate().queryForObject(
				namespace + statementName, id);
	}

	@SuppressWarnings("unchecked")
	public Map<String, Object> queryForMap(String namespace,
			String statementName, String keyProperty, Object param) {
		return this.getSqlMapClientTemplate().queryForMap(
				namespace + statementName, param, keyProperty);
	}
}

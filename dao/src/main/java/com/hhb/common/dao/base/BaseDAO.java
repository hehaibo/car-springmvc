package com.hhb.common.dao.base;

import java.io.Serializable;
import java.util.List;
import java.util.Map;

/**
 * BASE DAO
 * 
 * @author haibo.hehb
 * 
 */
public interface BaseDAO {
	/**
	 * 插入一条数据
	 * 
	 * @param <T>
	 * @param namespace
	 * @param statementName
	 * @param param
	 * @return
	 */
	public <T> Serializable insert(String namespace, String statementName,
			T param);

	/**
	 * 批量插入数据
	 * 
	 * @param <T>
	 * @param namespace
	 * @param statementName
	 * @param param
	 * @return
	 */
	public <T> Integer batchInsert(String namespace, String statementName,
			List<T> param);

	/**
	 * 
	 * @param <T>
	 * @param namespace
	 * @param statementName
	 * @param param
	 * @return
	 */
	public <T> Integer update(String namespace, String statementName, T param);

	/**
	 * 
	 * @param <T>
	 * @param namespace
	 * @param statementName
	 * @param param
	 * @return
	 */
	public <T> Integer batchUpdate(String namespace, String statementName,
			List<T> param);

	/**
	 * 
	 * @param <T>
	 * @param namespace
	 * @param statementName
	 * @param param
	 * @return
	 */
	public <T> Integer delete(String namespace, String statementName,
			Object param);

	/**
	 * 
	 * @param namespace
	 * @param statementName
	 * @param id
	 * @return
	 */
	public Integer deleteById(String namespace, String statementName,
			Serializable id);

	/**
	 * 
	 * @param namespace
	 * @param statementName
	 * @param param
	 * @return
	 */
	public Integer batchDelete(String namespace, String statementName,
			List<? extends Serializable> param);

	/**
	 * 
	 * @param <T>
	 * @param namespace
	 * @param statementName
	 * @param param
	 * @return
	 */
	public <T> T queryForObject(String namespace, String statementName,
			Object param);

	/**
	 * 
	 * @param <T>
	 * @param namespace
	 * @param statementName
	 * @param id
	 * @return
	 */
	public <T> T queryForObjectById(String namespace, String statementName,
			Serializable id);

	/**
	 * 
	 * @param <T>
	 * @param namespace
	 * @param statementName
	 * @param param
	 * @return
	 */
	public <T> List<T> queryForList(String namespace, String statementName,
			Object param);

	/**
	 * 
	 * @param namespace
	 * @param statementName
	 * @param keyProperty
	 * @param param
	 * @return
	 */
	public Map<String, Object> queryForMap(String namespace,
			String statementName, String keyProperty, Object param);
}

package com.hhb.common.page;

import java.util.ArrayList;
import java.util.List;

public class Paginator<P,V> {
	private Integer limit;
	private Integer start;
	private Integer count;
	private P queryVO;
	private List<V> data=new ArrayList<V>();
	public Integer getLimit() {
		return limit;
	}
	public void setLimit(Integer limit) {
		this.limit = limit;
	}
	public Integer getStart() {
		return start;
	}
	public void setStart(Integer start) {
		this.start = start;
	}
	public Integer getCount() {
		return count;
	}
	public void setCount(Integer count) {
		this.count = count;
	}
	public P getQueryVO() {
		return queryVO;
	}
	public void setQueryVO(P queryVO) {
		this.queryVO = queryVO;
	}
	public List<V> getData() {
		return data;
	}
	public void setData(List<V> data) {
		this.data = data;
	}
}

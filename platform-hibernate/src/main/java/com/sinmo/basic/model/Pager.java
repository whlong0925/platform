package com.sinmo.basic.model;

import java.util.List;

public class Pager<T> {
	private int size;
	private int pageNum;
	private long total;
	private List<T> datas;

	public int getSize() {
		return this.size;
	}

	public void setSize(int size) {
		this.size = size;
	}

	public long getTotal() {
		return this.total;
	}

	public void setTotal(long total) {
		this.total = total;
	}

	public List<T> getDatas() {
		return this.datas;
	}

	public void setDatas(List<T> datas) {
		this.datas = datas;
	}

	public int getPageNum() {
		return this.pageNum;
	}

	public void setPageNum(int pageNum) {
		this.pageNum = pageNum;
	}
}

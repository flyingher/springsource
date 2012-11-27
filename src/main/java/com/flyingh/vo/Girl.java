package com.flyingh.vo;

import java.util.List;

public class Girl {
	private Book book;
	private Pencil pencil;
	private List<String> list;

	public Book getBook() {
		return book;
	}

	public void setBook(Book book) {
		this.book = book;
	}

	public Pencil getPencil() {
		return pencil;
	}

	public void setPencil(Pencil pencil) {
		this.pencil = pencil;
	}

	public List<String> getList() {
		return list;
	}

	public void setList(List<String> list) {
		this.list = list;
	}

	@Override
	public String toString() {
		return "Girl [book=" + book + ", pencil=" + pencil + ", list=" + list
				+ "]";
	}

}

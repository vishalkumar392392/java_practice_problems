package com.java8.strings;

public class Notes {

	int id;

	String tagName;

	int tagId;

	public Notes() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Notes(int id, String tagName, int tagId) {
		super();
		this.id = id;
		this.tagName = tagName;
		this.tagId = tagId;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getTagName() {
		return tagName;
	}

	public void setTagName(String tagName) {
		this.tagName = tagName;
	}

	public int getTagId() {
		return tagId;
	}

	public void setTagId(int tagId) {
		this.tagId = tagId;
	}

	@Override
	public String toString() {
		return "Notes [id=" + id + ", tagName=" + tagName + ", tagId=" + tagId + "]";
	}
	
	

}

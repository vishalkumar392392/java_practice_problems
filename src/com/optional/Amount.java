package com.optional;

public class Amount {
	
	private int id;
	
	private String inWords;

	public String getInWords() {
		return inWords;
	}

	public void setInWords(String inWords) {
		this.inWords = inWords;
	}

	public Amount() {
		super();
	}



	@Override
	public String toString() {
		return "Amount [id=" + id + ", inWords=" + inWords + "]";
	}

	public Amount(int id, String inWords) {
		super();
		this.id = id;
		this.inWords = inWords;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}


	
	

}

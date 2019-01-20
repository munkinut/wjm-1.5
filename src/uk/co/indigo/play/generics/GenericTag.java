package uk.co.indigo.play.generics;

public class GenericTag<T> {

	private T header;

	public GenericTag(T header) {
		super();
		this.header = header;
	}

	public T getHeader() {
		return header;
	}

	public void setHeader(T header) {
		this.header = header;
	}
	
	
}

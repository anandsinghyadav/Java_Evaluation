package com.question_1;

import java.util.Objects;

public class Book {
	private Integer isbn;
	private String bookName;
	private String author;
	
	public Book() {
		// TODO Auto-generated constructor stub
	}

	public Book(Integer isbn, String bookName, String author) {
		super();
		this.isbn = isbn;
		this.bookName = bookName;
		this.author = author;
	}
	
	

	@Override
	public int hashCode() {
		return Objects.hash(author, bookName, isbn);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Book other = (Book) obj;
		return author.equalsIgnoreCase(other.author)&&isbn==other.isbn&&bookName.equalsIgnoreCase(other.getBookName());
	}

	public Integer getIsbn() {
		return isbn;
	}

	public void setIsbn(Integer isbn) {
		this.isbn = isbn;
	}

	public String getBookName() {
		return bookName;
	}

	public void setBookName(String bookName) {
		this.bookName = bookName;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	@Override
	public String toString() {
		return "Book [isbn=" + isbn + ", bookName=" + bookName + ", author=" + author + "]";
	}
	
    

}

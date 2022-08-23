package com.question_1;

import java.util.Objects;

public class Book {
   private Integer bookId;
   private String bookName;
   private String author;
   
   public Book() {
	// TODO Auto-generated constructor stub
   }

	public Book(Integer bookId, String bookName, String author) {
		super();
		this.bookId = bookId;
		this.bookName = bookName;
		this.author = author;
	}

	public Integer getBookId() {
		return bookId;
	}

	public void setBookId(Integer bookId) {
		this.bookId = bookId;
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
		return "Book [bookId=" + bookId + ", bookName=" + bookName + ", author=" + author + "]";
	}
	
	@Override
		public boolean equals(Object obj) {
            Book book1 = this;
            Book book2 =(Book)obj;
            
            return (book1.getBookId()==book2.bookId);
            
		}
	
	@Override
		public int hashCode() {
			return Objects.hash(bookId);
		}
	

}

package com.question_1;

import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;


public class Library {
	
	static Set<Book> bookSet = new LinkedHashSet<>();
	
	public void addBook(Book book)throws BookException{
		    if(bookSet.add(book)==false) {
		    	throw new BookException(book.getBookName()+" Book is Already exist.");
		    }else {
		    	bookSet.add(book);
		    	System.out.println("Book added Successfully");
		    }
	}
	
	public List<Book> viewAllBooks()throws BookException{
		  if(bookSet.size()==0)
			  throw new BookException("No Books Found in the Library.");
		  else
			  return new ArrayList<>(bookSet);
	}
	
	public List<Book> viewBooksByAuthor(String author)throws BookException{
		          List<Book> bookByAuthorList = new ArrayList<>();
		          for(Book b : bookSet) {
		        	  if(b.getAuthor().equalsIgnoreCase(author)) {
		        		  bookByAuthorList.add(b);
		        	  }
		          }
		          if(bookByAuthorList.size()==0)
		        	  throw new BookException("None of the book published by the author "+author);
		          else
		        	  return bookByAuthorList;
	}
	
	public Book getBookByISBN(Integer isbn)throws BookException{
		        Book book = null;
		           for(Book b:bookSet) {
		        	if(b.getIsbn()==isbn)
		        		book = b;
		        }
		        if(book==null) {
		        	throw new BookException("No Book Found with this ISBN: "+isbn);
		        }else {
		        	return book;
		        }
	}

}

package com.question_1;

import java.util.List;
import java.util.Scanner;

public class Main {
	
	public static void main(String[] args)  {
		
		Scanner sc = new Scanner(System.in);
		while(true) {
		System.out.println("Enter Your Choice: "
				+"\n1. Add Book"
				+"\n2. Display all book details"
				+"\n3. Search Book by author"
				+"\n4. Search book by ISBN"
				+"\n5. Exit");
		int choice = Integer.parseInt(sc.nextLine());
		
		Library library = new Library();
		
		switch(choice) {
		case 1: 
			 while(true) {
				 System.out.println("Enter Book ISBN: ");
				 int isbn = Integer.parseInt(sc.nextLine());
				 System.out.println("Enter Book Name: ");
				 String book = sc.nextLine();
				 System.out.println("Enter Book Author: ");
				 String author = sc.nextLine();
				 
				 try {
					library.addBook(new Book(isbn, book, author));
				} catch (BookException e) {
					System.out.println(e.getMessage());
				}
				 System.out.println("Do you want to add more Book: (Y/N)");
				 String res = sc.nextLine();
				 if(res.equalsIgnoreCase("N"))
					 break;
			 }
			 break;
		case 2: 
			  try {
				List<Book> books = library.viewAllBooks();
				for(Book b : books) {
					System.out.println("Book Name: "+b.getBookName());
					System.out.println("Book ISBN: "+b.getIsbn());
					System.out.println("Book Author: "+b.getAuthor());
					System.out.println("----------------------------");
				}
			} catch (BookException e) {
				System.out.println(e.getMessage());
			}
			  break;
		case 3: 
			System.out.println("Enter Author Name: ");
			String author = sc.nextLine();
			
		     try {
				List<Book> books = library.viewBooksByAuthor(author);
				for(Book b : books) {
					System.out.println("Book Name: "+b.getBookName());
					System.out.println("Book ISBN: "+b.getIsbn());
					System.out.println("Book Author: "+b.getAuthor());
					System.out.println("----------------------------");
				}
			} catch (BookException e) {
				System.out.println(e.getMessage());
			}
		     break;
	   case 4: 
		      System.out.println("Enter Book ISBN: ");
		      int isbn = Integer.parseInt(sc.nextLine());
		      try {
				Book b = library.getBookByISBN(isbn);
				System.out.println("Book Name: "+b.getBookName());
				System.out.println("Book ISBN: "+b.getIsbn());
				System.out.println("Book Author: "+b.getAuthor());
			} catch (BookException e) {
				System.out.println(e.getMessage());
			}
		  break;
	   default: 
		   System.out.println("Thank you");
		   break;
		   
		    }
		   System.out.println("Do you want to continue.....(Y/N)");
		   String ans = sc.nextLine();
		   if(ans.equalsIgnoreCase("N"))
			   break;
		
		}
		
	}

}

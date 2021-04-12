package com.pnc.book.store.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.pnc.book.store.app.AddBookRequest;
import com.pnc.book.store.app.AddBookResponse;
import com.pnc.book.store.app.Book;
import com.pnc.book.store.app.GetAllBooksRequest;
import com.pnc.book.store.app.GetAllBooksResponse;
import com.pnc.book.store.app.GetBookRequest;
import com.pnc.book.store.app.GetBookResponse;



@Service
public class BookStoreService {
	public GetBookResponse getBook(GetBookRequest request) {

		
		GetBookResponse response = new GetBookResponse();
		Book book = new Book();
		book.setAuthor("abcd");
		book.setID("12345678");
		book.setTitle("adventure");
		response.setBook(book);
		return response;
	}


	public GetAllBooksResponse getAllBooks(GetAllBooksRequest request) {

		GetAllBooksResponse response = new GetAllBooksResponse();
		response.getBook().addAll(getAllBooksRepo());
		return response; 
	}



	public AddBookResponse addBook(AddBookRequest request) {
		AddBookResponse response = new AddBookResponse();
		response.setBook(request.getBook());
		return response;
	}


	private List<Book> getAllBooksRepo(){


		List<Book> allBooks = new ArrayList<>();
		allBooks.add(createBook("1", "author 1", "title 1"));
		allBooks.add(createBook("2", "author 2", "title 2"));
		allBooks.add(createBook("3", "author 3", "title 3"));
		allBooks.add(createBook("4", "author 4", "title 4"));
		
		return allBooks; 
	}
	
	private Book createBook(String id, String author, String title) {
		Book book = new Book();
		book.setAuthor(author);
		book.setID(id);
		book.setTitle(title);	
		return book;

	}
}

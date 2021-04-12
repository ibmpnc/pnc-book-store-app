package com.pnc.book.store.endpoint;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ws.server.endpoint.annotation.Endpoint;
import org.springframework.ws.server.endpoint.annotation.PayloadRoot;
import org.springframework.ws.server.endpoint.annotation.RequestPayload;
import org.springframework.ws.server.endpoint.annotation.ResponsePayload;

import com.pnc.book.store.app.AddBookRequest;
import com.pnc.book.store.app.AddBookResponse;
import com.pnc.book.store.app.BookStorePort;
import com.pnc.book.store.app.GetAllBooksRequest;
import com.pnc.book.store.app.GetAllBooksResponse;
import com.pnc.book.store.app.GetBookRequest;
import com.pnc.book.store.app.GetBookResponse;
import com.pnc.book.store.service.BookStoreService;

@Endpoint
public class BookStoreEndPoint implements BookStorePort{

private static final String NAMESPACE = "http://www.pnc.com/book/store/app";
	
	@Autowired
	private BookStoreService service;
	
	@PayloadRoot(namespace=NAMESPACE, localPart="GetBookRequest")
	@ResponsePayload
	public GetBookResponse getBook(@RequestPayload GetBookRequest request) {
		
		return service.getBook(request);
	}
	
	@PayloadRoot(namespace=NAMESPACE, localPart="AddBookRequest")
	@ResponsePayload
	public AddBookResponse addBook(@RequestPayload AddBookRequest request) {
		
		return service.addBook(request);
	}
	
	@PayloadRoot(namespace=NAMESPACE, localPart="GetAllBooksRequest")
	@ResponsePayload
	public GetAllBooksResponse getAllBooks(@RequestPayload GetAllBooksRequest request) {

		return service.getAllBooks(request);
	}

}

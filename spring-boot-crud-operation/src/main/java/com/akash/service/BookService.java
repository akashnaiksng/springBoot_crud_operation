package com.akash.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.akash.model.Book;
import com.akash.repository.BookRepository;

@Service
public class BookService {
	@Autowired
	BookRepository bookRepository;
	
	public Book addBook(Book book) {
		bookRepository.save(book);
		return book;
	}
	
	public List<Book> getAllBooks() {
		List<Book> obj=new ArrayList<Book>();
		obj=(List<Book>) bookRepository.findAll();
		return obj;
	}
	
	public Optional<Book> getBookById(int bookid) {
		return bookRepository.findById(bookid);
		
	}
	public void deleteBook(int bookid) {
		bookRepository.deleteById(bookid);
	}
	
	public Book updateBook(Book book) {
		bookRepository.save(book);
		return book;
	}
}

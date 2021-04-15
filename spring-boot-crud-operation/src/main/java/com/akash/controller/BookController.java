package com.akash.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;

import com.akash.model.Book;
import com.akash.service.BookService;

@Controller
public class BookController {
	@Autowired
	BookService bookService;

	@GetMapping("/allBooks")
	@ResponseBody
	public List<Book> getAllBooks(Book book) {
		return bookService.getAllBooks();

	}

	@GetMapping("/oneBook/{bookid}")
	@ResponseBody
	public Optional<Book> getBookById(@PathVariable("bookid") int bookid) {
		return bookService.getBookById(bookid);
	}

	@PostMapping("/saveBook")
	@ResponseBody
	public Book saveBook(@RequestBody Book book) {
		return bookService.addBook(book);
	}

	@PutMapping("/updateBook")
	@ResponseBody
	public Book updateBook(@RequestBody Book book) {
		return bookService.updateBook(book);
	}

	@DeleteMapping("/deleteBook/{bookid}")
	@ResponseBody
	public void deleteBook(@PathVariable("bookid") int bookid) {
		bookService.deleteBook(bookid);
	}
}

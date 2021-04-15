package com.akash.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.akash.model.Book;
@Repository
public interface BookRepository extends CrudRepository<Book, Integer> {

}

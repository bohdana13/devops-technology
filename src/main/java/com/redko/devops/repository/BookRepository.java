package com.redko.devops.repository;

import com.redko.devops.model.Book;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;


/*
  @author User
  @project lab7
  @class BookRepository
  @version 1.0.0
  @since 24.04.2025 - 22.22
*/

@Repository
public interface BookRepository extends MongoRepository<Book, String>  {
    public boolean existsByCode(String code);

}

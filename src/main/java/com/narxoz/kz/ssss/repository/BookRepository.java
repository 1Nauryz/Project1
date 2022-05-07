package com.narxoz.kz.ssss.repository;
import com.narxoz.kz.ssss.model.Book;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BookRepository extends JpaRepository<Book, Long> {
}


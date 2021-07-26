package com.educandoweb.course.repositories;

import com.educandoweb.course.entities.Category;
import com.educandoweb.course.entities.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import com.educandoweb.course.entities.User;

public interface ProductRepository extends JpaRepository<Product, Long> {


    
}

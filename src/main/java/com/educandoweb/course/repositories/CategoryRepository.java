package com.educandoweb.course.repositories;

import com.educandoweb.course.entities.Category;
import org.springframework.data.jpa.repository.JpaRepository;
import com.educandoweb.course.entities.User;

public interface CategoryRepository extends JpaRepository<Category, Long> {


    
}

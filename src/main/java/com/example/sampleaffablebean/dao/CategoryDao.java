package com.example.sampleaffablebean.dao;

import com.example.sampleaffablebean.ds.Category;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CategoryDao extends JpaRepository<Category,Integer> {
}

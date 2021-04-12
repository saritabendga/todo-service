package com.example.demo.repo;

import com.example.demo.model.Todo;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import javax.annotation.Resource;

@Repository
public interface TodoRepository extends JpaRepository<Todo,Integer> {
}

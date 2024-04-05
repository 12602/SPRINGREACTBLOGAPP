package com.example.demo.DAO;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Controller;

import com.example.demo.Entity.Post;
import com.example.demo.Entity.User;

@Controller
public interface BlogDao extends JpaRepository<Post, Integer>{
	
	public Post findById(int id);
	public List<Post> findAll();
	public Post deleteById(int id);
	@Query("select p from Post p order by likes desc")
	public List<Post> findPostOrderBylikesByUser();
	
}

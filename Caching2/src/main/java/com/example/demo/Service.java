package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.Cacheable;

import java.util.*;

@org.springframework.stereotype.Service
public class Service {

	@Autowired
	Repository repo;

	public void add(Student s) {
		repo.save(s);
	}


	public List<Student> getAll() {
		try {
			Thread.sleep(4000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return repo.findAll();
	}

	@Cacheable(cacheNames = "student-cache", key = "'s'+ #id")
	public Student getById(int id) {
		try {
			Thread.sleep(4000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return repo.findById(id).orElse(null);
	}

	public List<Student> getByAge(int a) {
		return repo.findByAge(a);
	}

	public List<Student> getByName(String name) {
		return repo.findByName(name);
	}

	public void update(Student s) {
		repo.save(s);
	}

	public void delete(int id) {
		repo.deleteById(id);
	}

	public void deleteAll() {
		repo.deleteAll();
	}

	public void deleteName(String n) {
		repo.deleteByName(n);
	}
}

package com.example.jfs_jwt.repository;

import com.example.jfs_jwt.model.Course;
import org.springframework.data.repository.CrudRepository;

public interface CourseRepository extends CrudRepository<Course, Integer> {
}

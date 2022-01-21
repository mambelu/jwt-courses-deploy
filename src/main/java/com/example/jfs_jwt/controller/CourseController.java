package com.example.jfs_jwt.controller;

import com.example.jfs_jwt.model.Course;
import com.example.jfs_jwt.service.CourseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class CourseController {
    final CourseService courseService;

    public CourseController(@Autowired CourseService courseService) {
        this.courseService = courseService;
    }

//    get all courses
    @CrossOrigin("*")
    @GetMapping("/api/courses")
    public List<Course> all(@RequestHeader(value = "Authorization") String authToken){
        System.out.println(authToken);
        String token = authToken.substring(7);
        System.out.println(token);
        return courseService.all();

    }

//    save a course
    @PostMapping("/api/courses")
    public void save(@RequestBody Course course){
        courseService.save(course);
    }

//    delete a course
    @DeleteMapping("/api/courses/{courseId}")
    public void delete(@PathVariable String courseId){
        courseService.delete(courseId);
    }


}

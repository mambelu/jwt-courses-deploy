package com.example.jfs_jwt.service;
import com.example.jfs_jwt.model.Course;
import com.example.jfs_jwt.repository.CourseRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service
public class CourseServiceImpl
        implements CourseService
{

    final CourseRepository courseRepository;

    public CourseServiceImpl(@Autowired CourseRepository courseRepository) {
        this.courseRepository = courseRepository;
    }

    @Override
    public List<Course> all()
    {
        List<Course> result = new ArrayList<>();
        courseRepository.findAll().forEach( result::add );
        return result;
    }

    @Override
    public void save( Course course )
    {
        courseRepository.save( course );
    }

    @Override
    public void delete( Integer courseId )
    {
        courseRepository.deleteById( courseId );
    }
}


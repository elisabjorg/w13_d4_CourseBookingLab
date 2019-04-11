package com.codeclan.example.CourseBookingSystem.repositories.CourseRepository;

import com.codeclan.example.CourseBookingSystem.models.Course;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;


public interface CourseRepository extends JpaRepository <Course, Long>, CourseRepositoryCustom {
    List<Course> findCoursesByStarRating(int starRating);

    List<Course> getAllCoursesByCustomerId(Long id);
}

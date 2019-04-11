package com.codeclan.example.CourseBookingSystem.controllers;


import com.codeclan.example.CourseBookingSystem.models.Course;
import com.codeclan.example.CourseBookingSystem.repositories.BookingRepository.BookingRepository;
import com.codeclan.example.CourseBookingSystem.repositories.CourseRepository.CourseRepository;
import com.codeclan.example.CourseBookingSystem.repositories.CustomerRepository.CustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value = "/courses")
public class CourseController {

    @Autowired
    CourseRepository courseRepository;

    @Autowired
    BookingRepository bookingRepository;

    @Autowired
    CustomerRepository customerRepository;

    @GetMapping(value = "/ratings/{starRating}")
    public List<Course> getCourseByStarRating(@PathVariable int starRating) {
        return courseRepository.findCoursesByStarRating(starRating);
    }

    @GetMapping(value = "/customers/{id}")
    public List<Course> getCourseByCustomerId(@PathVariable Long id) {
        return courseRepository.getAllCoursesByCustomerId(id);
    }
}

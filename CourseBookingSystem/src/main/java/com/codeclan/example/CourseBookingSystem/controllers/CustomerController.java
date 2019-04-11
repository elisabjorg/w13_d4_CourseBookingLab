package com.codeclan.example.CourseBookingSystem.controllers;


import com.codeclan.example.CourseBookingSystem.models.Customer;
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
@RequestMapping(value = "/customers")
public class CustomerController {

    @Autowired
    CustomerRepository customerRepository;

    @Autowired
    CourseRepository courseRepository;

    @Autowired
    BookingRepository bookingRepository;

    @GetMapping(value = "/courses/{id}")
    public List<Customer> getCustomerByCourseId(@PathVariable Long id){
        return customerRepository.getAllCustomersByCourseId(id);
    }

}

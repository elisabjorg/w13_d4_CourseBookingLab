package com.codeclan.example.CourseBookingSystem.repositories.CustomerRepository;

import com.codeclan.example.CourseBookingSystem.models.Customer;

import java.util.List;

public interface CustomerRepositoryCustom {
    public List<Customer> getAllCustomersByCourseId(Long id);
    public List<Customer> getAllCustomersByTownAndCourseId(String townName, Long id);
}

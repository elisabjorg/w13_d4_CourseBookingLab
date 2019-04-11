package com.codeclan.example.CourseBookingSystem.repositories.CustomerRepository;

import com.codeclan.example.CourseBookingSystem.models.Customer;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface CustomerRepository extends JpaRepository <Customer, Long>, CustomerRepositoryCustom {
    public List<Customer> getAllCustomersByCourseId(Long id);
    public List<Customer> getAllCustomersByTownAndCourseId(String townName, Long id);
}

package com.codeclan.example.CourseBookingSystem;

import com.codeclan.example.CourseBookingSystem.models.Booking;
import com.codeclan.example.CourseBookingSystem.models.Course;
import com.codeclan.example.CourseBookingSystem.models.Customer;
import com.codeclan.example.CourseBookingSystem.repositories.BookingRepository.BookingRepository;
import com.codeclan.example.CourseBookingSystem.repositories.CourseRepository.CourseRepository;
import com.codeclan.example.CourseBookingSystem.repositories.CustomerRepository.CustomerRepository;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

import static org.junit.Assert.assertEquals;

@RunWith(SpringRunner.class)
@SpringBootTest
public class CourseBookingSystemApplicationTests {

	@Test
	public void contextLoads() {
	}

	@Autowired
	BookingRepository bookingRepository;

	@Autowired
	CourseRepository courseRepository;

	@Autowired
	CustomerRepository customerRepository;

	@Test
	public void canGetCoursesByStarRating() {
		List<Course> found = courseRepository.findCoursesByStarRating(5);
		assertEquals(1, found.size());
		assertEquals("Elf Catching Course", found.get(0).getName());

	}

	@Test
	public void canGetCustomersByCourseId() {
		List<Customer> found = customerRepository.getAllCustomersByCourseId(1L);
		assertEquals(1, found.size());
	}

	@Test
	public void canGetAllCoursesByCustomerId() {
		List<Course> found = courseRepository.getAllCoursesByCustomerId(1L);
		assertEquals(1, found.size());
	}

	@Test
	public void canGetBookingByDate() {
		List<Booking> found = bookingRepository.findBookingByDate("11-04-2019");
		assertEquals(1, found.size());
		assertEquals("11-04-2019", found.get(0).getDate());
	}



}
package com.codeclan.example.CourseBookingSystem.repositories.CourseRepository;

import com.codeclan.example.CourseBookingSystem.models.Course;
import org.hibernate.Criteria;
import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.criterion.Restrictions;
import org.springframework.beans.factory.annotation.Autowired;

import javax.persistence.EntityManager;
import javax.transaction.Transactional;
import java.util.List;

public class CourseRepositoryImpl implements CourseRepositoryCustom {

    @Autowired
    EntityManager entityManager;

    @Transactional

    public List<Course> getAllCoursesByCustomerId(Long id) {
      List<Course> result = null;

      Session session = entityManager.unwrap(Session.class);
      try {
          Criteria cr = session.createCriteria(Course.class);
          cr.createAlias("bookings", "bookings");
          cr.add(Restrictions.eq("bookings.customer.id", id));
          result = cr.list();
      } catch (HibernateException ex) {
          ex.printStackTrace();
      } finally {
          session.close();
      }
      return result;
    }

}

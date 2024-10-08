package com.course.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.course.entity.Course;

@Repository
public interface CourseRepository extends JpaRepository<Course, Integer> {
    Optional<Course> findById(Integer id);
}


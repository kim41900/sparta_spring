package com.sparta.week2.domain;

import org.springframework.data.jpa.repository.JpaRepository;

public interface CourseRepository extends JpaRepository<Course, Long> {
}//JpaRepository의 기능을 를가져와서 CourseRepository에 쓸거야<Course, Long>
// 자료형이 Long이다.


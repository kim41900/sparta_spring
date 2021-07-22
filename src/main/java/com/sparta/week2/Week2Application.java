package com.sparta.week2;

import com.sparta.week2.domain.Course;
import com.sparta.week2.domain.CourseRepository;
import com.sparta.week2.domain.CourseRequestDto;
import com.sparta.week2.service.CourseService;
import org.hibernate.sql.Select;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

import java.util.List;

@EnableJpaAuditing //이걸넣어줘야 즉시수정댐
@SpringBootApplication
public class Week2Application {

    public static void main(String[] args) {

        SpringApplication.run(Week2Application.class, args);
    }


}

package com.tachla.springboot.learnjpaandhebernate.course;

import com.tachla.springboot.learnjpaandhebernate.course.Course;
import com.tachla.springboot.learnjpaandhebernate.course.jdbc.CourseJdbcRepository;
import com.tachla.springboot.learnjpaandhebernate.course.jpa.CourseJpaRepository;
import com.tachla.springboot.learnjpaandhebernate.course.springdatajpa.CourseSpringDataJpaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class CourseJdbCommandLineRunner  implements CommandLineRunner {

  //  @Autowired
//    private CourseJdbcRepository repository;

//    @Autowired
//    private CourseJpaRepository repository;

    @Autowired
    private CourseSpringDataJpaRepository repository;

    @Override
    public void run(String... args) throws Exception {
//        repository.insert(Course.builder()
//                .id(1)
//                .name("tachla1")
//                .author("auttachla").build());
//        repository.insert(Course.builder()
//                .id(2)
//                .name("tachla2")
//                .author("auttachla").build());
//        repository.insert(Course.builder()
//                .id(3)
//                .name("tachla3")
//                .author("auttachla").build());
        repository.save(Course.builder()
                .id(1l)
                .name("tachla1")
                .author("auttachla").build());
        repository.save(Course.builder()
                .id(2l)
                .name("tachla2")
                .author("auttachla").build());
        repository.save(Course.builder()
                .id(3l)
                .name("tachla3")
                .author("auttachla").build());

        repository.deleteById(2l);
        System.out.println("select = "+repository.findById(1l));
        //System.out.println("select = "+repository.findById(2l));
        System.out.println("select = "+repository.findById(3l));
        System.out.println("select = "+repository.findAll());
        System.out.println("select with name = "+repository.findByName("tachla3"));
        System.out.println("select with author = "+repository.findByAuthor("auttachla"));
        System.out.println("select = "+repository.findByAuthor(""));
    }
}

package io.springboot.iss.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import io.springboot.iss.Students;

public interface StudentsRepository extends JpaRepository<Students, Long> {

}

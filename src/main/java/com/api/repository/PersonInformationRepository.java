package com.api.repository;

import com.api.entity.Person;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface PersonInformationRepository extends JpaRepository<Person, Integer> {

    List<Person> findAllByGender(String gender);
}

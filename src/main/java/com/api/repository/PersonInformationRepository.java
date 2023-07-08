package com.api.repository;

import com.api.entity.Person;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PersonInformationRepository extends JpaRepository<Person, Integer> {

}

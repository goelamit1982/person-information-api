package com.api.service;

import com.api.dto.PersonInformationDto;
import com.api.entity.Person;
import com.api.repository.PersonInformationRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PersonInformationService {

    private final PersonInformationRepository personInformationRepository;

    @Autowired
    public PersonInformationService(PersonInformationRepository personInformationRepository) {
        this.personInformationRepository = personInformationRepository;
    }

    public List<Person> getAllPersons(){
       List<Person> personList = personInformationRepository.findAll();
       return personList;
    }

    public List<Person> getAllPersons(String gender){
        List<Person> personList = personInformationRepository.findAllByGender(gender);
        return personList;
    }

    public PersonInformationDto saveEmployee(PersonInformationDto personInformationDto) {
        Person person = new Person();
        person.setName(personInformationDto.getUserName());
        person.setAge(personInformationDto.getAge());
        person.setEmail(personInformationDto.getEmail());
        person.setGender(personInformationDto.getGender());
        personInformationRepository.save(person);
        return personInformationDto;
    }
}

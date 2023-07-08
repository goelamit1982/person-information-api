package com.api.controller;

import java.util.List;

import com.api.InvalidRequestException;
import com.api.dto.PersonInformationDto;
import com.api.entity.Person;
import com.api.service.PersonInformationService;
import com.api.utils.PersonInformationUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;

@RestController
@RequestMapping("/persons/v1/")
public class PersonInformationController {

    private final PersonInformationService personInformationService;

    @Autowired
    public PersonInformationController(PersonInformationService personInformationService) {
        this.personInformationService = personInformationService;
    }

    @GetMapping("/all")
    public List<Person> retrieveAlls() {
        return personInformationService.getAllPersons();
    }

    @GetMapping("/all/{gender}")
    public List<Person> retrieveUsingGender(@PathVariable String gender) {
        return personInformationService.getAllPersons(gender);
    }



    @PostMapping(value = "/save",  produces = MediaType.APPLICATION_JSON_VALUE,
            consumes = MediaType.APPLICATION_JSON_VALUE)
    public PersonInformationDto saveEmployee(@Valid @RequestBody PersonInformationDto personInformationDto) {
        if (!PersonInformationUtils.isValid(personInformationDto)) {
            throw new InvalidRequestException("Not a valid request payload");
        }

        return  personInformationService.saveEmployee(personInformationDto);
    }

}

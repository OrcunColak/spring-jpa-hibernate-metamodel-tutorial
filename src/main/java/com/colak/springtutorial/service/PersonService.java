package com.colak.springtutorial.service;

import java.util.List;

import com.colak.springtutorial.model.Person;
import com.colak.springtutorial.model.PersonRecord;
import com.colak.springtutorial.repository.PersonRepository;
import org.hibernate.query.Order;
import org.hibernate.query.Page;
import org.springframework.stereotype.Service;


@Service
public record PersonService(PersonRepository personRepository) {

    public List<Person> searchByParams(String name, Integer age) {
        return personRepository.searchByParams(name, age);
    }


    public List<Person> findPersonsByAge(Integer age) {
        return personRepository.findPersonsByAge(age);
    }


    public Person findPersonByName(String name){
        return personRepository.findPersonByName(name);
    }


    public List<Person> findPersonsByNamePaginated(String name){
        return personRepository.findPersonsByNamePaginated(name);
    }


    public String getPersonNameByAge(Integer age){
        return personRepository.getPersonNameByAge(age);
    }


    public Object[] getPersonAttributesByName(String name){
        return personRepository.getPersonAttributesByName(name);
    }


    public List<PersonRecord> getPersonRecordsByName(String name){
        return personRepository.getPersonRecordsByName(name);
    }

}

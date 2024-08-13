package com.colak.springtutorial.model;

import org.hibernate.annotations.processing.CheckHQL;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.NamedQuery;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
@CheckHQL // validate the query at compile time
@NamedQuery(name = "#findByName",
        query = "select person from Person person where person.name = :name")
public class Person {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private Long id;
    private String name;
    private Integer age;
}
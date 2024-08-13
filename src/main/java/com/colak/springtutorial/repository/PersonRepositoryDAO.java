package com.colak.springtutorial.repository;


import java.util.List;

import com.colak.springtutorial.model.Person;
import com.colak.springtutorial.model.PersonRecord;
import org.hibernate.annotations.processing.Find;
import org.hibernate.annotations.processing.HQL;
import org.hibernate.annotations.processing.SQL;
import org.hibernate.query.Order;
import org.hibernate.query.Page;


public interface PersonRepositoryDAO {

    @Find
    List<Person> searchByParams(String name, Integer age);

    @SQL("SELECT * FROM Person p WHERE p.age = :age")
    List<Person> findPersonsByAge(Integer age);

    @HQL("where name = :name")
    Person findPersonByName(String name);

    @HQL("where name = :name")
    List<Person> findPersonsByNamePaginated(String name,
                                            Page page, Order<? super Person>... order);

    @HQL("select name from Person where age = :age")
    String getPersonNameByAge(Integer age);

    @HQL("select name, age from Person where name = :name")
    Object[] getPersonAttributesByName(String name);

    @HQL("select name, age from Person where name = :name")
    List<PersonRecord> getPersonRecordsByName(String name);
}

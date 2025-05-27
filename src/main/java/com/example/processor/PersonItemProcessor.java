package com.example.processor;

import com.example.model.Person;
import org.springframework.batch.item.ItemProcessor;

public class PersonItemProcessor implements ItemProcessor<Person, Person> {
    @Override
    public Person process(Person person) throws Exception {
        return new Person(
                person.getFirstName().toUpperCase(),
                person.getLastName().toUpperCase()
        );
    }
}
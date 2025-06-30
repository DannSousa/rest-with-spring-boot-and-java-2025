package com.dannsousa;

import com.dannsousa.model.Person;
import org.springframework.stereotype.Service;

import java.util.concurrent.atomic.AtomicLong;
import java.util.logging.Logger;

@Service
public class PersonServices {

    private final AtomicLong counter = new AtomicLong();
    private Logger logger = Logger.getLogger(PersonServices.class.getName());

    public Person findById(String id){
        logger.info("Finding one person");

        Person person = new Person();
        person.setId(counter.incrementAndGet());
        person.setFirstName("Daniel");
        person.setLastName("Sousa");
        person.setAddress("Taboão da Serra - São Paulo");
        person.setGender("Male");
        return person;
    }
}

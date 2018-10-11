package com.wolfman.micro.feign.api.hystrix;

import com.wolfman.micro.feign.api.domain.Person;
import com.wolfman.micro.feign.api.service.PersonService;

import java.util.Collection;
import java.util.Collections;

/**
 * {@link PersonService} Fallback 实现
 */
public class PersonServiceFallback implements PersonService {

    @Override
    public boolean save(Person person) {
        return false;
    }

    @Override
    public Collection<Person> findAll() {
        return Collections.emptyList();
    }

}

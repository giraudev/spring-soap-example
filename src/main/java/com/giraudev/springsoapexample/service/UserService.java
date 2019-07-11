package com.giraudev.springsoapexample.service;

import com.giraudev.spring_soap_example.User;
import org.springframework.stereotype.Service;

import javax.annotation.PostConstruct;
import java.util.HashMap;
import java.util.Map;

@Service
public class UserService {

    private static final Map<String, User> users = new HashMap<>();

    @PostConstruct
    public void initialize(){

        User peter = new User();
        peter.setName("Peter");
        peter.setEmpId(1111);
        peter.setSalary(1000);

        User claire = new User();
        peter.setName("Claire");
        peter.setEmpId(1113);
        peter.setSalary(12000);

        User mary = new User();
        peter.setName("Mary");
        peter.setEmpId(1117);
        peter.setSalary(17000);

        users.put(peter.getName(), peter);
        users.put(claire.getName(), claire);
        users.put(mary.getName(), mary);
    }

    public User getUsers(String name){
        return users.get(name);
    }
}

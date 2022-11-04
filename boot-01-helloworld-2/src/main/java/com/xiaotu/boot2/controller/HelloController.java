package com.xiaotu.boot2.controller;

import com.xiaotu.boot2.bean.Person;
import lombok.SneakyThrows;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.io.*;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;

@RestController
public class HelloController {

    @Autowired
    private Person person;

    @RequestMapping(value = "/")
    public Person hello(){
        return person;
    }

    @RequestMapping(value = "/serial")
    public Person to() throws IOException {
         ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(new File("student.json")));
         oos.writeObject(person);
         oos.close();

        return person;
    }



    @RequestMapping(value = "/new")
    public Person hello1() throws IOException, ClassNotFoundException {
        ObjectInputStream objectInputStream = new ObjectInputStream(new FileInputStream(new File("student.json")));
        Person person1 = (Person) objectInputStream.readObject();
        return person1;
    }

}
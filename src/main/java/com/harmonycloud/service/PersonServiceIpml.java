package com.harmonycloud.service;

import com.harmonycloud.bean.Dog;
import com.harmonycloud.bean.Person;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service
public class PersonServiceIpml implements PersonService{

    @Value(value = "${person.name}")
    private  String name;

    @Value(value = "${person.age}")
    private Integer age;

    @Value(value = "${person.list}")
    private List<String> list;

    @Value(value = "${person.birthday}")
    private Date birthday;

    @Value(value = "${person.dog.name}")
    private String dogName;

    @Value(value = "${person.dog.age}")
    private String dagAge;

    @Value(value = "${person.map.v1}")
    private String k1;

    @Value(value = "${person.map.v2}")
    private String k2;

    @Value(value = "${person.sex}")
    private Boolean sex;

    @Override
    public Person getInfo(){
        Person person = new Person();
        person.setAge(age);
        person.setBirthday(birthday);
        person.setList(list);
        person.setName(name);
        person.setSex(sex);
        Dog dog = new Dog();
        dog.setAge(dagAge);
        dog.setName(dogName);
        person.setDog(dog);
        Map<String,Object> map = new HashMap<>();
        map.put(k1,k2);
        person.setMap(map);
        return person;
    }


}

package com.example.demo.service;

import com.example.demo.entity.Person;
import com.example.demo.mapper.PersonMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PersonService {
  @Autowired
  PersonMapper personMapper;
  public void sayHello(){
    System.out.println("hello");
  }
  public Person getById(int id){
    return personMapper.getById(id);
  }
}

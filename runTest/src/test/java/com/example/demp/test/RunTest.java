package com.example.demp.test;

import com.example.demo.mapper.PersonMapper;
import com.example.demo.service.PersonService;
import com.example.demp.TestApplication;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest(classes = TestApplication.class)
@ActiveProfiles("test")
public class RunTest {
  @Autowired
  PersonMapper personMapper;
  @Test
  public void test(){
    System.out.println(personMapper.getById(1));
    Assert.assertEquals(1,1);
  }
}

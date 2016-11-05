package com.dawnpro.springBootDemo;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.SpringApplicationConfiguration;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.dawnpro.Application;
import com.dawnpro.demo.dao.UserDao;
import com.dawnpro.demo.entity.User;


@RunWith(SpringJUnit4ClassRunner.class)  
@SpringApplicationConfiguration(classes = {Application.class})   
@ActiveProfiles(value="dev")  
public class AppTest {
	@Autowired  
    private UserDao userDao;  
      
    @Test  
    public void testInsert(){  
        User user = new User();  
        user.setUserName("张三");  
        user.setAge(23);  
        userDao.save(user);  
        System.out.println("插入用户信息"+user.getUserName());  
    }  
}

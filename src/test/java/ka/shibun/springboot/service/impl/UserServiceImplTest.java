package ka.shibun.springboot.service.impl;

import ka.shibun.springboot.SpringBootApp;
import ka.shibun.springboot.domain.User;
import ka.shibun.springboot.service.IUserService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import static org.junit.Assert.*;

@RunWith(SpringRunner.class)
@SpringBootTest(classes = SpringBootApp.class)
public class UserServiceImplTest {

    @Autowired
    private IUserService userService;

    //测试查询
    @Test
    public void testFind() throws Exception{
        User user = userService.selectById(1L);
    }

}
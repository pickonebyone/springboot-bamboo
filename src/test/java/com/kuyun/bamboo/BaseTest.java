package com.kuyun.bamboo;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

/**
 * Created by songzj on 2017/3/23.
 */
@RunWith(SpringRunner.class)
@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.NONE)
public class BaseTest {

    @Before
    public void before() {
        System.out.println("before");
    }


    @Test
    public void test(){System.out.println("test");}
}

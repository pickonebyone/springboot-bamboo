package com.kuyun.bamboo.job;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.test.context.TestComponent;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

/**
 * Created by songzj on 2017/4/14.
 */
@Component
@TestComponent //测试的时候你就不要执行了
public class SchedulerManager {

    private Logger logger = LoggerFactory.getLogger(SchedulerManager.class);

    @Scheduled(fixedRate = 1000L)
    public void print() {
        logger.info("I Am Running!!!");
    }
}

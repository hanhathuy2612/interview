package com.example.demointerview.test;

import lombok.extern.slf4j.Slf4j;
import org.springframework.context.ApplicationContext;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

@Slf4j(topic = "Test Main")
@RestController
public class TestMain {
    private final ApplicationContext applicationContext;
    private List<MyBean> myBeans;

    public TestMain(ApplicationContext applicationContext) {
        this.applicationContext = applicationContext;
        initBeans();
    }

    private void initBeans() {
        myBeans = new ArrayList<>();

        Map<String, Object> map = applicationContext.getBeansWithAnnotation(MyAnnotation.class);
        for (Map.Entry<String, Object> entry : map.entrySet()) {
            if (entry.getValue() instanceof MyBean myBean) {
                myBeans.add(myBean);
            }
        }
    }

    @GetMapping("send")
    public void sendBean() {
        for (MyBean myBean : myBeans) {
            myBean.sendName();
        }
    }
}

package com.kaida.test;

import com.kaida.entity.Provider;
import com.kaida.service.ProviderService;
import org.apache.log4j.Logger;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.List;

public class ProviderTest {
    private Logger logger = Logger.getLogger(ProviderTest.class);

    @Test
    public void selectProvider() {
        ApplicationContext context = new ClassPathXmlApplicationContext("spring-mybatis-config.xml");
        ProviderService providerService = (ProviderService) context.getBean("providerService");
        List<Provider> providers = providerService.selectProvider();
        for (Provider provider : providers) {
            logger.debug(provider);
        }
    }
}

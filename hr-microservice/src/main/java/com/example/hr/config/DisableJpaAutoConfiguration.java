package com.example.hr.config;

import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.boot.autoconfigure.jdbc.DataSourceTransactionManagerAutoConfiguration;
import org.springframework.boot.autoconfigure.orm.jpa.HibernateJpaAutoConfiguration;
import org.springframework.context.annotation.Configuration;

@Configuration
@EnableAutoConfiguration(
   exclude = {
		   DataSourceAutoConfiguration.class,
		   DataSourceTransactionManagerAutoConfiguration.class,
		   HibernateJpaAutoConfiguration.class
   }
)
@ConditionalOnProperty(name="persistenceStrategy", havingValue = "mongodb")
public class DisableJpaAutoConfiguration {

}

package com.xd.conf;

import com.xd.domain.Student;
import org.springframework.context.annotation.*;

@ImportResource("classpath:/applicationContext.xml")
@PropertySource("classpath:/config.properties")
@ComponentScan(value = {"com.xd.vo"})
@Configuration
public class SpringConf {

    @Bean
    @Scope("prototype")
    public Student student(){
        return new Student(1002, "王五", 22);
    }

}

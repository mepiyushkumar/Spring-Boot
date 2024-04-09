package Demo;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Component;

@Component
@ComponentScan(basePackages = "Demo") //simmilar to Spring,xml file
public class BeanConfig {

    //Bean method
    //To make this work remove Component
    @Bean
    public Doctor doctor(){
        return new Doctor();
    }

}

package Demo;

import org.springframework.beans.factory.BeanNameAware;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;

// making it component
//@Component
public class Doctor implements Staff, BeanNameAware {


    public void assist(){
        System.out.println("Doctor is assisting");
    }


    @Override
    public void setBeanName(String s) {
        System.out.println("Set Bean Aware called");
    }

    @PostConstruct
    public void postConstruct(){
        System.out.println("Post Construct method called");
    }
}

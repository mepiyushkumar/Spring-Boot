package Demo;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.*;

public class Main {
    public static void main(String args[]){
        //using ClassPathXmlApplicationContext class
        //ApplicationContext context = new ClassPathXmlApplicationContext("Spring.xml");

        ApplicationContext context = new AnnotationConfigApplicationContext(BeanConfig.class);

        Doctor doctor = context.getBean(Doctor.class);

        doctor.assist();

//        Nurse nurse = context.getBean(Nurse.class);
//
//        nurse.setQualification("MBBS");
//        System.out.println(nurse.getQualification());
//
//        Nurse nurse1 = context.getBean(Nurse.class);
//        System.out.println(nurse1.getQualification());



    }
}

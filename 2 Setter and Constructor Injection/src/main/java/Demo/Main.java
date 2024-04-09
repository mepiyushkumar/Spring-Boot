package Demo;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.*;

public class Main {
    public static void main(String args[]){
        //using ClassPathXmlApplicationContext class
        ApplicationContext context = new ClassPathXmlApplicationContext("Spring.xml");

        Doctor doctor = context.getBean(Doctor.class);

        doctor.assist();
        System.out.println(doctor.getQualifacation());

        Nurse nurse = context.getBean(Nurse.class);
        nurse.assist();

        //via interface implemetation
        Staff staff = context.getBean(Doctor.class);
        staff.assist();
        Staff staff1 = context.getBean(Nurse.class);
        staff1.assist();

        //via constructor
        System.out.println(nurse.getQualification());

    }
}

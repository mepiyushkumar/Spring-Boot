package Demo;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

//making it component
@Component
//@Scope(scopeName = "singleton") default
@Scope(scopeName = "prototype")
public class Nurse implements Staff{

    @Override
    public String toString() {
        return "Doctor{" + "qualifaction="+Qualification+"}";
    }

    private String Qualification;


    public void assist(){
        System.out.println("Nurse is assisting");
    }

    public String getQualification() {
        return Qualification;
    }

    public void setQualification(String qualification) {
        Qualification = qualification;
    }
}

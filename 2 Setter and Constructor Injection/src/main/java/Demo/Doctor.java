package Demo;

public class Doctor implements Staff{

    //Qualification qualification;
    private String qualifacation;



    public void assist(){
        System.out.println("Doctor is assisting");
    }

    public String getQualifacation() {
        return qualifacation;
    }

    public void setQualifacation(String qualifacation) {
        this.qualifacation = qualifacation;
    }
}

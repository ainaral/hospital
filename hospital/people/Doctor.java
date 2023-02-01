
package fi.metropolia.hospital.people;

public class Doctor extends Person {
    
    private String title = "unknown";
    private String specialization = "unknown";
    
    public Doctor(){
        super("Name", "Doctor");
    }
    
    public Doctor(String title, String specialization){
        super("name", "doctor"); 
        this.title = title;
        this.specialization = specialization;
    }
    
    
    @Override
    public String getInfo() {
        return super.getInfo() + "\n" +
                "title: " + this.title + "\n" +
                "Specialization: " + this.specialization;
    }
}

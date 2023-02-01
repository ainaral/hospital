
package fi.metropolia.hospital.people;

public class Patient extends Person {
    
    private int bloodPressure = 118;
    private String treatment = "unknown";
    
    //public Patient(){
     //   super("jose", "patient");
    //}
    
    public Patient(int bloodPressure, String treatment){
        super("jose", " Patient");
        this.bloodPressure = bloodPressure;
        this.treatment = treatment;
    }
    
   
    @Override
    public String getInfo() {
        return super.getInfo() + "\n" +
                "Blood Pressure: " + this.bloodPressure + "\n" +
                "Treatment: " + this.treatment + "\n";
    }
}

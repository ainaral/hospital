
package fi.metropolia.hospital.hospital;
import fi.metropolia.hospital.people.Patient;


import java.util.ArrayList;

public class PatientQueue {
    private ArrayList<Patient> patients = new ArrayList();
    private String hospital;
    private String department;
    private String doctorInCharge;
    
    public PatientQueue(String hospital, String department, String doctorInCharge){
        this.hospital = hospital;
        this.department = department;
        this.doctorInCharge = doctorInCharge;
    }
    
    public PatientQueue(){
        super();
    }
    
    public void addPatient(Patient patient){
        this.patients.add(patient);
    }
    
    public void printInformation() {
        System.out.println("Hospital: " + this.hospital + "\n" +
        "Department: " + this.department + "\n" +
        "Doctor in Charge: " + this.doctorInCharge);
        
        System.out.println("Patients:");
        this.listPatients();
    }
    
    public void listPatients() {
        for(Patient patient : this.patients) {
            System.out.println(patient.getInfo());
        }
        
        this.patientCount();
    }
    
    public void patientCount() {
        System.out.println("Total number of patients in patient's queue: " + this.patients.size());
    }
}

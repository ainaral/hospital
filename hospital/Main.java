
package fi.metropolia.hospital;

import fi.metropolia.hospital.hospital.PatientQueue;
import fi.metropolia.hospital.people.Person;
import fi.metropolia.hospital.people.Patient;
import fi.metropolia.hospital.people.Doctor;


public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Person personObject = new Person("???", "patient");
        System.out.println(personObject.getInfo());
        
        Patient patientObject = new Patient(140, "medicina");
        System.out.println(patientObject.getInfo());
 
        //Patient(int bloodPressure, String treatment)
        Patient patient1 = new Patient(90, "cirugía");
        System.out.println(patient1.getInfo());
        
        Patient patient2 = new Patient(98, "broken bones");
        System.out.println(patient2.getInfo());
        
        Patient patient3 = new Patient(110, "ojos");
        System.out.println(patient3.getInfo());
        
        Patient patient4 = new Patient(95, "heart disease");
        System.out.println(patient4.getInfo());
        
        
        //Person(String name, String classification)
        Person person2 = new Person("Carlos", "Doctor");
        System.out.println(person2.getInfo());
        
        Person person1 = new Person("Jose", "Patient");
        System.out.println(person1.getInfo());
        
        //Doctor(String title, String specialization)
        Doctor doctor = new Doctor("surgeon", "cardiothoraic");
        System.out.println(doctor.getInfo());
        
        Doctor doctor1 = new Doctor("odontologo", "dientes");
        System.out.println(doctor1.getInfo());
        
        
        //PatientQueue(String hospital, String department, String doctorInCharge)
        PatientQueue patientQueue = new PatientQueue("HUS", "Surgery", "Carlos");
        
        patientQueue.addPatient(new Patient(123, "eyes operation"));
        patientQueue.addPatient(patient1);
        patientQueue.addPatient(patient2);
        patientQueue.addPatient(patient3);
        patientQueue.addPatient(patient4);
        
        //Patient patient1 = new Patient();
        //patient1.getInfo();
        doctor.getInfo();
        
        patientQueue.listPatients();
        patientQueue.patientCount();
        patientQueue.printInformation();
    }
    
}

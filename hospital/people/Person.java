/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fi.metropolia.hospital.people;

/**
 *
 * @author larra
 */
public class Person {
    
    private String name = "unknown";
    private String classification = "unknown";
    
    //constructor method
    public Person(String name, String classification){
        this.name = name;
        this.classification = classification;
    }
    
    
    public String getInfo() {
        return "Name:" + this.name + ", Classification:" + this.classification;
    }
    
}

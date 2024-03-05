package com.example.memberdemands.entity;
import java.util.Map;

public class Member {

    private Long id;
    private String eid;
    private String firstName;
    private String lastName;
    private String doj;
    private String level;
    private String location;
    private int overallExp;
    private String status;
    private Map<String, Integer> skills;
    
    //Constructor
    
    public Member(Long id, String eid, String firstName, String lastName, String doj, String level,
            String location, int overallExp, String status, Map<String, Integer> skills) 
    {
    	
	  this.id = id;
	  this.eid = eid;
	  this.firstName = firstName;
	  this.lastName = lastName;
	  this.doj = doj;
	  this.level = level;
	  this.location = location;
	  this.overallExp = overallExp;
	  this.status = status;
	  this.skills = skills;
	  
    }


    // Getter for id
    public Long getId() {
        return id;
    }

    // Setter for id
    public void setId(Long id) {
        this.id = id;
    }

    // Getter for eid
    public String getEid() {
        return eid;
    }

    // Setter for eid
    public void setEid(String eid) {
        this.eid = eid;
    }

    // Getter for firstName
    public String getFirstName() {
        return firstName;
    }

    // Setter for firstName
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    // Getter for lastName
    public String getLastName() {
        return lastName;
    }

    // Setter for lastName
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    // Getter for doj
    public String getDoj() {
        return doj;
    }

    // Setter for doj
    public void setDoj(String doj) {
        this.doj = doj;
    }

    // Getter for level
    public String getLevel() {
        return level;
    }

    // Setter for level
    public void setLevel(String level) {
        this.level = level;
    }

    // Getter for location
    public String getLocation() {
        return location;
    }

    // Setter for location
    public void setLocation(String location) {
        this.location = location;
    }

    // Getter for overallExp
    public int getOverallExp() {
        return overallExp;
    }

    // Setter for overallExp
    public void setOverallExp(int overallExp) {
        this.overallExp = overallExp;
    }

    // Getter for status
    public String getStatus() {
        return status;
    }

    // Setter for status
    public void setStatus(String status) {
        this.status = status;
    }

    // Getter for skills
    public Map<String, Integer> getSkills() {
        return skills;
    }

    // Setter for skills
    public void setSkills(Map<String, Integer> skills) {
        this.skills = skills;
    }
}

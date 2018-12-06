package hari.edu.hibernate.pojo;

import java.util.Set;

public class Employer {

    int employerId;
    String employerName;
    Set<Contractor> contractors;

    public Employer() {
    }

    public Employer(int employerId, String employerName) {
        this.employerId = employerId;
        this.employerName = employerName;
    }

    public int getEmployerId() {
        return employerId;
    }

    public void setEmployerId(int employerId) {
        this.employerId = employerId;
    }

    public String getEmployerName() {
        return employerName;
    }

    public void setEmployerName(String employerName) {
        this.employerName = employerName;
    }

    public Set<Contractor> getContractors() {
        return contractors;
    }

    public void setContractors(Set<Contractor> contractors) {
        this.contractors = contractors;
    }
}

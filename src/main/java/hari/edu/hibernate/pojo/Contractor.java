package hari.edu.hibernate.pojo;

import java.util.Set;

public class Contractor {
    int contractorId;
    String contractorName;
    long dailyRate;
    Set<Employer> employers;

    public Contractor() {
    }

    public Contractor(int contractorId, String contractorName, long dailyRate) {
        this.contractorId = contractorId;
        this.contractorName = contractorName;
        this.dailyRate = dailyRate;
    }

    public int getContractorId() {
        return contractorId;
    }

    public void setContractorId(int contractorId) {
        this.contractorId = contractorId;
    }

    public String getContractorName() {
        return contractorName;
    }

    public void setContractorName(String contractorName) {
        this.contractorName = contractorName;
    }

    public long getDailyRate() {
        return dailyRate;
    }

    public void setDailyRate(long dailyRate) {
        this.dailyRate = dailyRate;
    }

    public Set<Employer> getEmployers() {
        return employers;
    }

    public void setEmployers(Set<Employer> employers) {
        this.employers = employers;
    }
}

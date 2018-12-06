package hari.edu.hibernate.pojo;

import javax.persistence.*;

@Entity
/*@DiscriminatorValue(value="contractEmp")*/
@Table(name="contractEmp")
/*@AttributeOverrides({
        @AttributeOverride(name="id",column = @Column(name = "id")),
        @AttributeOverride(name = "name",column = @Column(name = "name"))
})*/
@PrimaryKeyJoinColumn(name = "employeeid" )
public class ContractEmployee extends Employee{
    @Column(name = "dailyRate")
    float dailyRate;
    @Column(name = "contractPeriodInMonths")
    int contractPeriodInMonths;

    public float getDailyRate() {
        return dailyRate;
    }

    public void setDailyRate(float dailyRate) {
        this.dailyRate = dailyRate;
    }

    public int getContractPeriodInMonths() {
        return contractPeriodInMonths;
    }

    public void setContractPeriodInMonths(int contractPeriodInMonths) {
        this.contractPeriodInMonths = contractPeriodInMonths;
    }
}

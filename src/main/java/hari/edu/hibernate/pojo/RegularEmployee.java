package hari.edu.hibernate.pojo;

import javax.persistence.*;

@Entity
/*@DiscriminatorValue(value = "regEmp")*/
@Table(name="regEmp")
/*@AttributeOverrides({
        @AttributeOverride(name="id",column = @Column(name = "id")),
        @AttributeOverride(name = "name",column = @Column(name = "name"))
})*/
@PrimaryKeyJoinColumn(name = "employeeid" )
public class RegularEmployee extends Employee{
    @Column(name="salary")
    float salary;
    @Column (name = "bonus")
    long bonus;

    public float getSalary() {
        return salary;
    }

    public void setSalary(float salary) {
        this.salary = salary;
    }

    public long getBonus() {
        return bonus;
    }

    public void setBonus(long bonus) {
        this.bonus = bonus;
    }
}

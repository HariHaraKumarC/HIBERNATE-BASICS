package hari.edu.hibernate.pojo;

import org.hibernate.annotations.CacheConcurrencyStrategy;

import javax.persistence.*;

@NamedQueries(
        {
                @NamedQuery(
                        name = "findResidentByName",
                        query = "FROM Resident resident WHERE resident.name=:name"
                ),
                @NamedQuery(
                        name = "findResidentById",
                        query = "SELECT resident.id, resident.name FROM Resident resident WHERE resident.id=:id"
                )
        }
)

@Entity
@Table(name = "resident")
@Cacheable
@org.hibernate.annotations.Cache(usage = CacheConcurrencyStrategy.READ_ONLY)
public class Resident {

    @Id
    @GeneratedValue (strategy = GenerationType.AUTO)
    @PrimaryKeyJoinColumn
    int residentId;

    @Column (name = "name")
    String name;

    @OneToOne(targetEntity = Address.class,cascade = CascadeType.ALL)
    Address address;

    public Resident() {
    }

    public Resident(String name, Address address) {
        this.name = name;
        this.address = address;
    }

    public int getResidentId() {
        return residentId;
    }

    public void setResidentId(int residentId) {
        this.residentId = residentId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    @Override
    public String toString() {
        return "Resident{" +
                "residentId=" + residentId +
                ", name='" + name + '\'' +
                ", address=" + address +
                '}';
    }
}

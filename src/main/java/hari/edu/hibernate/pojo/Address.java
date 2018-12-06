package hari.edu.hibernate.pojo;

import org.hibernate.annotations.CacheConcurrencyStrategy;

import javax.persistence.*;

@Entity
@Table(name = "address")
@Cacheable
@org.hibernate.annotations.Cache(usage = CacheConcurrencyStrategy.READ_ONLY)
public class Address {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name="addressId")
    int addressId;

    @Column(name="streetNumber")
    int streetNumber;

    @Column(name="streetName")
    String streetName;

    @Column(name="city")
    String city;

    @Column(name="country")
    String country;

    @Column(name="mailBoxNumber")
    int mailBoxNumber;

    @OneToOne(targetEntity = Resident.class)
    Resident resident;

    public Address() {
    }

    public Address(int streetNumber, String streetName, String city, String country, int mailBoxNumber) {
        this.streetNumber = streetNumber;
        this.streetName = streetName;
        this.city = city;
        this.country = country;
        this.mailBoxNumber = mailBoxNumber;
    }

    public int getAddressId() {
        return addressId;
    }

    public void setAddressId(int addressId) {
        this.addressId = addressId;
    }

    public int getStreetNumber() {
        return streetNumber;
    }

    public void setStreetNumber(int streetNumber) {
        this.streetNumber = streetNumber;
    }

    public String getStreetName() {
        return streetName;
    }

    public void setStreetName(String streetName) {
        this.streetName = streetName;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public int getMailBoxNumber() {
        return mailBoxNumber;
    }

    public void setMailBoxNumber(int mailBoxNumber) {
        this.mailBoxNumber = mailBoxNumber;
    }

    public Resident getResident() {
        return resident;
    }

    public void setResident(Resident resident) {
        this.resident = resident;
    }

    @Override
    public String toString() {
        return "Address{" +
                "addressId=" + addressId +
                ", streetNumber=" + streetNumber +
                ", streetName='" + streetName + '\'' +
                ", city='" + city + '\'' +
                ", country='" + country + '\'' +
                ", mailBoxNumber=" + mailBoxNumber +
                '}';
    }
}

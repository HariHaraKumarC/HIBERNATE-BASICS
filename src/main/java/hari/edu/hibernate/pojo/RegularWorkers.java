package hari.edu.hibernate.pojo;

import javax.persistence.*;

@Entity
@Table(name = "regularWorkers")
public class RegularWorkers {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    int id;

    @Column(name = "name")
    String name;

    @ManyToOne(optional = false)
    @JoinColumn(name = "organisationid" )
    Organisation organisation;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Organisation getOrganisation() {
        return organisation;
    }

    public void setOrganisation(Organisation organisation) {
        this.organisation = organisation;
    }
}

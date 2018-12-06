package hari.edu.hibernate.pojo;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name="organisation")
public class Organisation {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    int id;

    @Column (name = "name")
    String name;

    @OneToMany(mappedBy ="organisation",cascade = CascadeType.ALL)
    @OrderColumn(name="index")
    List<RegularWorkers> regularWorkers;

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

    public List<RegularWorkers> getRegularWorkers() {
        return regularWorkers;
    }

    public void setRegularWorkers(List<RegularWorkers> regularWorkers) {
        this.regularWorkers = regularWorkers;
    }
}

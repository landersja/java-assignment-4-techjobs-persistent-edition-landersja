package org.launchcode.techjobs.persistent.models;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import java.util.List;

@Entity
public class Job extends AbstractEntity{

//    @Id
//    @GeneratedValue

    @ManyToOne
    private Employer employer;

    @ManyToMany
    private List<Skill> skills;

//    private int id;

//    private String name;
//
//    private String employer;
//    private String skills;

    public Job() {
    }

    public Job(Employer anEmployer, List<Skill> someSkills) {
        super();
        this.employer = anEmployer;
        this.skills = someSkills;
    }



    // Getters and setters.



//    public String getName() {
//        return name;
//    }
//
//    public void setName(String name) {
//        this.name = name;
//    }
//
    public Employer getEmployer() {
        return employer;
    }
//
    public void setEmployer(Employer employer) {
        this.employer = employer;
    }
//
//    public String getSkills() {
//        return skills;
//    }
//
    public void setSkills(List<Skill> skills) {
        this.skills = skills;
    }

    public Iterable<Skill> getSkills(){
    return skills;
    }
}
//}

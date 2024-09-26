package org.example.manytomanye23a.model;

import jakarta.persistence.*;

import java.util.ArrayList;
import java.util.List;

@Entity
public class Discipline {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int disciplineID;
    private String name;

    @ManyToMany
    @JoinTable(
            name = "athdisc",
            joinColumns = @JoinColumn(name = "discid"),
            inverseJoinColumns = @JoinColumn(name = "athlid")
    )
    private List<Athlete> athletes = new ArrayList<Athlete>();

    public Discipline() {
    }

    public Discipline(String name) {
        this.name = name;
    }

    public int getDisciplineID() {
        return disciplineID;
    }

    public void setDisciplineID(int disciplineID) {
        this.disciplineID = disciplineID;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Athlete> getAthletes() {
        return athletes;
    }

    public void setAthletes(List<Athlete> athletes) {
        this.athletes = athletes;
    }

    public void addAthlete(Athlete athlete) {
        athletes.add(athlete);
        athlete.getDisciplines().add(this);
    }

}

package org.example.manytomanye23a.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;

import java.util.ArrayList;
import java.util.List;

@Entity
public class Athlete {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int athleteID;
    private String name;

    @ManyToMany(mappedBy = "athletes")
    @JsonIgnore
    private List<Discipline> disciplines = new ArrayList<>();

    public Athlete() {
    }

    public Athlete(String name) {
        this.name = name;
    }

    public int getAthleteID() {
        return athleteID;
    }

    public void setAthleteID(int athleteID) {
        this.athleteID = athleteID;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Discipline> getDisciplines() {
        return disciplines;
    }

    public void setDisciplines(List<Discipline> disciplines) {
        this.disciplines = disciplines;
    }

    public void addDiscipline(Discipline discipline) {
        disciplines.add(discipline);
        discipline.getAthletes().add(this);
    }

}

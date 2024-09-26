package org.example.manytomanye23a.config;

import org.example.manytomanye23a.model.Athlete;
import org.example.manytomanye23a.model.Discipline;
import org.example.manytomanye23a.repositories.AthleteRepository;
import org.example.manytomanye23a.repositories.DisciplineRepository;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class InitData implements CommandLineRunner {

    @Autowired
    AthleteRepository athleteRepository;

    @Autowired
    DisciplineRepository disciplineRepository;


    @Override
    public void run(String... args) throws Exception {
        Athlete aJan = new Athlete("Jan");
        Athlete aKurt = new Athlete("Kurt");
        Discipline run100 = new Discipline("Run 100");
        Discipline run200 = new Discipline("Run 200");
        Discipline run300 = new Discipline("Run 300");

        athleteRepository.save(aJan);
        athleteRepository.save(aKurt);

        disciplineRepository.save(run100);
        disciplineRepository.save(run200);
        disciplineRepository.save(run300);

        aJan.addDiscipline(run100);
        aJan.addDiscipline(run200);

        aKurt.addDiscipline(run200);
        aKurt.addDiscipline(run300);

        disciplineRepository.save(run100);
        disciplineRepository.save(run200);
        disciplineRepository.save(run300);

    }
}


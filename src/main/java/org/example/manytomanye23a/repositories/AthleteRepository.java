package org.example.manytomanye23a.repositories;

import org.example.manytomanye23a.model.Athlete;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AthleteRepository extends JpaRepository<Athlete,Integer> {
}

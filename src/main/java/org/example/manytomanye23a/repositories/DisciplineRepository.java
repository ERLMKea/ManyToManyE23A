package org.example.manytomanye23a.repositories;

import org.example.manytomanye23a.model.Discipline;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DisciplineRepository extends JpaRepository<Discipline, Integer> {
}


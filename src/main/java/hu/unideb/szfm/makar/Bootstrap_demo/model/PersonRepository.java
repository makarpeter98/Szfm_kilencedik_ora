package hu.unideb.szfm.makar.Bootstrap_demo.model;

import org.springframework.data.jpa.repository.JpaRepository;

public interface PersonRepository extends JpaRepository<Person, Integer> {
}

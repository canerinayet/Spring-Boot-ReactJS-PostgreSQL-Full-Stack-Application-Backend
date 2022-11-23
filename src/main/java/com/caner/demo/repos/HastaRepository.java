package com.caner.demo.repos;
import com.caner.demo.entities.Hasta;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface HastaRepository extends JpaRepository<Hasta, Long> {



}



package com.example.Backend_Traini8_SameerSawale.Repository;

import com.example.Backend_Traini8_SameerSawale.Entity.Center;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CenterRepository extends JpaRepository<Center, Integer> {
}

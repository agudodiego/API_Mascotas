package com.agudodiego.demoApi.repository;

import com.agudodiego.demoApi.model.Mascota;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MascotaRepository extends JpaRepository <Mascota, Integer> {

}

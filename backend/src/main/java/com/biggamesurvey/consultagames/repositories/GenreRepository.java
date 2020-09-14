package com.biggamesurvey.consultagames.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.biggamesurvey.consultagames.entities.Genre;

@Repository
public interface GenreRepository extends JpaRepository<Genre, Long>{

}

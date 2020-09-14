package com.biggamesurvey.consultagames.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.biggamesurvey.consultagames.entities.Genre;

public interface GenreRepository extends JpaRepository<Genre, Long>{

}

package com.biggamesurvey.consultagames.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.biggamesurvey.consultagames.entities.Game;

public interface GameRepository extends JpaRepository<Game, Long>{

}

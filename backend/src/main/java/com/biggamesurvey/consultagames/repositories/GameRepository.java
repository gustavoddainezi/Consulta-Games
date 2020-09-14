package com.biggamesurvey.consultagames.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.biggamesurvey.consultagames.entities.Game;
@Repository
public interface GameRepository extends JpaRepository<Game, Long>{

}

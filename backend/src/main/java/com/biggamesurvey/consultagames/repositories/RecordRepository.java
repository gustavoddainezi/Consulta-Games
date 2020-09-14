package com.biggamesurvey.consultagames.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.biggamesurvey.consultagames.entities.Record;

@Repository
public interface RecordRepository extends JpaRepository<Record, Long>{

}

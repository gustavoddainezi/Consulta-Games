package com.biggamesurvey.consultagames.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.biggamesurvey.consultagames.entities.Record;

public interface RecordRepository extends JpaRepository<Record, Long>{

}

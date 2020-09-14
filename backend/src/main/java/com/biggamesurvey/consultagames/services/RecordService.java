package com.biggamesurvey.consultagames.services;

import java.time.Instant;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.biggamesurvey.consultagames.dto.RecordDTO;
import com.biggamesurvey.consultagames.dto.RecordInsertDTO;
import com.biggamesurvey.consultagames.entities.Game;
import com.biggamesurvey.consultagames.entities.Record;
import com.biggamesurvey.consultagames.repositories.GameRepository;
import com.biggamesurvey.consultagames.repositories.RecordRepository;

@Service
public class RecordService {
	
	@Autowired
	private RecordRepository repository;
	
	@Autowired
	private GameRepository gameRepository;
	
	@Transactional
	public RecordDTO insert(RecordInsertDTO dto) {
		
		Record entity = new Record();
		
		entity.setName(dto.getName());
		entity.setAge(dto.getAge());
		entity.setMoment(Instant.now());
		
		Game game = gameRepository.getOne(dto.getGameId());
		entity.setGame(game);
		
		entity = repository.save(entity);
		return new RecordDTO(entity);
	}
}

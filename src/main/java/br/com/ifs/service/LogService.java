package br.com.ifs.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.ifs.repository.LogRepository;

@Service
public class LogService {
	
	@Autowired
	private LogRepository logRepository;

	public Object getAll() {
		return logRepository.findAll();
	}

	public Object getById(int id) {
		return logRepository.findById(id);
	}
	
	
}

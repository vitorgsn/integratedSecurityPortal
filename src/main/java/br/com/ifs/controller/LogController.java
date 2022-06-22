package br.com.ifs.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import org.springframework.web.bind.annotation.RestController;

import com.fasterxml.jackson.annotation.JsonFormat;

import br.com.ifs.service.LogService;

@RestController
public class LogController {
	
	@Autowired
	private LogService logService;
	
	@GetMapping(value = "/logs")
	public Object getAll() {
		return logService.getAll();
	}
	
    @GetMapping(value = "/log/{id}")
    public Object getById (@JsonFormat @PathVariable int id) {
    	return logService.getById(id);
    }
	
}

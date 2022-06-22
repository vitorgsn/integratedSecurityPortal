package br.com.ifs.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.fasterxml.jackson.annotation.JsonFormat;

import br.com.ifs.model.SistemaModel;
import br.com.ifs.service.SistemaService;

@RestController
@RequestMapping("/api/v1")
public class SistemaController {

	@Autowired
	private SistemaService sistemaService;
	
	@PostMapping(value = "/sistema")
	public Object criarSistema(@RequestBody SistemaModel sistema) {
		return ResponseEntity.status(HttpStatus.CREATED).body(sistemaService.criarSistema(sistema));
	}
	
	@GetMapping(value = "/sistemas")
	public Object getAll() {
		return ResponseEntity.status(HttpStatus.OK).body(sistemaService.getAll());
	}
	
    @GetMapping(value = "/sistema/{id}")
    public Object getById (@JsonFormat @PathVariable int id) {
    	return ResponseEntity.status(HttpStatus.OK).body(sistemaService.getById(id));
    }
    
    @DeleteMapping("sistema/{id}")
    public ResponseEntity<?> deleteById(@PathVariable int id){
    	sistemaService.deleteById(id);
        return ResponseEntity.status(HttpStatus.OK).build();
    }
    
}
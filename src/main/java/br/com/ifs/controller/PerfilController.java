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
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.fasterxml.jackson.annotation.JsonFormat;

import br.com.ifs.model.PerfilModel;
import br.com.ifs.service.PerfilService;

@RestController
@RequestMapping("/api/v1")
public class PerfilController {
	
	@Autowired
	private PerfilService perfilService;
	
	
	@PostMapping(value = "/perfil") 
	public Object criarPerfil (@RequestBody PerfilModel perfil) { 
		return perfilService.criarPerfil(perfil); 
	}
	
	@RequestMapping(value = "/perfil/{id}", method = RequestMethod.POST)
	public Object novoPerfil(@JsonFormat @RequestBody PerfilModel perfil, @PathVariable int id) { 
		perfil.setPerNrId(id); 
		return perfilService.criarPerfil(perfil); 
	}
	
	@GetMapping(value = "/perfis")
	public Object getAll() {
		return perfilService.getAll();
	}
	
    @GetMapping(value = "/perfil/{id}")
    public Object getById (@JsonFormat @PathVariable int id) {
    	return perfilService.getById(id);
    }
	
    @DeleteMapping("perfil/{id}")
    public ResponseEntity<?> deleteById(@PathVariable int id){
    	perfilService.deleteById(id);
        return ResponseEntity.status(HttpStatus.OK).build();
    }
    
}

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
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import br.com.ifs.dto.UsuarioDTO;
import br.com.ifs.service.UsuarioService;

@RestController
@RequestMapping("/api/v1")
public class UsuarioController {
	
	@Autowired
	private UsuarioService usuarioService;

	@PostMapping(value = "/usuario")
	public Object criarUsuario(@RequestBody UsuarioDTO usuario) {
		return usuarioService.criarUsuario(usuario.toUsuario());
	}
	
    @GetMapping(value = "/usuarios")
    public Object getAll() {
        return usuarioService.getAll();
    }
    
    @RequestMapping(value = "/usuario", method = RequestMethod.GET)
	public Object getByLogin (@RequestParam(value="login") String login) { 
		return usuarioService.getByLogin(login); 
	}
    
    @GetMapping(value = "/usuario/{id}")
    public ResponseEntity<Object> getById (@PathVariable int id) {
    	if (usuarioService.getById(id) != null) {
    		return new ResponseEntity<Object>(usuarioService.getById(id), HttpStatus.OK);
    	} else {
    		return new ResponseEntity<Object>(HttpStatus.NO_CONTENT);
    	} 	
    }
    
    @DeleteMapping("usuario/{id}")
    public ResponseEntity<?> deleteById(@PathVariable int id){
    	usuarioService.deleteById(id);
        return ResponseEntity.status(HttpStatus.OK).build();
    }
    
}

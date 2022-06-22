package br.com.ifs.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.fasterxml.jackson.annotation.JsonFormat;

import br.com.ifs.model.ServicoModel;
import br.com.ifs.service.ServicoService;

@RestController
@RequestMapping("/api/v1")
public class ServicoController {
	
	@Autowired
	private ServicoService servicoService;
	
	@PostMapping(value = "/servico")
	public Object criarServico(@RequestBody ServicoModel servico) {
		return servicoService.criarServico(servico);
	}
	
	@GetMapping(value = "/servicos")
	public Object getAll() {
		return servicoService.getAll();
	}
	
    @GetMapping(value = "/servico/{id}")
    public Object getById (@JsonFormat @PathVariable int id) {
    	return servicoService.getById(id);
    }
}

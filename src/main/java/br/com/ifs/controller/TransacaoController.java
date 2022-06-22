package br.com.ifs.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.fasterxml.jackson.annotation.JsonFormat;

import br.com.ifs.model.TransacaoModel;
import br.com.ifs.service.TransacaoService;

@RestController
@RequestMapping("/api/v1")
public class TransacaoController {
	
	@Autowired
	private TransacaoService transacaoService;
	
	@PostMapping(value = "/transacao")
	public Object criarTransacao(@RequestBody TransacaoModel transacao) {
		return transacaoService.criarTransacao(transacao);
	}

	@GetMapping(value = "/transacoes")
	public Object getAll() {
		return transacaoService.getAll();
	}
	
    @GetMapping(value = "/transacao/{id}")
    public Object getById (@JsonFormat @PathVariable int id) {
    	return transacaoService.getById(id);
    }
}

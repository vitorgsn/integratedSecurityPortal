package br.com.ifs.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.ifs.model.TransacaoModel;
import br.com.ifs.repository.TransacaoRepository;

@Service
public class TransacaoService {
	
	@Autowired
	private TransacaoRepository transacaoRepository;
	
	public Object criarTransacao(TransacaoModel transacao) {
		return transacaoRepository.save(transacao);
	}
	
	public Object getAll() {
		return transacaoRepository.findAll();
	}
	
    public Object getById (int id) {
    	return transacaoRepository.findById(id);
    }
}

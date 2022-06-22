package br.com.ifs.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.ifs.model.ServicoModel;
import br.com.ifs.repository.ServicoRepository;

@Service
public class ServicoService {
	
	@Autowired
	private ServicoRepository servicoRepository;
	
	public Object criarServico(ServicoModel servicoModel) {
		return servicoRepository.save(servicoModel);
	}
	
	public Object getAll() {
		return servicoRepository.findAll();
	}

    public Object getById (int id) {
    	return servicoRepository.findById(id);
    }
}

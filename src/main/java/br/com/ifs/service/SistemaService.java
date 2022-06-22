package br.com.ifs.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.ifs.model.SistemaModel;
import br.com.ifs.repository.SistemaRepository;

@Service
public class SistemaService {
	
	@Autowired
	private SistemaRepository sistemaRepository;
	
	public Object criarSistema(SistemaModel sistema) {
		return sistemaRepository.save(sistema);
	}
	
	public Object getAll() {
		return sistemaRepository.findAll();
	}

    public Object getById (int id) {
    	return sistemaRepository.findById(id);
    }

	public void deleteById(int id) {
		sistemaRepository.deleteById(id);
	}
    
    
}

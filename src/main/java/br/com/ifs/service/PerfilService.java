package br.com.ifs.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.ifs.model.PerfilModel;
import br.com.ifs.repository.PerfilRepository;

@Service
public class PerfilService {
	
	@Autowired
	private PerfilRepository perfilRepository;
	
	public Object criarPerfil(PerfilModel perfil) {
		return perfilRepository.save(perfil);
	}
	
	public Object getAll() {
		return perfilRepository.findAll();
	}
	
    public Object getById (int id) {
    	return perfilRepository.findById(id);
    }
    
    public void deleteById(int id) {
    	perfilRepository.deleteById(id);
    }
    
}

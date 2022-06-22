package br.com.ifs.service;


import java.util.ArrayList;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.ifs.dto.UsuarioDTO;
import br.com.ifs.model.UsuarioModel;
import br.com.ifs.repository.UsuarioRepository;

@Service
public class UsuarioService {
	
	@Autowired
	private UsuarioRepository usuarioRepository;
	
	public Object criarUsuario(UsuarioModel usuario) {
		return usuarioRepository.save(usuario);
	}
	
    public List<UsuarioDTO> getAll() {
    	List<UsuarioDTO> l = new ArrayList<>();
    	usuarioRepository.findAll().forEach(item -> {
    		l.add(item.toUsuario());
    	});
        return l;
    }

    public UsuarioDTO getByLogin (String login) {
    	return usuarioRepository.findByUsuTxLogin(login).toUsuario();
    }
    
    public Object getById (int id) {
    	UsuarioDTO user;
    	user = usuarioRepository.findById(id).get().toUsuario();
    	return user;
    }
    
	public void deleteById(int id) {
		usuarioRepository.deleteById(id);
	}
    
}

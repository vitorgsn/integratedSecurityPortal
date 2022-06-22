package br.com.ifs.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import br.com.ifs.model.UsuarioModel;

@Repository
public interface UsuarioRepository extends CrudRepository <UsuarioModel, Integer> {
	
	UsuarioModel findByUsuTxLogin(String login);
}

package br.com.ifs.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import br.com.ifs.model.SistemaModel;

@Repository
public interface SistemaRepository extends CrudRepository <SistemaModel, Integer>{
	
}

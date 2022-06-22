package br.com.ifs.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import br.com.ifs.model.PerfilModel;

@Repository
public interface PerfilRepository extends CrudRepository <PerfilModel, Integer>{

}

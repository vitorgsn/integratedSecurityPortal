package br.com.ifs.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import br.com.ifs.model.ServicoModel;

@Repository
public interface ServicoRepository extends CrudRepository <ServicoModel, Integer>{

}

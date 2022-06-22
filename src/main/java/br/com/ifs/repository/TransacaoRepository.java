package br.com.ifs.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import br.com.ifs.model.TransacaoModel;

@Repository
public interface TransacaoRepository extends CrudRepository<TransacaoModel, Integer>{

}

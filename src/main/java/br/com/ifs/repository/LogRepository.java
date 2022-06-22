package br.com.ifs.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import br.com.ifs.model.LogModel;

@Repository
public interface LogRepository extends CrudRepository<LogModel, Integer>{

}

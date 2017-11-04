package com.programacion2.intranetgrupo2.repository;

import java.util.List;

import org.springframework.dao.DataAccessException;
import org.springframework.data.repository.Repository;

import com.programacion2.intranetgrupo2.model.Curso;

public interface CursoRepository extends Repository<Curso, Long>{
	
void save(Curso curso) throws DataAccessException;
	
	List<Curso> findAll();
	
	Curso findOne(Long id);
	
	

}

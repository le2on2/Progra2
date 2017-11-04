package com.programacion2.intranetgrupo2.repository;

import java.util.List;

import org.springframework.dao.DataAccessException;
import org.springframework.data.repository.Repository;

import com.programacion2.intranetgrupo2.model.Alumno;

public interface AlumnoRepository extends Repository<Alumno, Long>{
	
void save(Alumno alumno) throws DataAccessException;
	
	List<Alumno> findAll();
	
	Alumno findOne(Long id);
	
	

}

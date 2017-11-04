package com.programacion2.intranetgrupo2.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
public class Curso {
	
	@Id
	long codigo;
	String nombre;
	String carrera;
	String area_curricular;
	String ciclo;
	int cod_requisito;
	String estado;
	
	
	public long getCodigo() {
		return codigo;
	}
	public void setCodigo(long codigo) {
		this.codigo = codigo;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getCarrera() {
		return carrera;
	}
	public void setCarrera(String carrera) {
		this.carrera = carrera;
	}
	
	public String getCiclo() {
		return ciclo;
	}
	public void setCiclo(String ciclo) {
		this.ciclo = ciclo;
	}
	
	public String getArea_curricular() {
		return area_curricular;
	}
	public void setArea_curricular(String area_curricular) {
		this.area_curricular = area_curricular;
	}
	public int getCod_requisito() {
		return cod_requisito;
	}
	public void setCod_requisito(int cod_requisito) {
		this.cod_requisito = cod_requisito;
	}
	public String getEstado() {
		return estado;
	}
	public void setEstado(String estado) {
		this.estado = estado;
	}
	
	
	
	
	

}

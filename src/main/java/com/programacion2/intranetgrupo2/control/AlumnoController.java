package com.programacion2.intranetgrupo2.control;


import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.request;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import com.programacion2.intranetgrupo2.model.Alumno;
import com.programacion2.intranetgrupo2.model.Curso;
import com.programacion2.intranetgrupo2.repository.AlumnoRepository;
import com.programacion2.intranetgrupo2.repository.CursoRepository;


@Controller
public class AlumnoController {

	@Autowired
	private AlumnoRepository AluRepo;
	
	@GetMapping("/agregarAlumno")    
	public String ShowFormCurso(Model model) {
		
		return "Agregar_alumno";
	}
	
	@GetMapping("/listarAlumno")
	public String loadFormCurso(Map<String, Object> model) {
		List<Alumno> alumno = AluRepo.findAll();
		model.put("alumno", alumno);
		return "Listar_alummno";
	}
/*	
	@GetMapping("/Menu")
	public String home1() {
		return "result";
	}
	
	

	@PostMapping("/agregarAlumno")
	public String submitPerson(@ModelAttribute Alumno alumno) {

		CurRepo.save(alumno);

		return  "result";
	}
	
	@GetMapping(value = "/alumno/{codigo}/edit")
	public String editCurso(@PathVariable("alumno") long id,Model model) {
		Alumno alumno  =AluRepo.findOne(id);
		model.addAttribute(alumno);
		return "Actualizar_alumno";
	}
	
	@PostMapping("/saveCurso")
	public String savePerson(@ModelAttribute Alumno alumno) {
		AluRepo.save(alumno);
		return "result";
	}
	
	@GetMapping("//alumno/{codigo}/eliminar")
	public String DeleteAlumno(@PathVariable("alumno") long id,Model model) {
		Alumno alumno  =CurRepo.findOne(id);
		
		if(curso.getEstado().equals("Habilitado")) {
			curso.setEstado("Inhabilitado");
			AluRepo.save(alumno);
		}
		
		return "result";
	}
	
	
	*/
	
		
}

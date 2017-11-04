package com.programacion2.intranetgrupo2.control;


import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.request;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import com.programacion2.intranetgrupo2.model.Curso;
import com.programacion2.intranetgrupo2.repository.CursoRepository;


@Controller
public class CursoController {

	@Autowired
	private CursoRepository CurRepo;
	
	@GetMapping("/agregarCurso")    
	public String ShowFormCurso(Model model) {
		model.addAttribute("curso", new Curso());
		return "Agregar_curso";
	}
	
	@GetMapping("/listarCurso")
	public String loadFormCurso(Map<String, Object> model) {
		List<Curso> curso = CurRepo.findAll();
		model.put("curso", curso);
		return "Listar_curso";
	}
	
	@GetMapping("/Menu")
	public String home1() {
		return "result";
	}
	
	

	@PostMapping("/agregarCurso")
	public String submitPerson(@ModelAttribute Curso curso) {

		CurRepo.save(curso);

		return  "result";
	}
	
	
	
	@GetMapping(value = "/curso/{codigo}/edit")
	public String editCurso(@PathVariable("codigo") long id,Model model) {
		Curso curso  =CurRepo.findOne(id);
		model.addAttribute(curso);
		return "Actualizar_curso";
	}
	
	@PostMapping("/saveCurso")
	public String savePerson(@ModelAttribute Curso curso) {
		CurRepo.save(curso);
		return "result";
	}
	
	@GetMapping("//curso/{codigo}/eliminar")
	public String DeleteCurso(@PathVariable("codigo") long id,Model model) {
		Curso curso  =CurRepo.findOne(id);
		
		if(curso.getEstado().equals("Habilitado")) {
			curso.setEstado("Inhabilitado");
			CurRepo.save(curso);
		}
		
		return "result";
	}
	
	
	
	
		
}

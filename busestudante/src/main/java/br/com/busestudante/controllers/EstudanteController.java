package br.com.busestudante.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.busestudante.daos.EstudanteRepository;
import br.com.busestudante.models.Estudante;


@RestController
@RequestMapping("/estudcontroller")
public class EstudanteController {
	
	@Autowired
	private EstudanteRepository estudanterepository;
	
	@PostMapping
	public Estudante Inserir(@RequestBody Estudante estudante){
		return estudanterepository.save(estudante);
	}
	
	@PutMapping
	public Estudante Alterar(@RequestBody Estudante estudante){
		return estudanterepository.save(estudante);
	}
	
	@DeleteMapping("/{id}")
	public void Excluir(@PathVariable("id") Integer id){
		estudanterepository.delete(id);
	}
	
	@GetMapping("/{id}")
	public Estudante BuscarporID(@PathVariable("id") Integer id){
	return	estudanterepository.findOne(id);
	}
	
	@GetMapping
	public List<Estudante> BuscarTodos(){
	return	estudanterepository.findAll();
	}
	
	@GetMapping("/bn/{nome}")
	public List<Estudante> BuscarporNome(@PathVariable("nome") String nome){
		return estudanterepository.findByNomeIgnoreCase(nome);
	}

}

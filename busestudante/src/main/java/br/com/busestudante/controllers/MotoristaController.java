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

import br.com.busestudante.daos.MotoristaRepository;
import br.com.busestudante.models.Motorista;

@RestController
@RequestMapping("/motorcontroller")
public class MotoristaController {
	
	@Autowired
	private MotoristaRepository motoristarepository;
	
	@PostMapping
	public Motorista Inserir(@RequestBody Motorista motorista){
		return motoristarepository.save(motorista);
	}
	
	@PutMapping
	public Motorista Alterar(@RequestBody Motorista motorista){
		return motoristarepository.save(motorista);
	}
	
	@DeleteMapping("/{id}")
	public void Excluir(@PathVariable("id") Integer id){
		motoristarepository.delete(id);
	}
	
	@GetMapping("/{id}")
	public Motorista BuscarporID(@PathVariable("id") Integer id){
	return	motoristarepository.findOne(id);
	}
	
	@GetMapping
	public List<Motorista> BuscarTodos(){
	return	motoristarepository.findAll();
	}
	
	@GetMapping("/bn/{nome}")
	public List<Motorista> BuscarporNome(@PathVariable("nome") String nome){
		return motoristarepository.findByNomeIgnoreCase(nome);
	}

}

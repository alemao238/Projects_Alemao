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

import br.com.busestudante.daos.PrefeituraRepository;
import br.com.busestudante.models.Prefeitura;

@RestController
@RequestMapping("/prefecontroller")
public class PrefeituraController {
	
	@Autowired
	private PrefeituraRepository prefeiturarepository;
	
	@PostMapping
	public Prefeitura Inserir(@RequestBody Prefeitura prefeitura){
		return prefeiturarepository.save(prefeitura);
	}
	
	@PutMapping
	public Prefeitura Alterar(@RequestBody Prefeitura prefeitura){
		return prefeiturarepository.save(prefeitura);
	}
	
	@DeleteMapping("/{id}")
	public void Excluir(@PathVariable("id") Integer id){
		prefeiturarepository.delete(id);
	
	}
	
	@GetMapping("/{id}")
	public Prefeitura BuscarporID(@PathVariable("id") Integer id){
	return	prefeiturarepository.findOne(id);
	}
	
	@GetMapping
	public List<Prefeitura> BuscarTodos(){
	return	prefeiturarepository.findAll();
	}
	
	

}

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

import br.com.busestudante.daos.OnibusRepository;
import br.com.busestudante.models.Onibus;

@RestController
@RequestMapping("/onicontroller")
public class OnibusController {
	
	@Autowired
	private OnibusRepository onibusrepository;
	
	@PostMapping
	public Onibus Inserir(@RequestBody Onibus onibus){
		return onibusrepository.save(onibus);
	}
	
	@PutMapping
	public Onibus Alterar(@RequestBody Onibus onibus){
		return onibusrepository.save(onibus);
	}
	
	@DeleteMapping("/{id}")
	public void Excluir(@PathVariable("id") Integer id){
		onibusrepository.delete(id);
	}
	
	@GetMapping("/{id}")
	public Onibus BuscarporID(@PathVariable("id") Integer id){
	return	onibusrepository.findOne(id);
	}
	
	@GetMapping
	public List<Onibus> BuscarTodos(){
	return	onibusrepository.findAll();
	}

}

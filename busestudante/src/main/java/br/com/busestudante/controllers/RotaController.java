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

import br.com.busestudante.daos.RotaRepository;
import br.com.busestudante.models.Rota;

@RestController
@RequestMapping("/rotacontroller")
public class RotaController {
	
	@Autowired
	private RotaRepository rotarepository;
	

	@PostMapping
	public Rota Inserir(@RequestBody Rota rota){
		return rotarepository.save(rota);
	}
	
	@PutMapping
	public Rota Alterar(@RequestBody Rota rota){
		return rotarepository.save(rota);
	}
	
	@DeleteMapping("/{id}")
	public void Excluir(@PathVariable("id") Integer id){
		rotarepository.delete(id);
	}
	
	@GetMapping("/{id}")
	public Rota BuscarporID(@PathVariable("id") Integer id){
	return	rotarepository.findOne(id);
	}
	
	@GetMapping
	public List<Rota> BuscarTodos(){
	return	rotarepository.findAll();
	}
	

}

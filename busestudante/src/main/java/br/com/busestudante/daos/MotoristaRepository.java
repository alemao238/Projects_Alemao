package br.com.busestudante.daos;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.busestudante.models.Motorista;

public interface MotoristaRepository extends JpaRepository<Motorista, Integer> {

	List<Motorista> findByNomeIgnoreCase(String nome);

}

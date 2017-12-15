package br.com.busestudante.daos;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.busestudante.models.Estudante;

public interface EstudanteRepository extends JpaRepository<Estudante, Integer> {

	List<Estudante> findByNomeIgnoreCase(String nome);

}

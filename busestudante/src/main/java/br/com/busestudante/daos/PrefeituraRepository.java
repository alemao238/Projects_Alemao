package br.com.busestudante.daos;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.busestudante.models.Prefeitura;

public interface PrefeituraRepository extends JpaRepository<Prefeitura, Integer>{

}

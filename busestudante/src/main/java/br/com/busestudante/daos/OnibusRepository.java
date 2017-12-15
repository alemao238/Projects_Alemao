package br.com.busestudante.daos;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.busestudante.models.Onibus;

public interface OnibusRepository extends JpaRepository<Onibus, Integer>{

	void findByPlacaIgnoreCase(String placa);

}

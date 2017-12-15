package br.com.busestudante.models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;



@Entity
public class Rota {
	@Id
	@GeneratedValue
	private Integer id;
	private String trajeto;
	
	
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getTrajeto() {
		return trajeto;
	}
	public void setTrajeto(String trajeto) {
		this.trajeto = trajeto;
	
	}
	
	
	

}

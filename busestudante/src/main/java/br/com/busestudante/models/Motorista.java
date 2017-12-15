package br.com.busestudante.models;


import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
@Entity
public class Motorista {
	@Id
	@GeneratedValue
	private Integer id;
	private String nome;
	private String sobrenome;
	private String data_nascimento;
	private String categoria_habilitacao;
	private String cpf;
	
	
	
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getSobrenome() {
		return sobrenome;
	}
	public void setSobrenome(String sobrenome) {
		this.sobrenome = sobrenome;
	}
	public String getData_nascimento() {
		return data_nascimento;
	}
	public void setData_nascimento(String data_nascimento) {
		this.data_nascimento = data_nascimento;
	}
	public String getCategoria_habilitacao() {
		return categoria_habilitacao;
	}
	public void setCategoria_habilitacao(String categoria_habilitacao) {
		this.categoria_habilitacao = categoria_habilitacao;
	}
	public String getCpf() {
		return cpf;
	}
	public void setCpf(String cpf) {
		this.cpf = cpf;
	
	}
	

}

package com.ava.sessaomobile.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="sessaomobile")
public class SessaomobileModel {
	
	@Id
	private int id;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getDispositivo_id() {
		return dispositivo_id;
	}
	public void setDispositivo_id(String dispositivo_id) {
		this.dispositivo_id = dispositivo_id;
	}
	public String getToken_sessao() {
		return token_sessao;
	}
	public void setToken_sessao(String token_sessao) {
		this.token_sessao = token_sessao;
	}
	public String getData_inicio() {
		return data_inicio;
	}
	public void setData_inicio(String data_inicio) {
		this.data_inicio = data_inicio;
	}
	public String getAtivo() {
		return ativo;
	}
	public void setAtivo(String ativo) {
		this.ativo = ativo;
	}
	 
	private String dispositivo_id;
	private String token_sessao;
	private String data_inicio;
	private String ativo;
}
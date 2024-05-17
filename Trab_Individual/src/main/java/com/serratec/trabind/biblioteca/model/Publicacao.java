package com.serratec.trabind.biblioteca.model;

import jakarta.persistence.Embeddable;

@Embeddable
public class Publicacao {
	
	private String autor;
	private String dataPublicacao;
	private String editora;
	
	public String getAutor() {
		return autor;
	}
	public void setAutor(String autor) {
		this.autor = autor;
	}
	public String getDataPublicacao() {
		return dataPublicacao;
	}
	public void setDataPublicacao(String dataPublicacao) {
		this.dataPublicacao = dataPublicacao;
	}
	public String getEditora() {
		return editora;
	}
	public void setEditora(String editora) {
		this.editora = editora;
	}

}

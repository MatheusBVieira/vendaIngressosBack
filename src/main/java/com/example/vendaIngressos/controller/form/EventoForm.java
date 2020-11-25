package com.example.vendaIngressos.controller.form;

import java.util.Date;

import com.example.vendaIngressos.model.Categoria;
import com.example.vendaIngressos.model.Endereco;
import com.example.vendaIngressos.model.Evento;
import com.example.vendaIngressos.model.Usuario;
import com.example.vendaIngressos.service.UsuarioService;
import com.fasterxml.jackson.annotation.JsonFormat;

public class EventoForm {

	private String nome;
	@JsonFormat(pattern = "dd/MM/yyyy")
	private Date data;
	private Long criador;
	private Double preco;
	private Categoria categoria;
	private Endereco endereco;
	private Integer capacidadePessoas;
	private String descricao;

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Date getData() {
		return data;
	}

	public void setData(Date data) {
		this.data = data;
	}

	public Long getCriador() {
		return criador;
	}

	public void setCriador(Long criador) {
		this.criador = criador;
	}

	public Double getPreco() {
		return preco;
	}

	public void setPreco(Double preco) {
		this.preco = preco;
	}

	public Categoria getCategoria() {
		return categoria;
	}

	public void setCategoria(Categoria categoria) {
		this.categoria = categoria;
	}

	public Endereco getEndereco() {
		return endereco;
	}

	public void setEndereco(Endereco endereco) {
		this.endereco = endereco;
	}

	public Integer getCapacidadePessoas() {
		return capacidadePessoas;
	}

	public void setCapacidadePessoas(Integer capacidadePessoas) {
		this.capacidadePessoas = capacidadePessoas;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public Evento converter(UsuarioService usuarioService) {
		Usuario usuario = usuarioService.getOne(criador);
		return new Evento(nome, data, usuario, preco, categoria, endereco, capacidadePessoas, descricao);
	}

}

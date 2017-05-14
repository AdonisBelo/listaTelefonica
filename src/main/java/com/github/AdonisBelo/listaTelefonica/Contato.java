package com.github.AdonisBelo.listaTelefonica;

import java.util.ArrayList;

public class Contato {

	String nome;
	ArrayList<Telefone> telefones;

	Contato(String nome){
		this.nome = nome;
		this.telefones = new ArrayList<Telefone>();
	}

	public void mostrarContato(int i){

		System.out.println("-----------------------------------------");
		System.out.println("("+(i+1)+").NOME: "+this.getNome());

		for(int x=0; x<this.getTelefones().size();x++){
			this.getTelefones().get(x).mostrarTelefone(x);
		}
		System.out.println("-----------------------------------------");
	}
	
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public ArrayList<Telefone> getTelefones() {
		return telefones;
	}

	public void setTelefones(ArrayList<Telefone> telefones) {
		this.telefones = telefones;
	}

}

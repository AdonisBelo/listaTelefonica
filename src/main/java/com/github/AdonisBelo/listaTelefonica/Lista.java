package com.github.AdonisBelo.listaTelefonica;

import java.util.ArrayList;

public class Lista {

	ArrayList<Contato> contatos;

	Lista(){
		this.contatos = new ArrayList<Contato>();
	}

	public void inserir(Contato c){
		this.getContatos().add(c);
	}

	public void mostrarLista(){

		for(int i=0;i<this.getContatos().size();i++){
			this.getContatos().get(i).mostrarContato(i);
		}
	}

	public ArrayList<Contato> getContatos() {
		return contatos;
	}

}

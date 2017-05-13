package com.github.AdonisBelo.listaTelefonica;

import java.util.ArrayList;

public class Agenda {
	
	ArrayList<Contato> contatos;
	
	Agenda(){
		this.contatos = new ArrayList<Contato>();
	}
	
	public void inserir(Contato c){
		this.contatos.add(c);
	}
	
	public ArrayList<Contato> buscarContato(String nome){
		
		ArrayList<Contato> resultado = new ArrayList<Contato>();
		
		for(int i=0;i < this.contatos.size();i++){
			if(nome.equals(this.contatos.get(i).nome)){
				resultado.add(this.contatos.get(i));
			}
		}
		
		return resultado;
		
	}

}

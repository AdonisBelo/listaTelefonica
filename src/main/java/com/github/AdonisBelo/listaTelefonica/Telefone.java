package com.github.AdonisBelo.listaTelefonica;

public class Telefone {
	
	String numero;
    String operadora;
    
    public Telefone(String numero){
    	this.numero = numero;
    	this.operadora = "";
    }
    
    public void mostrarTelefone(int x){

			System.out.print((x+1)+".Número : "+this.getNumero()+" ");
			if(this.getOperadora().length()>0){
				System.out.print("Operadora: "+this.getOperadora());
			}
			System.out.println();
	}

	public String getNumero() {
		return numero;
	}

	public void setNumero(String numero) {
		this.numero = numero;
	}

	public String getOperadora() {
		return operadora;
	}

	public void setOperadora(String operadora) {
		this.operadora = operadora;
	}
    
}

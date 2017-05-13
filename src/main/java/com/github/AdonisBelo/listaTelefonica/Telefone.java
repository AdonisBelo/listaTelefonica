package com.github.AdonisBelo.listaTelefonica;

public class Telefone {
	private String numero;
    private String operadora;
    public Telefone(String numero, String operadora)
   {   this.numero = numero;
        this.operadora = operadora;
   }
   public String getTelefone()
   {   return numero+" "+operadora;
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}

package it.gestionemagazzino.articoli;

import java.util.ArrayList;

public class Cellulare extends Articolo {

	public String marca;
	public String modello;
	public String SistemaOperativo;
	public String tag1;
	public String tag2;
	
	
	public Cellulare(String nome, int codice, int peso, int sconto, double prezzo,  String marca,
			String modello, String SistemaOperativo,ArrayList<String> tag) {
		super(nome, codice, peso, sconto, prezzo,tag);
		// TODO Auto-generated constructor stub
		this.marca = marca;
		this.modello = modello;
		this.SistemaOperativo = SistemaOperativo;
	}
	@Override
	public void stampa()
	{
		System.out.println("Articolo  " + codice + " nome: " + nome + " peso: " + peso + " prezzo: " + prezzo
				+ " sconto " + sconto);
	}
	@Override
	public void addTag(String tag1)
	{
		 tag.add(tag1);
	}
	@Override
	public void removeTag(String tag2)
	{
		 tag.remove(tag2);
	}
	@Override
	public void printTag()
	{
		 for (String string : tag) {
				System.out.println(string + "," );
		}
	}
}

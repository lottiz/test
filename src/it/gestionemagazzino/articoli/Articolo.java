package it.gestionemagazzino.articoli;

import java.util.ArrayList;

public abstract class Articolo {
	public String nome;
	public int codice;
	public int peso;
	public double prezzo;
	public int sconto;
public ArrayList<String> tag;


	public Articolo(String nome, int codice, int peso, int sconto, double prezzo,ArrayList<String> tag) {
		this.nome = nome;
		this.codice = codice;
		this.peso = peso;
		this.prezzo = prezzo;
		this.sconto = sconto;
        this.tag = tag;
	}
	abstract void addTag(String tag1);
	abstract void removeTag(String tag1);
	abstract void printTag();
	abstract void stampa();
	
	//{
//		System.out.println("Articolo  " + codice + " nome: " + nome + " peso: " + peso + " prezzo: " + prezzo
//				+ " sconto " + sconto);
	//}


}

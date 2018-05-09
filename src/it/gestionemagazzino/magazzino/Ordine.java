package it.gestionemagazzino.magazzino;

import java.util.ArrayList;


import it.gestionemagazzino.articoli.Articolo;

public class Ordine implements Comparable<Ordine> {
	private int id;
	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String data;
	public int codice_cliente;

	public ArrayList<Articolo> articoli;

	public Ordine(int id, String data, int codice_cliente, ArrayList<Articolo> articoli) {
		this.id = id;
		this.data = data;
		this.codice_cliente = codice_cliente;
		this.articoli = articoli;
	}

	public void addArticoloOrdine(Articolo articolo) {
		articoli.add(articolo);
	}

	public double getCostoTotale() {
		double p = 0;
		for (Articolo articolo : articoli) {
			p += articolo.prezzo;
		}
		return p;
	}

	public void removeArticoloOrdine(Articolo articolo) {
		articoli.remove(articolo);
	}

	public void stampaOrdine() {
		System.out.println("Ordine n° " + id + " del " + data + " cliente: " + codice_cliente);
		for (Articolo articolo : articoli) {
			System.out.println(articolo.codice + " " + articolo.nome + " " + articolo.prezzo);
		}
	}
	@Override 
	public int compareTo(Ordine o) {
		if (this.getId() < o.getId())
		{
			return -1;
		}
		else if (this.getId() == o.getId())
		{
			return 0;
		}
		return 1;
	}
	
//	public int compareTo(Ordine o) {
//		if (this.getCostoTotale() < o.getCostoTotale())
//		{
//			return -1;
//		}
//		else if (this.getCostoTotale() == o.getCostoTotale())
//		{
//			return 0;
//		}
//		return 1;
//	}
}

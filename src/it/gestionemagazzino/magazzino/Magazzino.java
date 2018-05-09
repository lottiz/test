package it.gestionemagazzino.magazzino;

import java.util.ArrayList;

import it.gestionemagazzino.articoli.Articolo;

public class Magazzino {
	public String indirizzo;
	public ArrayList<Articolo> magazzino;

	public Magazzino(String indirizzo, ArrayList<Articolo> magazzino) {
		this.indirizzo = indirizzo;
		this.magazzino = magazzino;
	}

	public void aggiungiArticolo(Articolo articolo) {
		magazzino.add(articolo);
	}

	public void togliArticolo(Articolo articolo) {
		magazzino.remove(articolo);
	}

	public void cercaArticolo(int codice) {
		for (Articolo articolo : magazzino) {
			if (articolo.codice == codice) {
				System.out.println("Articolo " + articolo.codice + " - " + articolo.nome + " - peso " + articolo.peso
						+ " - prezzo " + articolo.prezzo);
			} else {
				System.out.println("Articolo non trovato");
			}
		}
	}

	public void stampaInventario() {
		for (Articolo articolo : magazzino) {
			System.out.println("Articolo " + articolo.codice + " - " + articolo.nome + " - peso " + articolo.peso
					+ " - prezzo " + articolo.prezzo);
		}
	}
}

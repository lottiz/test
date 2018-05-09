package it.gestionemagazzino.main;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import it.gestionemagazzino.articoli.Accessori;
import it.gestionemagazzino.articoli.Articolo;
import it.gestionemagazzino.articoli.Cellulare;
import it.gestionemagazzino.articoli.Notebook;
import it.gestionemagazzino.clienti.Clienti;
import it.gestionemagazzino.clienti.Ditta;
import it.gestionemagazzino.clienti.Persona;
import it.gestionemagazzino.magazzino.Magazzino;
import it.gestionemagazzino.magazzino.Ordine;

public class GestioneOrdini {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ArrayList<String> notetag = new ArrayList<String>();
		notetag.add("HP");
		notetag.add("Notebook");
		Notebook notebook = new Notebook("Hp Bello", 1, 1, 10, 1000, "HP", "Bello", "Windows 10", notetag);
		ArrayList<String> cellutag = new ArrayList<String>();
		cellutag.add("Alcatel");
		cellutag.add("Cellulare");
		Cellulare cellulare = new Cellulare("Cellulare Brutto", 2, 2, 10, 100, "Alcatel", "Brutto", "Android",
				cellutag);
		ArrayList<String> artitag = new ArrayList<String>();
		artitag.add("Batteria");
		artitag.add("Buona");
		Accessori accessori = new Accessori("Batteria Buona", 3, 3, 10, 50, "Batteria", "Buona", artitag);

		ArrayList<Articolo> articoli = new ArrayList<Articolo>();
		ArrayList<Articolo> articoli1 = new ArrayList<Articolo>();
		ArrayList<Articolo> articoli2 = new ArrayList<Articolo>();
		ArrayList<Articolo> articoli3 = new ArrayList<Articolo>();

		articoli.add(notebook);
		articoli.add(cellulare);
		articoli.add(accessori);

		articoli1.add(notebook);
		articoli1.add(cellulare);

		articoli2.add(accessori);
		articoli2.add(cellulare);

		articoli3.add(notebook);
		articoli3.add(cellulare);
		articoli3.add(accessori);

		Magazzino magazzino = new Magazzino("Via di Prova 17", articoli);

		magazzino.aggiungiArticolo(new Notebook("Hp Bello1", 4, 1, 10, 1000, "HP", "Bello", "Windows 10", notetag));

		Clienti cliente1 = new Ditta("Via Fasulla 10", "111111", "", "prova1@prova.it", "Ditta 1", "123456", 1);
		Clienti cliente2 = new Persona("Via Fasulla 10", "111111", "", "prova2@prova.it", "Pippo Franco", "aaaaaa",
				null, 2);
		Clienti cliente3 = new Ditta("Via Fasulla 10", "111111", "", "prova3@prova.it", "Ditta 2", "456132", 3);

		Ordine ordine1 = new Ordine(1, "07/05/2018", 1, articoli1);
		Ordine ordine2 = new Ordine(2, "07/05/2018", 2, articoli2);
		Ordine ordine3 = new Ordine(3, "07/05/2018", 3, articoli3);

		System.out.println("Stampa Ordine 2");
		ordine2.stampaOrdine();

		System.out.println("Rimuovi accessori Ordine 3");
		ordine3.removeArticoloOrdine(accessori);
//Prova
		System.out.println("Stampa Ordine 3");
		ordine3.stampaOrdine();

		System.out.println("Stampa Inventario");
		magazzino.stampaInventario();

		System.out.println("Rimuovi Notebook Magazzino");
		magazzino.togliArticolo(notebook);

		System.out.println("Stampa Inventario");
		magazzino.stampaInventario();

		System.out.println("Stampa Tag Articolo accessorio");
		accessori.printTag();

		System.out.println("Rimuovi Tag Articolo accessorio");
		accessori.removeTag("Buona");

		System.out.println("Stampa Tag Articolo accessorio");
		accessori.printTag();

		System.out.println("Aggiungi Tag Articolo accessorio");
		accessori.addTag("Buonissima");

		System.out.println("Stampa Tag Articolo accessorio");
		accessori.printTag();

		List<Ordine> elenco_provvisorio = new ArrayList<Ordine>();

		elenco_provvisorio.add(ordine2);
		elenco_provvisorio.add(ordine1);
		elenco_provvisorio.add(ordine3);
		System.out.println("Stampa non ordinata");
		for (Ordine ordine : elenco_provvisorio) {
			System.out.println(ordine.getId());
		}

		Collections.sort(elenco_provvisorio);
		System.out.println("Stampa ordinata");
		for (Ordine ordine : elenco_provvisorio) {
			System.out.println(ordine.getId());
		}

		// System.out.println("Stampa non ordinata costo");
		// for (Ordine ordine : elenco_provvisorio) {
		// System.out.println(ordine.getCostoTotale());
		// }
		//
		// Collections.sort(elenco_provvisorio);
		// System.out.println("Stampa ordinata costo");
		// for (Ordine ordine : elenco_provvisorio) {
		// System.out.println(ordine.getCostoTotale());
		// }
		
		
		System.out.println("Ordine Binario");
		int n = Collections.binarySearch(elenco_provvisorio, ordine3);
		System.out.println(n);

	}

}

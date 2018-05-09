package it.gestionemagazzino.clienti;


public class Persona extends Clienti {

	public String nome, cognome, codicefiscale;

	public Persona(String indirizzo, String telefono, String fax, String email, String nome, String cognome,
			String codicefiscale,int codice) {
		super(indirizzo, telefono, fax, email,codice);
		// TODO Auto-generated constructor stub
		this.nome = nome;
		this.cognome = cognome;
		this.codicefiscale = codicefiscale;
	}

	@Override
	public void stampa() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public String getDenominazione() {
		// TODO Auto-generated method stub
		return this.codicefiscale;
	}

	@Override
	public int compareTo(Clienti arg0) {
		// TODO Auto-generated method stub
		return 0;
	}

	
}

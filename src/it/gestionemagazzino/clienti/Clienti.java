package it.gestionemagazzino.clienti;


public abstract class Clienti implements Comparable<Clienti> {

	public String indirizzo, telefono, fax, email;
	private int codice;

	public int getCodice() {
		return codice;
	}

	public void setCodice(int codice) {
		this.codice = codice;
	}

	public Clienti(String indirizzo, String telefono, String fax, String email, int codice) {
		this.indirizzo = indirizzo;
		this.telefono = telefono;
		this.fax = fax;
		this.email = email;
		this.codice = codice;
	}

	public abstract void stampa();

	public abstract String getDenominazione();

	@Override
	public int compareTo(Clienti o) {
		return getDenominazione().compareTo(o.getDenominazione());
	}
}

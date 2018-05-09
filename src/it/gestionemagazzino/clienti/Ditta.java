package it.gestionemagazzino.clienti;


public class Ditta extends Clienti {

	public String ragionesociale, partitaiva;

	public Ditta(String indirizzo, String telefono, String fax, String email, String ragionesociale,
			String partitaiva,int codice) {
		super(indirizzo, telefono, fax, email,codice);
		// TODO Auto-generated constructor stub
		this.ragionesociale = ragionesociale;
		this.partitaiva = partitaiva;
	}

	@Override
	public void stampa() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public String getDenominazione() {
		// TODO Auto-generated method stub
		return this.partitaiva;
	}

	@Override
	public int compareTo(Clienti o) {
		// TODO Auto-generated method stub
		return 0;
	}

	

}

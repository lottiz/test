package it.gestionemagazzino.clienti;

import java.util.Comparator;

public class ClienteDenominazioneSort implements Comparator<Clienti> {

	@Override
	public int compare(Clienti x, Clienti y) {
		
		return x.getDenominazione().compareTo(y.getDenominazione());
	}

	
}

package it.gestionemagazzino.clienti;

import java.util.Comparator;

public class ClienteIdSort implements Comparator<Clienti> {

	@Override
	public int compare(Clienti x, Clienti y) {
		if (x.getCodice() < y.getCodice()) {
			return -1;
		} else if (x.getCodice() > y.getCodice()) {
			return 1;
		} else
			return 0;
	}

}

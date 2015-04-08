package viaggi;

import java.util.*;

public class Pacchetto {

	private String ID;
	private String descrizione;
	private int postiTotali;
	private Vector v;

	public Pacchetto(String ID, String descrizione, int postiTotali) {
		if (ID.length() == 0)
			throw new IllegalArgumentException(
					"l'ID deve avere più di 0 caratteri");
		this.ID = ID;
		if (descrizione.length() == 0)
			throw new IllegalArgumentException(
					"la descrizione deve avere più di 0 caratteri");
		this.descrizione = descrizione;
		if (postiTotali <= 0)
			throw new IllegalArgumentException(
					"il numero dei posti totali deve essere positivo");
		this.postiTotali = postiTotali;

		v = new Vector();

	}

	public String getID() {

		return this.ID;
	}

	public String getDescrizione() {

		return this.descrizione;
	}

	public int getPostiTotali() {

		return this.postiTotali;
	}

	public int getPostiDisponibili() {

		Prenotazione p;
		int posti = this.postiTotali;
		for (int i = 0; i < v.size(); i++) {
			p = (Prenotazione) v.elementAt(i);
			posti -= p.getPosti();
		}
		return posti;
	}

	public void addPrenotazione(Prenotazione p) throws Exception {
		if (this.getPostiDisponibili() < p.getPosti())
			throw new Exception(
					"posti richiesti maggiori di quelli disponibili");
		v.addElement(p);
	}

	public Vector getPrenotazioni() {
		return this.v;
	}
}

package viaggi;

public class Prenotazione {

	private String ID;
	private int posti;
	private Cliente cliente;

	public Prenotazione(String ID, int posti, Cliente c) {
		if (ID.length() == 0)
			throw new IllegalArgumentException(
					"l'ID deve avere più di 0 caratteri");
		this.ID = ID;
		if (posti <= 0)
			throw new IllegalArgumentException(
					"il numero dei posti totali deve essere positivo");
		this.posti = posti;
		this.cliente=c;

	}

	public String getID() {
		return this.ID;
	}

	public int getPosti() {
		return this.posti;
	}

	public Cliente getCliente() {
		return this.cliente;
	}

	@Override
	public String toString() {
		return "Prenotazione [ID=" + ID + ", posti=" + posti + ", cliente="
				+ cliente + "]"; // richiama il toString della classe Cliente
	}
	

}

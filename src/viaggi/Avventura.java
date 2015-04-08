package viaggi;

public class Avventura extends Pacchetto {

	private int dispersi;
	

	public Avventura(String ID, String descrizione, int postiTotali,int dispersi) {
		super(ID, descrizione, postiTotali);
		if (dispersi <= 0)
			throw new IllegalArgumentException(
					"il numero dei dispersi deve essere positivo");
		this.dispersi = dispersi;
	}

	public int getDispersi() {
		return this.dispersi;
	}

}

package viaggi;

public class ViaggioDiNozze extends Pacchetto {

	private int divorzi;

	public ViaggioDiNozze(String ID, String descrizione, int postiTotali,
			int divorzi) {
		super(ID, descrizione, postiTotali);
		if (divorzi <= 0)
			throw new IllegalArgumentException(
					"il numero dei divorzi deve essere positivo");
		this.divorzi = divorzi;

	}

	public int getDivorzi() {
		return this.divorzi;
	}

}

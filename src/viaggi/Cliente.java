package viaggi;

public class Cliente {

	private String nome;
	private String cognome;
	private String email;

	public Cliente(String nome, String cognome, String email) {

		if (nome.length() == 0)
			throw new IllegalArgumentException(
					"l'ID deve avere più di 0 caratteri");
		this.nome = nome;
		if (cognome.length() == 0)
			throw new IllegalArgumentException(
					"l'ID deve avere più di 0 caratteri");
		this.cognome = cognome;
		if (email.length() == 0)
			throw new IllegalArgumentException(
					"l'ID deve avere più di 0 caratteri");
		this.email = email;

	}

	public String getNome() {
		return this.nome;
	}

	public String getCognome() {
		return this.cognome;
	}

	public String getEmail() {
		return this.email;
	}

	@Override
	public String toString() {
		return "Cliente [nome=" + nome + ", cognome=" + cognome + ", email="
				+ email + "]";
	}

}

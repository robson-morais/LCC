package exercicios.agenda;

public class Contato {
	private String nome;
	private Endereco endereco;
	private Email email;
	
	public Contato(String nome, Endereco endereco, Email email) {
		this.nome = nome;
		this.endereco = endereco;
		this.email = email;
	}
	
	public Email getEmail() {
		return email;
	}

	public void setEmail(Email email) {
		this.email = email;
	}

	public Contato() {
		this("", new Endereco(), new Email());
	}
	
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Endereco getEndereco() {
		return endereco;
	}

	public void setEndereco(Endereco endereco) {
		this.endereco = endereco;
	}

	public String toString() {
		return "Contato de nome "+this.nome+", "+this.endereco.toString()+"e e-mail "+this.email;
	}

}  

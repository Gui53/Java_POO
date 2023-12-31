package classes;

import java.util.Objects;

public class Contato {
	int id;
	String nome;
	String email;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public Contato(int id, String nome, String email) {
		this.id = id;
		this.nome = nome;
		this.email = email;
	}
	public Contato() {
		
	}
	@Override
	public String toString() {
		return "Contato [id=" + id + ", nome=" + nome + ", email=" + email + "]";
	}
	@Override
	public int hashCode() {
		return Objects.hash(id);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Contato other = (Contato) obj;
		return id == other.id;
	}
	
}

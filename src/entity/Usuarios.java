package entity;

public abstract class Usuarios{
	private int matricula_usuario;
	private String nome;
	private String email;
	
	public Usuarios(String nome,String email,int matricula) {
		this.nome = nome;
		this.matricula_usuario = matricula;
		this.email = email;
	}
	
	public int getMatricula_usuario() {
		return this.matricula_usuario;
	}
	public void setMatricula_usuario(int matricula) {
		this.matricula_usuario = matricula;
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

}

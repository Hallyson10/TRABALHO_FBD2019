package entity;
import java.util.ArrayList;
import java.util.Map;
public class Celulas {
	private int id_celula;
	private int id_colaborador;
	private int qtd_horas_da_celula;
	private String nome_celula;
	private String horario_celula;
	private String descricao;
	private ArrayList<Participantes> participantes;
	
	public Celulas(String nome_celula,String hora,int qtd_horas,String descricao) {
		this.id_celula += 1;
		this.nome_celula = nome_celula;
		this.horario_celula = hora;
		this.descricao = descricao;
		this.setQtd_horas_da_celula(qtd_horas);
		participantes = new ArrayList<Participantes>();
	}
	
	public String getNome_celula() {
		return this.nome_celula;
	}
	
	public String getHorario_celula() {
		return this.horario_celula;
	}
	
	public String getDescricao() {
		 return this.descricao;
	}

	public int getId_celula() {
		return id_celula;
	}

	public void setId_celula(int id_celula) {
		this.id_celula = id_celula;
	}

	public int getQtd_horas_da_celula() {
		return qtd_horas_da_celula;
	}

	public void setQtd_horas_da_celula(int qtd_horas_da_celula) {
		this.qtd_horas_da_celula = qtd_horas_da_celula;
	}

	public int getId_colaborador() {
		return id_colaborador;
	}

	public void setId_colaborador(int id_colaborador) {
		this.id_colaborador = id_colaborador;
	}
	@Override
	public String toString() {
		return "Celulas [nome_celula=" + nome_celula + ", horario_celula=" + horario_celula + ", descricao=" + descricao
				+ ", participantes=" + participantes + "]";
	}
	
}

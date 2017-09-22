import java.util.Scanner;


public class Ambientes {

	private String nomeAmbiente;
	private String localizacao;
	private String pontoReferencia;
	private int capacidadeTotal;
	private int quantVagasEstacionamento;
	
	
	
	
	
	
	public void setNomeAmbiente(String nome) {
		
		this.nomeAmbiente = nome;
	}
	
	public String getNomeAmbiente() {
		return nomeAmbiente;
	}

	public String getLocalizacao() {
		return localizacao;
	}

	public void setLocalizacao(String localizacao) {
		this.localizacao = localizacao;
	}

	public String getPontoReferencia() {
		return pontoReferencia;
	}

	public void setPontoReferencia(String pontoReferencia) {
		this.pontoReferencia = pontoReferencia;
	}

	public int getCapacidadeTotal() {
		return capacidadeTotal;
	}

	public void setCapacidadeTotal(int capacidadeTotal) {
		this.capacidadeTotal = capacidadeTotal;
	}

	public int getQuantVagasEstacionamento() {
		return quantVagasEstacionamento;
	}

	public void setQuantVagasEstacionamento(int quantVagasEstacionamento) {
		this.quantVagasEstacionamento = quantVagasEstacionamento;
	}
	
	
}

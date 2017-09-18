
public class Administrador extends Pessoa{
	
	
	// Metodo para atulizar ou editar dados do Administrador! 
	
	public void alterarDados(String nome, String senha, String cpf,
			 String email, String endereco, String dataNascimento,
			 String telefone){

			this.setNome(nome);
			this.setSenha(senha);
			this.setCpf(cpf);
			this.setEmail(email);
			this.setEndereco(endereco);
			this.setDataNascimento(dataNascimento);
			this.setTelefone(telefone);

			System.out.println("##### Dados Atualizados com sucesso! #####\n");

	}
	

	public void inserirEventos() {
		
	}
	
	
	public void alterarEvento() {
		
	}
	
		
	public void cancelarEventos() {
		
	}
	
	
	public void inserirEvento() {
		
		
	}
	
	
	public void alterarAmbiente() {
		
	}
	
	
	public void cancelarAmbiente() {
		
		
	}
	

	
}

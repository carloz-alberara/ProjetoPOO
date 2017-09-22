

public class Cliente extends Pessoa {
	
	//Metodo para atulizar ou editar dados do Cliente!
	
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

	public boolean autentica(int senha) {
		if (this.senha == senha) {
			
			System.out.println("Acesso Permitido!");
			return true;
			} 
		else {
			System.out.println("Acesso Negado!");
			return false;
		}
	}
	
}


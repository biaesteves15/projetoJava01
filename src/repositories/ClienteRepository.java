package repositories;

import java.io.PrintWriter;

import entities.Cliente;

public class ClienteRepository {

	//Método para receber um objeto cliente e gravar os dados
	public void exportarDados(Cliente cliente) {
		
		try {
			
			PrintWriter printWriter = new PrintWriter("c:\\temp\\cliente_" + cliente.getId() + ".txt");
			
			printWriter.write("\nID do cliente....:" + cliente.getId());
			printWriter.write("\nNome.............:" + cliente.getNome());
			printWriter.write("\nCPF..............:" + cliente.getCpf());
			printWriter.write("\nEmail............:" + cliente.getEmail());
			printWriter.write("\nTelefone.........:" + cliente.getTelefone());
			
			printWriter.close();
			
			System.out.println("\nDados gravados com sucesso!");
			
		}
		catch(Exception e){
			System.out.println("\nFalha ao gravar o arquivo: " + e.getMessage());
		}
	}
}

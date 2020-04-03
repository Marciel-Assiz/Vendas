package dao;
import java.util.ArrayList;

import models.Cliente;

//MVC
public class ClienteDAO {

	//DAO - Data Access Object
	private static ArrayList<Cliente> clientes = new ArrayList<Cliente>();
	
	//criar um método para buscar o cliente
	public static Cliente buscarClientePorCpf(String cpf) {
		for (Cliente clienteCadastrado : clientes) {
			if(clienteCadastrado.getCpf().equals(cpf)) {
				return clienteCadastrado;
			}
		}
		return null;
	}
	
	/**
	 * Este busca um objeto do tipo cliente com base no CPF
	 * @param Objeto do tipo Cliente
	 * @return Retorna um objeto de cliente
	 */	
	public static Boolean cadastrarCliente(Cliente c) {		
		for (Cliente clienteCadastrado : clientes) {
			if(clienteCadastrado.getCpf().equals(c.getCpf())) {
				return false;
			}
		}		
		clientes.add(c);	
		return true;
	}
	
	public static ArrayList<Cliente> retonarClientes(){
		return clientes;
	}
	
	
}

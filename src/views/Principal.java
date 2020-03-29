package views;
//MVC - Separacao do projeto em camadas
//Model - Camada das classes de modelo
//View - Camada de visualizacao - Classes que interagem com o usuario
//Controller - 

import utils.Console;

public class Principal {

	public static void main(String[] args) {
		
		int opcao;
		do {
			System.out.println("\n -- PROJETO DE VENDAS --\n ");
			System.out.println("1 - Cadastrar clientes");
			System.out.println("2 - Listar clientes");
			System.out.println("3 - Cadastrar Vendedor");
			System.out.println("4 - Listar Vendedor");
			System.out.println("0 - Sair");
			opcao = Console.readInt("\nDigite a opção escolhida: ");
			
			switch (opcao) {
			case 1:		
				CadastrarCliente.renderizar();
				break;
			case 2:
				ListarClientes.renderizar();
				break;
			case 3:		
				CadastrarVendedor.renderizar();
				break;
			case 4:
				//ListarVendedores.renderizar();
				break;	
			case 0:
				System.out.println("\nSaindo...");
				break;
			default:
				System.out.println("\n -- OPÇÃO INVÁLIDA!!! --\n ");
				break;
			}  
			
		} while (opcao != 0);
	}
}










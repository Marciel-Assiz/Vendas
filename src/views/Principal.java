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
			System.out.println("4 - Listar funcionários");
			System.out.println("5 - Cadastrar produto");
			System.out.println("6 - Listar produtos");
			System.out.println("7 - Cadastrar venda");
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
				CadastrarFuncionario.renderizar();
				break;
			case 4:
				ListarFuncionarios.renderizar();
				break;
			case 5:		
				CadastrarProduto.renderizar();
				break;
			case 6:
				ListarProdutos.renderizar();
				break;
			case 7:
				CadastrarVenda.renderizar();
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










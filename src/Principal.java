
public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int opcao;
		
		do 
		{
			System.out.println("********* PROJETOS DE VENDAS - JAVA *********\n");
			System.out.println("1 – Cadastrar Cliente");
			System.out.println("2 – Listar Clientes");
			System.out.println("3 – Cadastrar Vendedor");
			System.out.println("4 – Listar Vendedores");	
			System.out.println("5 – Cadastrar Produto");
			System.out.println("6 – Listar Produtos");
			System.out.println("7 – Registrar Venda");
			System.out.println("8 – Listar Vendas");
			System.out.println("9 – Listar Vendas por Cliente");
			System.out.println("0 – Sair");
			
			opcao = Console.readInt("\nDigite uma Opção? (0 – Sair) ");
			
			switch (opcao) 
			{
			case 1:
				CadastrarClientes.renderizar();
				break;
				
			case 2:
				ListarCliente.renderizar();
				break;
			case 3:
				CadastrarVendedores.renderizar();
				break;
			case 4:
				ListarCliente.renderizar();
				break;
			case 5:
				CadastrarProduto.renderizar();
				break;
			case 6:
				ListarProdutos.renderizar();
				break;
			case 7:
				RegistrarVenda.renderizar();
				break;
			case 0:
				System.out.println("\n********* FIM PROJETOS DE VENDAS - JAVA *********");
				break;
			default:
				System.out.println("\n********* OPÇÃO INVÁLIDA *********");
				break;
			}
				
		} while (opcao != 0);
	}	
}

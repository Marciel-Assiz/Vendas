
public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int opcao=1;
		
		do 
		{
			System.out.println("1 – Cadastrar Cliente");
			System.out.println("2 – Listar de Clientes");
			System.out.println("3 – Cadastrar de Vendedor");
			System.out.println("4 – Listar de Vendedores");	
			System.out.println("5 – Cadastrar de Produto");
			System.out.println("6 – Listar de Produtos");
			System.out.println("7 – Registrar Venda");
			System.out.println("8 – Listar Vendas");
			System.out.println("9 – Listar Vendas por Cliente");
			System.out.println("0 – Sair");
			
			opcao = Console.readInt("\nEscolha uma Opção? (0 – Sair) ");
				
		} while (opcao != 0);
		
		switch (opcao) 
		{
		case 1:
			//CadastrarCliente();
			System.out.println("********* PROJETOS DE VENDAS - JAVA *********\n");
			String nome = Console.readString("\nDigite o seu nome: ");
			String cpf 	= Console.readString("\nDigite o seu nome: ");
			System.out.println("Seja bem vindo(a) " +nome+ " CPF: "+cpf);
			break;
			
		case 2:
			
			break;

		default:
			break;
		}

	}

}

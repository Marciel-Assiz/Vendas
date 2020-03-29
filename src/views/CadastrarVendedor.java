package views;
import dao.VendedorDAO;
import models.Vendedor;
import utils.Console;
import utils.Validacao;

public class CadastrarVendedor {
	
	private static Vendedor v = new Vendedor();
	
	public static void renderizar() {
		
		v = new Vendedor();
		
		System.out.println("\n -- CADASTRAR VENDEDOR --\n ");
		
		// atributos
		v.setNome(Console.readString("Digite seu nome: "));
		v.setCpf(Console.readString("Digite seu CPF(sem pontos): "));
		
		// Validar CPF aqui
		if (Validacao.validarCpf(v.getCpf() )) {	// chama o metodo validarCpf da classe validacao e manda o CPF como parametro
			// Envia os dados do vendedor a classe DAO para Acessar os Dados do Obj
			if (VendedorDAO.cadastrarVendedor(v) ) {	
				System.out.println("\n VENDEDOR CADASTRADO!!!\n");
			} else {
				System.out.println("\nESSE VENDEDOR JÁ EXISTE!!!\n");
		 	}
		} else {
			// Caso os dados do CPF retornarem false na classe Validacao, msg de erro
			System.out.println("\nCPF inválido!");
		}
	}
	
}

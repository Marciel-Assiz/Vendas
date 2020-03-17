import java.io.IOException; // Para trabalhar com as exececoes
import java.io.File;  // Import the File class(para arquivos de textos)
import java.io.FileWriter;   // Import the FileWriter class, para escrita
import java.util.Scanner; // Import the Scanner class, para ler(scanear) os arquivos txt's

public class ClienteTxt {
 
/*	 metodo responsavel para criar ou carregar o arquivo ("cliente.txt") 
	public static void LoadTxt() {
	    try {
	        File clienteTxt = new File("cliente.txt");
	        if (clienteTxt.createNewFile()) {
	          System.out.println("\n\nArquivo: "+clienteTxt.getName()+" criado com sucesso!");
	        } else {
	          System.out.println("\n\nArquivo: "+clienteTxt.getName()+" lido com sucesso!");
	        }
	      } catch (IOException e) {
	        System.out.println("\n\nErro ao criar arquivo.");
	        e.printStackTrace(); // Printa o erro da exception
	      }
	}*/
	
	/* metodo responsavel para criar ou carregar o arquivo ("cliente.txt") */
	public static void LoadTxt() {
		try {
			// crie um arquivo:
			File file = new File("nomedoaquivo.dat");

			// crie o leitor para o aquivo:
			ObjectOutStream output = new ObjectOutputSteam(new FileOutPutStream(file));

			// grave o objeto com: output.writeObject(list);

		} catch (IOException e) {
			System.out.println("\n\nErro ao criar arquivo.");
			e.printStackTrace(); // Printa o erro da exception
		}
	}
	
	
	/* metodo responsavel para escrever o arquivo ("cliente.txt") */
	public static void writeTxt() {
	    try {
	        FileWriter clienteTxt = new FileWriter("cliente.txt");
	        clienteTxt.write("hello Word!");
	        clienteTxt.close();
	        System.out.println("Cliente criado com sucesso!");     
	      } catch (IOException e) {
	        System.out.println("\n\nErro ao editar o arquivo.");
	        e.printStackTrace(); // Printa o erro da exception
	      }
	}
	
	/* metodo responsavel para ler o arquivo ("cliente.txt") */
	public static void readTxt() {
	    try {
	        File clienteTxt = new File("cliente.txt");
	        Scanner clienteRead = new Scanner(clienteTxt);
	        while (clienteRead.hasNextLine()) { 
	          String dados = clienteRead.nextLine(); // a string dados recebe o valor de linha a linha
	          System.out.println(dados);
	        }
	        clienteRead.close(); // fechando para leitura
	      } catch (IOException e) {
	        System.out.println("\n\nErro ao editar o arquivo.");
	        e.printStackTrace(); // Printa o erro da exception
	      }
	}    
	
}

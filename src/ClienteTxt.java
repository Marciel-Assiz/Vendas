import java.io.IOException; // Para trabalhar com as exececoes
import java.io.File;  // Import the File class(para arquivos de textos)

public class ClienteTxt {
 
	public static void LoadTxt() {
	    try {
	        File clienteTxt = new File("cliente.txt");
	        if (clienteTxt.createNewFile()) {
	          System.out.println("\n\nArquivo: "+clienteTxt.getName()+" criadom com sucesso!");
	        } else {
	          System.out.println("\n\nArquivo: "+clienteTxt.getName()+" lido com sucesso!");
	        }
	      } catch (IOException e) {
	        System.out.println("\n\nErro ao criar arquivo.");
	        e.printStackTrace(); // Printa o erro da exception
	      }
	}    
}

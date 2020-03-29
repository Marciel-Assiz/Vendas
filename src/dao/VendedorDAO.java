package dao;
import java.util.ArrayList;
import models.Vendedor;

//DAO - Data Access Object
public class VendedorDAO {
	
	private static ArrayList<Vendedor> vendedores = new ArrayList<Vendedor>();
	
	public static Boolean cadastrarVendedor(Vendedor v) {
		for (Vendedor vendedorCadastrado : vendedores) {
			if(vendedorCadastrado.getCpf().equals(v.getCpf() )) {
				return false;
			}
		}
		vendedores.add(v);
		return true;
	}
	
	public static ArrayList<Vendedor> retornarVendedores() {
		return vendedores; 
	}
}

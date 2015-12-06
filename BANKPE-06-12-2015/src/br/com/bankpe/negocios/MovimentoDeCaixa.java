package br.com.bankpe.negocios;

import java.util.ArrayList;
//import java.util.Collections;
import java.util.List;

public class MovimentoDeCaixa {

	public static void main(String[] args) {
		
		ContaCorrente c1 = new ContaCorrente(0, "11111-1", null, null, 2310, 0, 0, 0, null, true);
		ContaCorrente c2 = new ContaCorrente(0, "22222-2", null, null, 50, 0, 0, 0, null, true);	
		ContaCorrente c3 = new ContaCorrente(0, "33333-3", null, null, 455, 0, 0, 0, null, true);	

		List<ContaCorrente> contas = new ArrayList<ContaCorrente>();
		
		contas.add(c1);
		contas.add(c2);
		contas.add(c3);
		
		System.out.println(contas);
		
//		Collections.sort(contas);
		
		System.out.println(contas);
		System.out.println("");

		for(ContaCorrente cp: contas){
			System.out.println(cp.toString());
		}
		
	}

}

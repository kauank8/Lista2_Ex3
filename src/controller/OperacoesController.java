package controller;

import br.com.KauanPaulino.ListaInt.Lista_Int;

public class OperacoesController {
	public void condicoes(Lista_Int l, int[] vt) {
		int tamanhovt = vt.length;
		boolean status;
		for(int i=0;i<tamanhovt;i++) {
			int tamanho=l.size();
			status=true;
			//verifica se ja tem na lista;
			for(int x=0;x<tamanho;x++) {
				int valor;
				try {
					valor = l.get(x);
					if(vt[i]==valor) {
						l.addLast(vt[i]);
						x=tamanho;
						status=false;
					}
				} catch (Exception e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				
			}
			if(status==true) {
				//verifica se é impar 
			if(vt[i]%2==0) {
				try {
					l.add(vt[i], 2);
				} catch (Exception e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
			//verifica se é impar
			if(vt[i]%2==1) {
				try {
					l.add(vt[i], 1);
				} catch (Exception e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		}
	}
		
		//mostra lista
		int tamanhoL= l.size();
		for(int y=0;y<tamanhoL;y++) {
			int valor;
			try {
				valor = l.get(y);
				System.out.print(valor+" ");
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		
			}
		System.out.println("\n" + tamanhoL);
		
	}
}

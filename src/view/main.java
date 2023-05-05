package view;

import br.com.KauanPaulino.ListaInt.Lista_Int;
import controller.OperacoesController;

public class main {

	public static void main(String[] args) {
		Lista_Int l = new Lista_Int();
		l.addFirst(1);
		try {
			l.addLast(2);
			l.addLast(6);
			l.addLast(7);
			l.addLast(8);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		int vt[] = {3,3,9,6,9,8,9,5,7,10,4,8,10,8};
		OperacoesController op = new OperacoesController();
		op.condicoes(l, vt);		
	}

}

package engine;

/* 
********************************** Classe *************************************
* Nome: Teclado                                                               *
* Descri��o: Classe previamente preparada para a intera��o com o dispositivo  *
* de teclado.                                                                 *
*******************************************************************************
*/

import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

public class Teclado extends KeyAdapter{
	
		// Vari�veis vitais
		Eventos GerenteDeEventos;
		
		//Fun��o ativada quando uma tecla � pressionada
		public void keyPressed(KeyEvent e) {
			
			//EXEMPLO
			new Eventos().teclaApertada(e);
			
		}

		//Fun��o ativada quando uma tecla pressionada � liberada
		public void keyReleased(KeyEvent e) {
			
			//EXEMPLO
			new Eventos().teclaSolta(e);
			
		}

}

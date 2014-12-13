package engine;

/* 
********************************** Classe *************************************
* Nome: Teclado                                                               *
* Descrição: Classe previamente preparada para a interação com o dispositivo  *
* de teclado.                                                                 *
*******************************************************************************
*/

import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

public class Teclado extends KeyAdapter{
	
		// Variáveis vitais
		Eventos GerenteDeEventos;
		
		//Função ativada quando uma tecla é pressionada
		public void keyPressed(KeyEvent e) {
			
			//EXEMPLO
			new Eventos().teclaApertada(e);
			
		}

		//Função ativada quando uma tecla pressionada é liberada
		public void keyReleased(KeyEvent e) {
			
			//EXEMPLO
			new Eventos().teclaSolta(e);
			
		}

}

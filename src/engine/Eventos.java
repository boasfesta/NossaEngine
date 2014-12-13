package engine;

/* 
********************************** Classe *************************************
* Nome: Eventos                                                               *
* Descri��o: Nesta classe voc� adicionar� todos os eventos que ser�o          *
* respons�veis pelo mecanismo do jogo, seja ele qual for, esta �rea �         *
* especial e unicamente reservado para voc�, desenvolvedor.                   *
*******************************************************************************
*/

import java.awt.event.KeyEvent;

public class Eventos {
	
	
	// *** Vari�veis ***
	
	// Inteiras
	static int dx, dy;
	
	// Textos
	
	// Flutuantes
	
	// Variadas
	
	// *****************

	
	// *** M�todos ***
	
	public void teclaApertada(KeyEvent tecla){
		
		int codigo = tecla.getKeyCode();
		
		if(codigo == KeyEvent.VK_UP){
			dy = -1;
		}else if(codigo == KeyEvent.VK_DOWN){
			dy = 1;
		}else if(codigo == KeyEvent.VK_LEFT){
			dx = -1;
		}else{
			dx = 1;
		}
	}
	
	public void teclaSolta(KeyEvent tecla){
		
		int codigo = tecla.getKeyCode();
		
		if(codigo == KeyEvent.VK_UP){
			dy = 0;
		}else if(codigo == KeyEvent.VK_DOWN){
			dy = 0;
		}else if(codigo == KeyEvent.VK_LEFT){
			dx = 0;
		}else{
			dx = 0;
		}
	}
	
}

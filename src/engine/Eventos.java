package engine;

/* 
********************************** Classe *************************************
* Nome: Eventos                                                               *
* Descrição: Nesta classe você adicionará todos os eventos que serão          *
* responsáveis pelo mecanismo do jogo, seja ele qual for, esta área é         *
* especial e unicamente reservado para você, desenvolvedor.                   *
*******************************************************************************
*/

import java.awt.event.KeyEvent;

public class Eventos {
	
	
	// *** Variáveis ***
	
	// Inteiras
	static int dx, dy;
	
	// Textos
	
	// Flutuantes
	
	// Variadas
	
	// *****************

	
	// *** Métodos ***
	
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

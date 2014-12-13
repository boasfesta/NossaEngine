package engine;

/* 
********************************** Classe *************************************
* Nome: Objeto2D                                                              *
* Descrição: Classe utilizada para a instanciação de objetos 2D.              *
*******************************************************************************
*/

import java.awt.Image;
import java.awt.event.KeyEvent;

import javax.swing.ImageIcon;

public class Objeto2D {
	
	private int x, y;
	private Image Sprite;
	private boolean Visivel = true;

	public Objeto2D(String Textura, int x, int y){
		ImageIcon referencia = new ImageIcon(Textura);
		Sprite = referencia.getImage();
		
		this.x = x;
		this.y = y;
	}
	
	public void mover(int dx, int dy){
		x += dx;
		y += dy;
	}
	
	public int posicaoX() {
		return x;
	}
	
	public void posicaoX(int dx) {
		x = dx;
	}

	public int posicaoY() {
		return y;
	}
	
	public void posicaoY(int dy) {
		y = dy;
	}

	public Image sprite() {
		return Sprite;
	}
	
	public boolean estaVisivel() {
		return Visivel;
	}
	
	public void estaVisivel(boolean v) {
		Visivel = v;
	}
}

package engine;

/* 
********************************** Classe *************************************
* Nome: Gerenciamento                                                         *
* Descri��o: Classe principal da execu��o do jogo, carrega consigo os         *
* mecanismos internos utilizados para efetuar a renderiza��o e loop, em geral *
* n�o modifique nada nesta �rea ao menos que tenha elevado conhecimento e     *
* necessidade.                                                                *
*******************************************************************************
*/

import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

import javax.swing.ImageIcon;
import javax.swing.JPanel;
import javax.swing.Timer;

public class Gerenciamento extends JPanel implements ActionListener{
	
	private Timer timer;
	private Game Jogo;
	
	public Gerenciamento(){
		iniciarPrincipal();
		iniciarTeclado();
		
		Jogo = new Game();
		
		timer = new Timer(5, this);
		timer.start();
	}
	
	private void Loop() {
		Jogo.Atualizar();
		// Redesenhar
		repaint();
	}
	
	public void Renderizar(Graphics g) {
		
		Jogo.Grafico.iniciarCena((Graphics2D) g);
		Jogo.Desenhar(g);
		
		// Finalizar Cena
		g.dispose();
		
	}

	
	// ** Programa��o interna **
	
	public void actionPerformed(ActionEvent arg0) {
		Loop();
	}
	
	void iniciarPrincipal() {
		setDoubleBuffered(true);
		setFocusable(true);
	}
	
	void iniciarTeclado() {
		addKeyListener(new Teclado());
	}
	
	public void paint(Graphics g){
		Renderizar(g);
	}
	
}

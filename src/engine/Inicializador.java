package engine;
import java.awt.event.KeyEvent;

import javax.swing.JFrame;

/* 
********************************** Classe *************************************
* Nome: Inicializador                                                         *
* Descri��o: Classe respons�vel pelas configura��es mais b�sicas do jogo,     *
* utilizado apenas para inici�-lo de forma adequada.                          *
* N�o fa�a suas configura��es nesta classe, para tal, utilize a classe        *
* "configuracoes.java". Modifique esta classe apenas em caso de necessidade   *
* da adi��o de alguma configura��o extra no jogo.                             *
*******************************************************************************
*/

public class Inicializador extends JFrame {
	
	public Inicializador(){
		add(new Gerenciamento());
		Configuracoes config = new Configuracoes();
		tituloDoJogo(config.TITULO);
		tamanhoDaJanela(config.LARGURA, config.ALTURA);
		janelaRedimensionavel(config.JANELA_REDIMENSIONAVEL);
		finalizarConfiguracao();
	}
	
	public static void main(String[] args){
		new Inicializador();
	}
	
	void tituloDoJogo(String titulo) {
		setTitle(titulo);
	}
	
	void tamanhoDaJanela(int largura, int altura) {
		setSize(largura,altura);
	}
	
	void janelaRedimensionavel(boolean valor) {
		setResizable(valor);
	}
	
	void finalizarConfiguracao() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLocationRelativeTo(null);
		setVisible(true);
	}

}

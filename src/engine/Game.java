package engine;

/* 
********************************** Classe *************************************
* Nome: Game                                                                  *
* Descri��o: Esta classe � unicamente respons�vel pelos eventos que acontecem *
* dentro do jogo. Os eventos s�o divididos em 3 partes, Carregar, atualizar e *
* desenhar:                                                                   *
*                                                                             *
* -Carregar = Fun��o utilizada apenas no in�cio do jogo, respons�vel por      *
* iniciar todos os recursos gr�ficos e n�o-gr�ficos que utilizaremos ao       *
* decorrer do projeto.                                                        *
*                                                                             *
* -Atualizar = Fun��o respons�vel por efetuar as atualiza��es l�gicas no game,*
* tais como c�lculo de vida, movimento, uso de habilidade, entre outros. N�o  *
* utilize esta fun��o para desenhar gr�ficos, para este, utilize a pr�xima.   *
*                                                                             *
* -Desenhar = Fun��o essencialmente reservada para a desenhar os gr�ficos     *
* de nosso jogo. Novamente, n�o utilize esta fun��o para nenhum ajuste de     *
* vari�vel ou outro processo que n�o seja respons�vel por desenhar, mesmo que *
* sua fun��o seja relacionada � graficos, para tal, utilize a fun��o          *
* "Atualizar". Por padr�o, a fun��o Desenhar tem como referencia o sistema    *
* de renderiza��o gen�rica que desenha todos os objetos vis�veis, tal fun��o  *
* � encontrada na classe DispositivoGr�fico.java.                             *
*******************************************************************************
*/

import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.event.ActionListener;

import javax.swing.JPanel;


public class Game extends JPanel{
	
	private Objeto2D fundo;
	private Objeto2D nave;
	
	// M�dulos da engine
	private Eventos GerenteDeEventos;
	public DispositivoGrafico Grafico;
	
	public Game() {
		GerenteDeEventos = new Eventos();
		Grafico = new DispositivoGrafico();
		Carregar();
	}
	
	public void Carregar() {
		fundo = Grafico.carregarObjeto("res\\fundo.png", 0, 0);
		nave = Grafico.carregarObjeto("res\\nave.gif", 100, 100);
	}
	
	public void Atualizar() {
		nave.mover(GerenteDeEventos.dx, GerenteDeEventos.dy);
	}
	
	public void Desenhar(Graphics g) {
		Grafico.Desenhar();
	}
	
}

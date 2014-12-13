package engine;

/* 
********************************** Classe *************************************
* Nome: Game                                                                  *
* Descrição: Esta classe é unicamente responsável pelos eventos que acontecem *
* dentro do jogo. Os eventos são divididos em 3 partes, Carregar, atualizar e *
* desenhar:                                                                   *
*                                                                             *
* -Carregar = Função utilizada apenas no início do jogo, responsável por      *
* iniciar todos os recursos gráficos e não-gráficos que utilizaremos ao       *
* decorrer do projeto.                                                        *
*                                                                             *
* -Atualizar = Função responsável por efetuar as atualizações lógicas no game,*
* tais como cálculo de vida, movimento, uso de habilidade, entre outros. Não  *
* utilize esta função para desenhar gráficos, para este, utilize a próxima.   *
*                                                                             *
* -Desenhar = Função essencialmente reservada para a desenhar os gráficos     *
* de nosso jogo. Novamente, não utilize esta função para nenhum ajuste de     *
* variável ou outro processo que não seja responsável por desenhar, mesmo que *
* sua função seja relacionada á graficos, para tal, utilize a função          *
* "Atualizar". Por padrão, a função Desenhar tem como referencia o sistema    *
* de renderização genérica que desenha todos os objetos visíveis, tal função  *
* é encontrada na classe DispositivoGráfico.java.                             *
*******************************************************************************
*/

import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.event.ActionListener;

import javax.swing.JPanel;


public class Game extends JPanel{
	
	private Objeto2D fundo;
	private Objeto2D nave;
	
	// Módulos da engine
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

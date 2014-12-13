package engine;

/* 
********************************** Classe *************************************
* Nome: Dispositivo Gráfico                                                   *
* Descrição: Classe responsável pelo suporte ao dispositivo gráfico. Evite    *
* de fazer alterações aqui, a não ser que haja necessidade de alguma          *
* modificação na estrutura gráfica.                                           *
*******************************************************************************
*/

import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.image.ImageObserver;

public class DispositivoGrafico {
	
	static Graphics2D grafico;
	
	private Cache meuCache;
	
	private int i;
	
	public DispositivoGrafico() {
		meuCache = new Cache();
	}
	
	public Objeto2D carregarObjeto(String textura, int x, int y) {
		Objeto2D objeto = new Objeto2D(textura, x, y);
		meuCache.adicionarObjeto(objeto);
		return objeto;
	}
	
	void iniciarCena(Graphics2D cache) {
		grafico = cache;
	}
	
	void Desenhar() {
		for (i = 0; i <= meuCache.totalObjetos; i++) {
			if (meuCache.Objetos[i].estaVisivel()) {
				grafico.drawImage(meuCache.Objetos[i].sprite(), meuCache.Objetos[i].posicaoX(), meuCache.Objetos[i].posicaoY(), null);
				}
		}
	}
	
}

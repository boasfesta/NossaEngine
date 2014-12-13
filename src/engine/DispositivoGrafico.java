package engine;

/* 
********************************** Classe *************************************
* Nome: Dispositivo Gr�fico                                                   *
* Descri��o: Classe respons�vel pelo suporte ao dispositivo gr�fico. Evite    *
* de fazer altera��es aqui, a n�o ser que haja necessidade de alguma          *
* modifica��o na estrutura gr�fica.                                           *
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

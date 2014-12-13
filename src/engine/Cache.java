package engine;

/* 
********************************** Classe *************************************
* Nome: Cache de objetos                                                      *
* Descrição: Classe interna utilizada unicamente para a armazenagem de caches *
* do jogo.                                                                    *
*******************************************************************************
*/

public class Cache {

	public static Objeto2D[] Objetos;
	
	public static int totalObjetos = 0;
	
	private Configuracoes Config;
	private int i;
	
	public Cache() {
		Config = new Configuracoes();
		Objetos = new Objeto2D[Config.MaximoObjetos];
	}
	
	public boolean adicionarObjeto(Objeto2D objeto) {
		i = 0;
		do {
			if (Objetos[i] == null) {
				Objetos[i] = objeto;
				totalObjetos = i;
				return true;
			}
			i++;
		} while (i <= Config.MaximoObjetos);
		return false;
	}
}

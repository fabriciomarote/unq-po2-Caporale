package unq.edu.ar.po2.tp11.TempleteYAdapter.Wikipedia;

public class MismaLetraInicial {
	
    public MismaLetraInicial() {}
	
	/**
	 * Devuelve true si ambas paginas empiezan con la misma letra
	 */
	public Boolean esSimilar(WikipediaPage pagina, WikipediaPage otraPagina) {
		Boolean esSimilar = false;
		
		String tituloPagina = pagina.getTitle();
		String tituloOtraPagina = otraPagina.getTitle();
		
		if(tituloPagina.charAt(0) == tituloOtraPagina.charAt(0)) {
			esSimilar = true;
		}
		return esSimilar;
	}

}

package unq.edu.ar.po2.tp11.TempleteYAdapter.Wikipedia;

import java.util.List;

public class LinkEnComun extends Filtro{
     
	public LinkEnComun(){}
	
	/**
	 * Devuelve true si las paginas poseen aunque sea una pagina linkeada en comun
	 */
	public Boolean esSimilar(WikipediaPage pagina, WikipediaPage otraPagina) {
		Boolean esSimilar = false;
		
		List<WikipediaPage> linksPagina = pagina.getLinks();
		List<WikipediaPage> linksOtraPagina = otraPagina.getLinks();
		
		for (WikipediaPage link : linksPagina) {
			if(linksOtraPagina.contains(link)) {
				esSimilar = true;
			}
		}
		return esSimilar;
	}
	

}

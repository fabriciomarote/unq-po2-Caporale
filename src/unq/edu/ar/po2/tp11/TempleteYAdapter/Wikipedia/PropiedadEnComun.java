package unq.edu.ar.po2.tp11.TempleteYAdapter.Wikipedia;

import java.util.Map;
import java.util.Set;

public class PropiedadEnComun {
	
    public PropiedadEnComun() {}
	
	/**
	 * Devuelve true si las paginas poseen aunque sea una propiedad del infobox en comun
	 */
	public Boolean esSimilar(WikipediaPage pagina, WikipediaPage otraPagina) {
		Boolean esSimilar = false;
		
		Map<String, WikipediaPage> infoboxPagina = pagina.getInfobox();
		Set<String> propiedadesInfoboxPagina = infoboxPagina.keySet();
		
		Map<String, WikipediaPage> infoboxOtraPagina = otraPagina.getInfobox();
		
		for (String propiedad : propiedadesInfoboxPagina) {
			if(infoboxOtraPagina.containsKey(propiedad)) {
				esSimilar = true;
			}
		}
		return esSimilar;
	}

}

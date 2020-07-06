package unq.edu.ar.po2.tp11.TempleteYAdapter.Wikipedia;

import java.util.List;
import java.util.Map;

public interface WikipediaPage {
	
	String getTitle();
	List<WikipediaPage> getLinks();
	Map<String, WikipediaPage> getInfobox();

}

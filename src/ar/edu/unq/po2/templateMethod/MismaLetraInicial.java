package ar.edu.unq.po2.templateMethod;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class MismaLetraInicial implements WikipediaPage {
	private String title;
	private List<WikipediaPage> links = new ArrayList<WikipediaPage>();
	private Map<String, WikipediaPage> infobox;
	
	@Override
	public String getTitle() {
		return this.title;
	}

	@Override
	public List<WikipediaPage> getLinks() {
		return this.links;
	}

	@Override
	public Map<String, WikipediaPage> getInfobox() {
		return this.infobox;
	}

	@Override
	public List<WikipediaPage> getSimilarPages(WikipediaPage page, List<WikipediaPage> wikipedia) {
		return null;
	}

}

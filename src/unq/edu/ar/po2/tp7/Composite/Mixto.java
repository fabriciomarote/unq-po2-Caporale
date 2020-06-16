package unq.edu.ar.po2.tp7.Composite;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Mixto implements PorcionProductivaDeTierra{
	
	private List<PorcionProductivaDeTierra> porcionProductivaDeTierra;

	public Mixto() {
		this.porcionProductivaDeTierra = new ArrayList<PorcionProductivaDeTierra>();
	}

	@Override
	public int gananciasAnuales() {
		return  this.porcionProductivaDeTierra.stream().mapToInt(porcion -> porcion.gananciasAnuales()/4).sum();
	}

	@Override
	public PorcionProductivaDeTierra getPorciones() {
		return null;
	}
	
	@Override
	public void addPorcionroductivaDeTierra(PorcionProductivaDeTierra p) {
		this.porcionProductivaDeTierra.add(p);
	}

	@Override
	public Cultivo getCultivo() {
		return null;

	}

}

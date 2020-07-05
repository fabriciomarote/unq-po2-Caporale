package unq.edu.ar.po2.tp7.Observer.publicaciones;

public abstract class Interes {

		
		private Investigadora investigadoraSuscripta;
		
		public Interes(Investigadora investigadoraSuscripta) {
			this.investigadoraSuscripta = investigadoraSuscripta;
			investigadoraSuscripta.agregarInteres(this);
		}
		
		public abstract Boolean esDeInteres(Articulo articulo);

}

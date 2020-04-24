package unq.edu.ar.po2.tp3;

/**
 * 
 * @author nataliacaporale
 *
 */
public enum Error {
	
	ERROR_BASE_NEGATIVA(1000, "la base no puede ser negativa"),
	ERROR_ALTURA_NEGATIVA(1001,"la altura no puede ser negativa");
	
	
	
	private int codigo;
    private String descripcion;

    Error(int codigo, String descripcion) {
        this.codigo = codigo;
        this.descripcion = descripcion;
    }

    
    public int getCodigo() {
        return codigo;
    }

    
    public String getDescripcion() {
        return descripcion;
    }

}

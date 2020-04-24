package unq.edu.ar.po2.tp3;

import java.util.ArrayList;
import java.util.List;


public class Counter {


	    private List<Integer> numeros = new ArrayList<Integer>();

	    public void addNumeros(Integer numero){
	        numeros.add(numero);
	    }
	    public Integer cantidadDePares(){
	        int count = (int) numeros.stream().filter(n -> n%2 == 0).count();

	        return  count;
	    }
	 
	    public Integer cantidadDeImpares(){
	        return numeros.size() - cantidadDePares();
	    }
	    public Integer cantidadDeMultiplosDe(Integer numero){
	        return (int) numeros.stream().filter(n->n%numero==0).count();
	    }


	}



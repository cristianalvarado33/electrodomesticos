package awakalabcl;

public class Lavadora extends Electrodomesticos {
	 private final static int CARGADEF=5;
	  
	    
	    private int carga;
	  
	    public Lavadora(){
	        this(PRECIOBASEDEF, PESODEF, CONSUMOENERGETICODEF, COLORDEF, CARGADEF);
	    }
	  
	   
	    public Lavadora(double precioBase, double peso){
	        this(precioBase, peso, CONSUMOENERGETICODEF, COLORDEF, CARGADEF);
	    }
	  
	  
	    public Lavadora(double precioBase, double peso, char consumoEnergetico, String color, int carga){
	        super(precioBase,peso, consumoEnergetico,color);
	        this.carga=carga;
	    }
	
	    
	    public int getCarga() {
	        return carga;
	    }
	  
	  
	    public double precioFinal(){
	    double plus=super.precioFinal();
	  if (carga>30){
	            plus+=50;
	        }
	  return plus;
	    }
	  
	 }

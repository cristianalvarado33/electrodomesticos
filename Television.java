package awakalabcl;

public class Television extends Electrodomesticos {
	private final static int RESOLUCIONDEF=20;
	private static final boolean SINTONIZADORTDT = false;
	
   
	private int resolucion;
    private boolean sintonizadorTDT;
  
    public Television(){
        this(PRECIOBASEDEF, PESODEF, CONSUMOENERGETICODEF, COLORDEF, RESOLUCIONDEF, false);
    }
  
    
    public Television(double precioBase, double peso){
        this(precioBase, peso, CONSUMOENERGETICODEF, COLORDEF, RESOLUCIONDEF, false);
    }
  
   
    public Television(double precioBase, double peso, char consumoEnergetico, String color, int resolucion, boolean sintonizadorTDT){
        super(precioBase, peso, consumoEnergetico, color);
        this.resolucion=resolucion;
        this.sintonizadorTDT=sintonizadorTDT;
    }
    
    
    public int getResolucion() {
		return resolucion;
	}


	public boolean isSintonizadorTDT() {
		return sintonizadorTDT;
	}


	public double precioFinal(){
       
        double aux1 =super.precioFinal();
  
        
        if (resolucion>40){
            aux1+=precioBase*0.3;
        }
        if (sintonizadorTDT){
            aux1+=50;
        }
  
        return aux1;
    }
  
   
   
}


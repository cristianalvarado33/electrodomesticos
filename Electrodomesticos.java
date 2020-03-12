package awakalabcl;

public class Electrodomesticos {
	
	protected final static String COLORDEF = "blanco";
    protected final static char CONSUMOENERGETICODEF = 'F';
    protected final static double PRECIOBASEDEF = 100;
    protected final static double PESODEF = 5;
   
    public Electrodomesticos(){
        this(PRECIOBASEDEF, PESODEF, CONSUMOENERGETICODEF, COLORDEF);
    }
   
   
    public Electrodomesticos(double precioBase, double peso){
        this(precioBase, peso, CONSUMOENERGETICODEF, COLORDEF);
    }
   
    
    public Electrodomesticos(double precioBase, double peso, char consumoEnergetico, String color){
        this.precioBase=precioBase;
        this.peso=peso;
        comprobarConsumoEnergetico(consumoEnergetico);
        comprobarColor(color);
    }
  
    public double getPrecioBase() {
        return precioBase;
    }
    
    public String getColor() {
        return color;
    }
   
     
    public char getConsumoEnergetico() {
        return consumoEnergetico;
    }
   
    public double getPeso() {
        return peso;
    }
   
    protected double precioBase;
    protected String color;
    protected char consumoEnergetico;
    protected double peso;
   
    public void comprobarConsumoEnergetico(char consumoEnergetico){
        if(consumoEnergetico>=65 && consumoEnergetico<=70){
          this.consumoEnergetico=consumoEnergetico;
      }else{
          this.consumoEnergetico=CONSUMOENERGETICODEF;
      }
    }
   
    private void comprobarColor(String color){
    String colores[]={"blanco", "negro", "rojo", "azul", "gris"};
        boolean encontrado=false;
   for(int i=0;i<colores.length && !encontrado;i++){
               if(colores[i].equals(color)){
                encontrado=true;
            }
              
        if(encontrado){
            this.color=color;
        }else{
            this.color=COLORDEF;
        }
   }
    }
          
       public double precioFinal(){
        double aux=0;
        switch(consumoEnergetico){
            case 'A':
            	aux+=100;
                break;
            case 'B':
            	aux+=80;
                break;
            case 'C':
            	aux+=60;
                break;
            case 'D':
            	aux+=50;
                break;
            case 'E':
            	aux+=30;
                break;
            case 'F':
            	aux+=10;
                break;
        }
   
        if(peso>=0 && peso<19){
        	aux+=10;
        }else if(peso>=20 && peso<49){
        	aux+=50;
        }else if(peso>=50 && peso<=79){
        	aux+=80;
        }else if(peso>=80){
        	aux+=100;
        }
   
        return precioBase+aux;
    }
   }


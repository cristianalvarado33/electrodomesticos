package awakalabcl;

public class Ejecuta {

	public static void main(String[] args) {
		
		Electrodomesticos listaElectro[]=new Electrodomesticos[10];
	        listaElectro[0] = new Electrodomesticos(200, 60, 'C', "amarillo");
	        listaElectro[1] = new Lavadora(200, 10, 'E', "blanco", 30);
	        listaElectro[2] = new Television(500, 80, 'E', "negro", 42, false);
	        listaElectro[3] = new Electrodomesticos(40, 20);
	        listaElectro[4] = new Television(300, 50);
	        listaElectro[5] = new Electrodomesticos(200, 10, 'D', "rojo");
	        listaElectro[6] = new Lavadora(400, 100, 'A', "azul", 15);
	        listaElectro[7] = new Electrodomesticos();
	        listaElectro[8] = new Lavadora(220, 60);
	        listaElectro[9] = new Television(150, 30, 'B', "blanco", 40, true);
	   
	        double sumaLavadoras=0;
	        double sumaTelevisiones=0;
	        double sumaElectrodomesticos=0;
	       
	       for(int i=0;i<listaElectro.length;i++){
	        
	            if(listaElectro[i] instanceof Electrodomesticos){
	                sumaElectrodomesticos+=listaElectro[i].precioFinal();
	            }
	            if(listaElectro[i] instanceof Lavadora){
	                sumaLavadoras+=listaElectro[i].precioFinal();
	            }
	            if(listaElectro[i] instanceof Television){
	                sumaTelevisiones+=listaElectro[i].precioFinal();
	            }
	        }
	   
	    
	        System.out.println("suma del precio electrodomesticos es "+sumaElectrodomesticos);
	        System.out.println("suma del precio las lavadoras es "+sumaLavadoras);
	        System.out.println("suma del precio las televisiones es  "+sumaTelevisiones);
	   
	    }
	   
	
	}



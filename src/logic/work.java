package logic;

public class work {
	
	   
	    public static String name(String cadena)	{
	    String [] palabras=cadena.split(" ");// se va a dividir cada que encuentre un espacio vacio
	    	String resultado = null;
	    	StringBuilder result=new StringBuilder(); 
	    for(int i=0;i<palabras.length;i++)	{
			//se obtiene la primer letra de cada palabra
			String palabra=palabras[i];
			try	{
			String iniciales=palabra.substring(0,1); String second=palabra.substring(1);
			String Mayor = iniciales.toUpperCase();
			String end=Mayor + second;
			result.append(end).append(" ");
			}catch( java.lang.StringIndexOutOfBoundsException excepcion) {// se gestiona cuando existan mas de dos espacios 
				
			}
		}
		
		System.out.println();
			return result.toString();
	    	
	    }
	    
	  //se define el metodo para convertir y comparar el numero egolatra
	     public static boolean isEgolat( int number){
	    	//convierte el numero en una cadena
			 String numberString = Integer.toString(number);
			// vector donde se guardan cada uno de los digitos
			int [] vector= new int[numberString.length()]; 
			//un for para llenar el vector con los digitos correspondientes
			 for (int i = 0; i < numberString.length(); i++) {
		            char digito =numberString.charAt(i);
		    
		          //convierte el caracter en un int
		      vector[i]=Character.getNumericValue(digito); 
		    }
		            
			         
			  int suma=0;
		      for (int i= 0; i < numberString.length(); i++)	{
		      int  resultado=(int)Math.pow(vector[i],numberString.length());// eleva cada uno de los digitos por la longitud
		      suma=suma+resultado;
		            }
		      return number == suma;	
		      
		      
}	       
}	




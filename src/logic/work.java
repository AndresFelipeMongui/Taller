package logic;
import java.util.ArrayList;
import java.util.List;
public class work {
	
	
	//Convertir un número ingresado por el usuario a número Romano
		public static String converttoRoman(int number){
	        String [] units = {"","I","II","III","IV","V","VI","VII","VIII","IX"};
	        String [] tens = {"","X","XX","XXX","XL","L","LX","LXX","LXXX","XC"};
	        String [] hundreds = {"","C","CC","CCC","CD","D","DC","DCC","DCCC","CM"};
	        String [] thousands = {"","M","MM","MMM"};
	        int thousand, hundred, ten, unit;

	        thousand = number / 1000;
	        number = number % 1000;
	        hundred = number / 100;
	        number = number % 100;
	        ten = number / 10;
	        number = number % 10;
	        unit = number;

	        return thousands[thousand] + hundreds[hundred] + tens[ten] + units[unit];
	    }

	//Dado un número ingresado por el usuario expresar sus factores primos en potencia
	public static List<Integer> getprimefactors(int number) {
        List<Integer> primefactors = new ArrayList<>();

        for (int i = 2; i <= number; i++) {
            while (number % i == 0) {
                primefactors.add(i);
                number = number / i;
            }
        }

        return primefactors;
    }

     static String getpowerformat(List<Integer> primefactors) {
        StringBuilder powerformat = new StringBuilder();

        int count = 1;
        int factorPrev = primefactors.get(0);

        for (int i = 1; i < primefactors.size(); i++) {
            if (primefactors.get(i) == factorPrev) {
                count++;
            } else {
                powerformat.append(factorPrev).append("^").append(count).append(" * ");
                factorPrev = primefactors.get(i);
                count = 1;
            }
        }

        powerformat.append(factorPrev).append("^").append(count);

        return powerformat.toString();
    }

    private static String getpowerformat(List<Integer> primefactors) {
        StringBuilder powerformat = new StringBuilder();

        int count = 1;
        int factorAnterior = primefactors.get(0);

        for (int i = 1; i < primefactors.size(); i++) {
            if (primefactors.get(i) == factorAnterior) {
                count++;
            } else {
                powerformat.append(factorAnterior).append("^").append(count).append(" * ");
                factorAnterior = primefactors.get(i);
                count = 1;
            }
        }

        powerformat.append(factorAnterior).append("^").append(count);

        return powerformat.toString();
    }
		  

		    public static String calcFactors(int number){

		        return null;
		    }
	
	   
	    public static String name(String chain)	{
	    String [] words=chain.split(" ");// se va a dividir cada que encuentre un espacio vacio
	    	String resultado = null;
	    	StringBuilder result=new StringBuilder(); 
	    for(int i=0;i<words.length;i++)	{
			//se obtiene la primer letra de cada palabra
			String word=words[i];
			try	{
			String iniciales=word.substring(0,1); String second=word.substring(1);
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




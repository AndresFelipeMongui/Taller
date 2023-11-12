package logic;

import java.util.ArrayList;
import java.util.List;
import java.util.Arrays;
import java.util.Comparator;

public class work {
	
	
	/**
     * Converts a number to its Roman numeral representation.
     *
     * @param number The number to convert.
     * @return The Roman numeral representation of the number.
     */
    public static String converttoRoman(int number) {
    	// Method logic to convert a number to a Roman numeral
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

    /**
     * Retrieves the prime factors of a given number.
     *
     * @param number The number to factorize.
     * @return A list of the prime factors of the given number.
     */
    public static List<Integer> getprimefactors(int number) {
    	// Method logic to extract the prime factors of a number
    	 List<Integer> primefactors = new ArrayList<>();

         for (int i = 2; i <= number; i++) {
             while (number % i == 0) {
                 primefactors.add(i);
                 number = number / i;
             }
         }

         return primefactors;
    }
    
    
    /**
     * Generates a power format representation of prime factors.
     *
     * @param primeFactors The list of prime factors.
     * @return The power format representation of the prime factors.
     */
    public static String getpowerformat(List<Integer> primefactors) {
    	// Method logic to create a power format of prime factors
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
    
    /**
     * Converts a text to proper name case.
     *
     * @param chain The text to format.
     * @return The text in proper name format.
     */
    public static String name(String chain) {

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

    /**
     * Checks if a number is a Narcissistic number.
     *
     * @param number The number to verify.
     * @return true if the number is a Narcissistic number, false otherwise.
     */
    public static boolean isEgolat(int number) {

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

    /**
     * Checks if a number is considered a magic number.
     *
     * @param number The number to verify.
     * @return true if the number is a magic number, false otherwise.
     */
    public static boolean isMagicNumber(int number) {

        String numberString = String.valueOf(number);

        if (numberString.length() < 2 || number < 0) {
            return false; // El número no cumple con las condiciones mínimas para ser mágico
        }

        // Ordenando los dígitos en orden ascendente
        Character[] ascending = numberString.chars()
                .mapToObj(c -> (char) c)
                .sorted()
                .toArray(Character[]::new);

        // Convirtiendo el array de Character a String y luego a int
        int ascendingNumber = Integer.parseInt(Arrays.toString(ascending)
                .replaceAll("[,\\s\\[\\]]", ""));

        // Ordenando los dígitos en orden descendente
        Character[] descending = numberString.chars()
                .mapToObj(c -> (char) c)
                .sorted(Comparator.reverseOrder())
                .toArray(Character[]::new);

        // Convirtiendo el array de Character a String y luego a int
        int descendingNumber = Integer.parseInt(Arrays.toString(descending)
                .replaceAll("[,\\s\\[\\]]", ""));

        // Verificar si la diferencia entre los números ordenados es igual al número original
        return descendingNumber - ascendingNumber == number;
    
    }

    /**
     * Checks if two numbers are friend numbers.
     *
     * @param number1 First number to compare
     * @param number2 Second number to compare
     * @return true if the numbers are friend numbers, false if they are not
     */
    public static boolean areFriendNumbers(int number1, int number2) {

        int sum1 = sumDivisors(number1);
        int sum2 = sumDivisors(number2);
        return sum1 == number2 && sum2 == number1;
    
    }


    private static int sumDivisors(int number) {
    	int sum = 1;
    	for (int i = 2; i <= Math.sqrt(number); i++) {
        if (number % i == 0) {
            sum += i;
            if (i != number / i) {
                sum += (number / i);
            }
        }
    }
    return sum;
    }
    
    
    
}









package logic;

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
	  

	    public static String calcFactors(int number){

	        return null;
	    }

	    /**
	     *
	     * @param number
	     * @return
	     */
	    static public boolean isEgolatr( int number){

	        return false;
	    }


	}



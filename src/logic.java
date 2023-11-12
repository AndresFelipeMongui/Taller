import java.util.Scanner;
import java.lang.Math;
import logic.work;
public class logic {
	private Scanner input;
	 public logic() {
	        input = new Scanner(System.in);
	    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner input=new Scanner(System.in);

		   String menu = "<<<<<< MENU PRINCIPAL >>>>>\n\n" +
	                "1.Numeros Romanos\n" +
	                "2.Factores Primos\n" +
	                "3.Nombre Propio\n" +
	                "4.Números Ególatras\n"+
	                "5.Número Mágico\n" +
	                "6.Números Amigos\n"+
	                "X. Salir";
		   char option = 0;
		   do{
	            System.out.println( menu );

				option = input.nextLine().charAt(0);

	            switch(option){
	            case '1' :  work.converttoRoman(option);
				int number;
        			String roman_number;
        			Scanner sc = new Scanner(System.in);
        			System.out.println("Ingrese un numero");
        			number = sc.nextInt();

        			if (number < 1 || number > 3000){
           			 System.out.println("El numero debe de estar entre 1 y 3000");
        			} else {
           			roman_number = work.converttoRoman(number);
          			System.out.println(number + " en numero romano es: " + roman_number);
       				}
        			sc.close();
	                break;

	                case '2' ://work.getpowerformat(null);
	                	//work.getprimefactors(option);
	                			
				
        		Scanner scanner = new Scanner (System.in);
       			System.out.println("Ingrese un numero");
        		int number2 = scanner.nextInt();
        		List<Integer> primefactors = work.getprimefactors(number2);

        		System.out.println("Los factores primos de " + number2 + " son: " + primefactors);
        		System.out.println("Expresado en formato de potencias: " + work.getpowerformat(primefactors));
        		scanner.close();
    			
	                break;
				    
	                case '3' :work.name(" ") ;
	                Scanner Scan=new Scanner(System.in);
	        		System.out.println("Ingrese el texto");
	        		// se ingresa la cadena y se eliminan los espacios de inicio y final
	        		String chain=Scan.nextLine().trim();
	        		String name=work.name(chain);
	        		System.out.println(name);
	        		
	        		
	        		
	        		
	                break;
	                case '4':work.isEgolat(0);
	                Scanner scan = new Scanner(System.in);
	                int number1=0;
	                boolean letter=false;
	                do	{
	                	// se crea la excepcion cuando el usuario digite una letra       
	                try	{
	       		 System.out.print("Digite el numero: ");
	       		 
	       		  number1 = Integer.parseInt(scan.nextLine());
	       		  letter=true;
	                }catch(java.lang.NumberFormatException excepcion)	
	                {System.out.println("Ingrese un numero");	}
	                }while(letter==false);// solo avanza si se digita un numero
	       		boolean isEgolatra = work.isEgolat(number1);
	       		
			       if(isEgolatra)	{
			    	   System.out.println("El numero ingresado es un numero egolatra");
			       }else	{System.out.println("El numero ingresado no es un numero egolatra");}
	       		 
	                break;
	                case '5':;
	                break;
	                case '6':;
	            }

	        }while (Character.toUpperCase(option) != 'X');
	}
	


}

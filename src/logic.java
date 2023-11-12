import java.util.Scanner;
import java.lang.Math;
import logic.work;
public class logic {
	
	 public logic() {
	       Scanner input = new Scanner(System.in);
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
	                case '1' : ;
	                break;

	                case '2' :;
	                break;
	                case '3' :work.name(" ") ;
	                Scanner Scan=new Scanner(System.in);
	        		System.out.println("Ingrese el texto");
	        		// se ingresa la cadena y se eliminan los espacios de inicio y final
	        		String cadena=Scan.nextLine().trim();
	        		String name=work.name(cadena);
	        		System.out.println(name);
	        		
	        		
	        		
	        		
	                break;
	                case '4':work.isEgolat(0);
	                Scanner scan = new Scanner(System.in);
	                int number=0;
	                boolean letter=false;
	                do	{
	                	// se crea la excepcion cuando el usuario digite una letra       
	                try	{
	       		 System.out.print("Digite el numero: ");
	       		 
	       		  number = Integer.parseInt(scan.nextLine());
	       		  letter=true;
	                }catch(java.lang.NumberFormatException excepcion)	
	                {System.out.println("Ingrese un numero");	}
	                }while(letter==false);// solo avanza si se digita un numero
	       		boolean isEgolatra = work.isEgolat(number);
	       		
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

import java.util.Scanner;
import logic.work;
public class logic {
	private Scanner input;
	
	 public logic() {
	        input = new Scanner(System.in);
	    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner input=new Scanner(System.in);
		System.out.println("este es un mensaje nuevo");
		   String menu = "<<<<<< MENU PRINCIPAL >>>>>\n\n" +
	                "1.Numeros Romanos\n" +
	                "2. Factores Primos\n" +
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
	                case '1' : Roman();
				int number;
        			String roman_number;
        			Scanner sc = new Scanner(System.in);
        			System.out.println("Ingrese un numero");
        			number = sc.nextInt();

        			if (number < 1 || number > 3000){
           			 System.out.println("El numero debe de estar entre 1 y 3000");
        			} else {
           			roman_number = converttoRoman(number);
          			System.out.println(number + " en numero romano es: " + roman_number);
       				}
        			sc.close();
	                break;

	                case '2' :;
	                break;
	                case '3' : ;
	                break;
	                case '4':;
	                break;
	                case '5':;
	                break;
	                case '6':;
	            }

	        }while (Character.toUpperCase(option) != 'X');
	}

	private static void Roman() {
		// TODO Auto-generated method stub
		Scanner input=new Scanner(System.in);
		System.out.println("Ingrese el numero a convertir:");
		int number=input.nextInt();
		
	}

	

}

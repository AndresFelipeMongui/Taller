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

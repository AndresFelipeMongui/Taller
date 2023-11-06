import java.util.Scanner;
import logic.work;
public class logic {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner imput=new Scanner(System.in);
		System.out.println("este es un mensaje nuevo");
		   String menu = "<<<<<< MENU PRINCIPAL >>>>>\n\n" +
	                "1.Numeros Romanos\n" +
	                "2. Egolatras\n" +
	                "3.Opcion 3\n\n" +
	                "X. Salir";
		   char option = 0;
		   do{
	            System.out.println( menu );

				option = imput.nextLine().charAt(0);

	            switch(option){
	                case '1' :;
	                break;

	                case '2' : egolatr();
	                break;

	                case '3' : chains();
	            }

	        }while (Character.toUpperCase(option) != 'X');
	}

	private static void chains() {
		// TODO Auto-generated method stub
		
	}

	private static void egolatr() {
		// TODO Auto-generated method stub
		
	}


}

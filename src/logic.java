

import logic.work;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import javax.swing.JOptionPane;
import java.util.Arrays;

public class logic {
    private Scanner input;

    public logic() {
        input = new Scanner(System.in);
    }

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);
        work w = new work();
        int option;
        int choice = 0;

        do {
            try {
                String input = JOptionPane.showInputDialog("<<<<<< MAIN MENU >>>>> \n" 
                		+ "1. Roman Numbers \n" 
                		+ "2. Prime Factors \n" 
                		+ "3. Proper Name \n" 
                		+ "4. Egomaniac Numbers \n"
                		+ "5. Magic Number \n" 
                		+ "6. Amicable Numbers \n" 
                		+ "0. Exit");

                option = Integer.parseInt(input);

                switch(option) {
                    case 1:
                        
                        Scanner sc1 = new Scanner(System.in);
                        int number = Integer.parseInt(JOptionPane.showInputDialog("Enter a number"));
                        String convertRoman = work.converttoRoman(number);

                        if (number < 1 || number > 3000) {
                            JOptionPane.showMessageDialog(null, "The number must be between 1 y 3000");
                        } else {
                        	String roman_number;
                            roman_number = work.converttoRoman(number);
                            JOptionPane.showMessageDialog(null, number + " in roman number is: " + roman_number);
                        }
                        sc1.close();
                        break;

                    case 2:
                        Scanner sc2 = new Scanner(System.in);
                        int number2 = Integer.parseInt(JOptionPane.showInputDialog(null, "Enter a number"));
                        List<Integer> getFactors = work.getprimefactors(number2);
                        
                        List<Integer> primefactors;
                        primefactors = work.getprimefactors(number2);
                        
                        String getpowerformat;
                        getpowerformat = work.getpowerformat(primefactors);
                        
                        JOptionPane.showMessageDialog(null, "The prime factor of " + number2 + " are: " + primefactors);
                        JOptionPane.showMessageDialog(null, "Expressed in power format: " + getpowerformat);
                        sc2.close();
                        break;

                    case 3 :
                    	
                    	
                    work.name(" ") ;
                    
                    String chain = JOptionPane.showInputDialog("Enter the text");	
                    String trimmedChain = chain.trim();//se eliminan los espacios de inicio y final de la cadena
	        		String name=work.name(chain);
	        		JOptionPane.showMessageDialog(null, name);
	        		
	                break;
	                
	                case 4:work.isEgolat(0);
	                Scanner scan = new Scanner(System.in);
	                int number1=0;
	                boolean letter=false;
	                do	{
	                	// se crea la excepcion cuando el usuario digite una letra  
	                	
	                try	{
	                	number1 = Integer.parseInt(JOptionPane.showInputDialog(null, "Enter a number:"));
	                	
	                	letter=true;
	                	
	                }catch(java.lang.NumberFormatException excepcion){
	                	number1 = Integer.parseInt(JOptionPane.showInputDialog(null, "Enter a number"));	
	                	}
	                }while(letter==false);// solo avanza si se digita un numero
	                boolean egolat = work.isEgolat(number1);
	       		
			       if(egolat)	{
			    	   JOptionPane.showMessageDialog(null, "The number entered is an egomaniac number");
			       }else	{JOptionPane.showMessageDialog(null, "The number entered is NOT an egomaniac number");}
	       		 
	                break;
	                
	                case 5:;
	                int numberToCheck;
                    do {
                        try {
                            numberToCheck = Integer.parseInt(JOptionPane.showInputDialog("Enter a number with at least two digits:"));
                            if (String.valueOf(numberToCheck).length() < 2 || numberToCheck < 0) {
                                JOptionPane.showMessageDialog(null, "Please enter a valid number with at least two digits.");
                                numberToCheck = -1; // Forzar la repetición del bucle
                            }
                        } catch (NumberFormatException e) {
                            JOptionPane.showMessageDialog(null, "Please enter a valid number.");
                            numberToCheck = -1; // Forzar la repetición del bucle
                        }
                    } while (numberToCheck < 0 || String.valueOf(numberToCheck).length() < 2);

                    boolean isMagic = work.isMagicNumber(numberToCheck);

                    if (isMagic) {
                        JOptionPane.showMessageDialog(null, numberToCheck + " is a magic number!");
                    } else {
                        JOptionPane.showMessageDialog(null, numberToCheck + " is not a magic number.");
                    }
	                break;
	                
	                case 6:;
	                try {
                        int num1 = Integer.parseInt(JOptionPane.showInputDialog("Enter the first number:"));
                        int num2 = Integer.parseInt(JOptionPane.showInputDialog("Enter the second number:"));
                        boolean areFriends = work.areFriendNumbers(num1, num2);
                        JOptionPane.showMessageDialog(null, "Are the numbers friends?: " + areFriends);
                    } catch (NumberFormatException e) {
                        JOptionPane.showMessageDialog(null, "Introduce valid numbers please (positive integers).");
                    }
                    break;
                    
                case 0:
                    JOptionPane.showMessageDialog(null, "Goodbye!");
                    break;
	                
                default:
                    JOptionPane.showMessageDialog(null, "Invalid option. Try again, please.");
                }
            

            } catch (NumberFormatException e) {
                JOptionPane.showMessageDialog(null, "Please enter a valid number.");
                choice = -1;
            } catch (NullPointerException e) {
                JOptionPane.showMessageDialog(null, "Goodbye!");
                break;
            }
        } while (choice != 0);
 	
}
	 }
	 

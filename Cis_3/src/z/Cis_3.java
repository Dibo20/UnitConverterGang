package z;
import java.util.Scanner;

public class Cis_3 {

	public static void main(String[] args) {
		

		
		        Scanner Train = new Scanner(System.in);
		        
		        // Print dashes at the top
		        for(int i = 0; i <= 20; i++) {
		            System.out.print("--");
		        }
		        System.out.print("\n Welcome to Unit Converter Calculator");
		        
		        // Print dashes at the bottom
		        System.out.print("\n");
		        for(int p = 0; p <= 20; p++) {
		            System.out.print("--");
		        }
		        
		        // Display the menu options
		        System.out.print("\nMenu Elements: \n 1- Temperature - Press (1) \n 2- Length - Press (2)");
		        System.out.println("\nEnter Your Selection: ");
		        int answer1 = Train.nextInt();
		        
		        // Switch based on the user's first choice
		        switch (answer1) {
		            // Temperature conversion
		            case 1:
		                System.out.println("Enter the temperature value: ");
		                double temp = Train.nextDouble();
		                
		                // Display temperature conversion options
		                System.out.println("Select the conversion:");
		                System.out.println("1. Celsius to Fahrenheit");
		                System.out.println("2. Fahrenheit to Celsius");
		                int answer2 = Train.nextInt();
		                
		                // Perform temperature conversion
		                switch (answer2) {
		                    case 1:
		                        double celsiusToFahrenheit = (temp * 9 / 5) + 32;
		                        System.out.println(temp + " degrees Celsius is equal to " + celsiusToFahrenheit + " degrees Fahrenheit.");
		                        break;
		                    case 2:
		                        double fahrenheitToCelsius = (temp - 32) * 5 / 9;
		                        System.out.println(temp + " degrees Fahrenheit is equal to " + fahrenheitToCelsius + " degrees Celsius.");
		                        break;
		                    default:
		                        System.out.println("Invalid choice.");
		                }
		                break;
		            
		            // Length conversion
		            case 2: 
		                System.out.println("Enter unit to convert from:");
		                String unitFrom = Train.next();
		                
		                System.out.println("Enter unit to convert to:");
		                String unitTo = Train.next();
		                
		                System.out.println("Select the conversion:");
		                int lengthConversion = Train.nextInt();
		                
		                // Perform length conversion
		                switch (lengthConversion) {
		                    // Add cases for different length conversions
		                    default:
		                        System.out.println("Invalid choice.");
		                }
		                break;
		                
		            default:
		                System.out.println("Invalid choice.");
		        }
		        
		        // Close the scanner object to prevent resource leaks
		        Train.close();
		    }
		


	}



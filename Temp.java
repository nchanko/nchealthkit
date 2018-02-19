import java.util.*;

public class Temp {
	

	
	public void temperature (){
		
		System.out.println("Temp in Celsius or Fahrenheit? Type C or F ");
		Scanner unittype = new Scanner(System.in);
		String ut = unittype.nextLine();
		
	
		
		if (ut.equalsIgnoreCase("c")){
			System.out.println("Enter the temperature in celsius");
			Scanner celsius = new Scanner(System.in);
			Float C = celsius.nextFloat();
			
			Float CstoF = (C*9.0f/5.0f) +32.0f;
			
			System.out.println("The temperature is "+CstoF+"'F.");
			
			
			
			if ( CstoF > 99.0 ){
				
				System.out.println(" You have fever");
			}
			
			else if ( CstoF <97.0){
				
				System.out.println("You have hypotherima");
				
			}
			
			else 
				{System.out.println("Your temperature is normal. ");
			
			
			}
			}
		else if (ut.equalsIgnoreCase("f")){	
			System.out.println("Enter the temperature in Fahrenheit.");
			Scanner fahr = new Scanner(System.in);
			Float F = fahr.nextFloat();
			//(F - 32) * 5/9
			Float FtoC = (F-32)*5.0f/9.0f;
		
			System.out.println("The temperature is "+FtoC+"'C.");
		
			if ( FtoC >37.2 ){
				
				System.out.println(" You have fever");
			}
			
			else if ( FtoC <36.1){
				
				System.out.println("You have hypotherima");
				
			}
			
			else 
				{System.out.println("Your temperature is normal. ");
			
			
			}
			
		}
		else{
			System.out.println("You are wrong");
			
			}
			}
			
			
			
		}
		
	

	


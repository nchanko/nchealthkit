import java.util.*;
public class RR {

	/*The typical respiratory rate for a healthy adult at rest is 12–20 breaths per minute.[7]


Approximate Age Range	Respiratory Rate
Newborn	30-50
0-5 months	25-40
6-12 months	20-30
1-3 years	20-30
3-5 years	20-30
6-10 years	15-30
11-14 years	12-20
15-20 years	12-30
Adults	16-20 */
	
	
	public void Resrate(){
		
		System.out.println("We are going to test the respiratory rate .\n Firstly, you need to tell me the age of patient."
				+ " \n Is he child or adult ? Adult means older than 20.  type c or a for answer.");
		Scanner Agetype = new Scanner (System.in);
		String agetype = Agetype.nextLine();
		
		// This code will do method for child.
		if (agetype.equalsIgnoreCase("c")){
			
			System.out.println(" How old is your child ? is he less than one year old or not ? \n Type y or n for answer");
			Scanner childage = new Scanner (System.in);
			String CA = childage.nextLine();
		//if the child is less than one year old .The input number will be considered as month.	
			if(CA.equalsIgnoreCase("y")){
				System.out.println(" Tell me how many months he is old ? ");
				
			Scanner childagemonth=new Scanner (System.in);
			int CAM= childagemonth.nextInt();
			System.out.println("Well. Tell me his respiratory rate in a minute.");
			Scanner childRR=new Scanner (System.in);
			int cRR= childRR.nextInt();
			//for the child between 1 and 5 month.
				if (CAM>=1 && CAM<=5){
					System.out.println("Your child's respiratory rate should be between 25 and 40 per minute\n");
					//respiratory rate is greater than 40. 
					if (cRR >-40){
						System.out.println("Your child's respiratory rate is "+cRR+"per minute"+"\n He is having Tachypnea. "
								+ "\n If fever,noisy breathing and restless are found .\n You should immediately see the docotr ");
							
					}
					
					//respiratory rate is less than 25
					else if (cRR <=25){
						System.out.println("Your child's respiratory rate is "+cRR+"per minute"+"\n He is having bradypnea. "
								+ "\n If fever,noisy breathing and restless are found .\n You should immediately see the docotr ");
							
					}
					
					// respirator is within normal range.
					else {
						System.out.println("Your child's breathing is normal");
					}
				
				}
				//for child within 6 month and 12 month
				else if (CAM>=6 || CAM<=12){
					System.out.println("Your child's respiratory rate should be between 24 and 30 per minute\n");
					
					if (cRR >=30){
						System.out.println("Your child's respiratory rate is "+cRR+"per minute"+"\n He is having Tachypnea. "
								+ "\n If fever,noisy breathing and restless are found .\n You should immediately see the docotr ");
							
					}
					else if (cRR <=20){
						System.out.println("Your child's respiratory rate is "+cRR+"per minute"+"\n He is having bradypnea. "
								+ "\n If fever,noisy breathing and restless are found .\n You should immediately see the docotr ");
							
					}
					else {
						System.out.println("Your child's breathing is normal");
				}
			
								
			}	else {
				System.out.println("Newborn baby has faster respiratory rate. Round about 35 -50 . \n If your child is less than 1month, you don't need to be worried for fast breathing.");
			}}
				
			//if the child is greater than 1 year old .the age range will be between 1 and 20 years.
				else if (CA.equalsIgnoreCase("n"))
				{	System.out.println(" Tell me how old is he 2 year 3 year or less than 20 year ? . Say a number ");
				
			Scanner childageyear=new Scanner (System.in);
			int CAY= childageyear.nextInt();
			System.out.println("Well. Tell me his respiratory rate in a minute.");
			Scanner childRR=new Scanner (System.in);
			int cRR= childRR.nextInt();
			
			if (CAY>=1 && CAY<=3){
				System.out.println("Your child's respiratory rate should be between 20 and 30 per minute\n");
				
				if (cRR >30){
					System.out.println("Your child's respiratory rate is "+cRR+"per minute"+"\n He is having Tachypnea. ");
						
				}
				else if (cRR <20){
					System.out.println("Your child's respiratory rate is "+cRR+"per minute"+"\n He is having bradypnea. ");
						
				}
				else {
					System.out.println("Your child's breathing is normal");
				}
			}
				else if (CAY>=3 && CAY<=5){
					System.out.println("Your child's respiratory rate should be between 20 and 30 per minute\n");
					
					if (cRR >30){
						System.out.println("Your child's respiratory rate is "+cRR+"per minute"+"\n He is having Tachypnea. ");
							
					}
					else if (cRR <20){
						System.out.println("Your child's respiratory rate is "+cRR+"per minute"+"\n He is having bradypnea. ");
							
					}
					else {
						System.out.println("Your child's breathing is normal");
				}
			}
				else if (CAY>=6 && CAY<=10){
					System.out.println("Your child's respiratory rate should be between 20 and 30 per minute\n");
					
					if (cRR >30){
						System.out.println("Your child's respiratory rate is "+cRR+"per minute"+"\n He is having Tachypnea. ");
							
					}
					else if (cRR <15){
						System.out.println("Your child's respiratory rate is "+cRR+"per minute"+"\n He is having bradypnea. ");
							
					}
					else {
						System.out.println("Your child's breathing is normal");
				}
			
			
		}
				else if (CAY>=11 && CAY<=14){
					System.out.println("Your child's respiratory rate should be between 20 and 30 per minute\n");
					
					if (cRR >20){
						System.out.println("Your child's respiratory rate is "+cRR+"per minute"+"\n He is having Tachypnea. ");
							
					}
					else if (cRR <12){
						System.out.println("Your child's respiratory rate is "+cRR+"per minute"+"\n He is having bradypnea. ");
							
					}
					else {
						System.out.println("Your child's breathing is normal");
		
				}
		}
			
				else if (CAY>=15 && CAY<=20){
					System.out.println("Your child's respiratory rate should be between 20 and 30 per minute\n");
					
					if (cRR >30){
						System.out.println("Your child's respiratory rate is "+cRR+"per minute"+"\n He is having Tachypnea. ");
							
					}
					else if (cRR <12){
						System.out.println("Your child's respiratory rate is "+cRR+"per minute"+"\n He is having bradypnea. ");
							
					}
					else {
						System.out.println("Your child's breathing is normal");
				}
					
		}
		
		
				}
			
				else
					{
					System.out.println( "Plz write only y or n");}
					}
		//this one is for adult.
		
		else if (agetype.equalsIgnoreCase("a")){
			System.out.println(" Tell me how old are you now? ");
			
			Scanner adultage=new Scanner (System.in);
			int AA=adultage.nextInt();
			System.out.println("Well. Tell me your respiratory rate in a minute.");
			Scanner adultRR=new Scanner (System.in);
			int AR= adultRR.nextInt();
			
			
			if (AA>=21 && AA<=90){
				System.out.println("Your respiratory rate should be between 16 and 20 per minute\n");
				
				if (AR >20){
					System.out.println("Your respiratory rate is "+AR+"per minute"+"\n You are having Tachypnea. ");
						
				}
				else if (AR<16){
					System.out.println("Your respiratory rate is "+AR+"per minute"+"\n You are having bradypnea. ");
					
				}
				else {System.out.println("Your breathing is normal ");
				
				}
			}
			else if (AA<120 && AA>90){
				
				System.out.println(" WOW! You have lived long enough ! ..Take care of yourself. ");
			}
			else if (AA<21 ){
			
				System.out.println("I think you should consider yourself as a child :D . ");
			}
		
			else { System.out.println(" Dude! Are u kidding me ? .. No one can live that long . You know ? ");
			}
			
		}
// if the user input something else. the error message will appear. 
		else{ System.out.println(" Your input is wrong. try again");
} }
		
	}
	

public class Spo2{
	
	public void oxygensituation (int o2){
	//	Normal SpO2 values vary between 95 and 100%.
		if (o2 <=100 && o2>=95){
			
			System.out.println(" Your hvae good SPO2 level.");
		}
		
		
		else if (o2 <=94 && o2>=90){
			
			System.out.println(" Code YELLOW! The patient is having hypoxia. He needs oxygen .");
		}

		else if (o2 <=89 && o2>=80){
			
			System.out.println(" Code ORANGE! The patient is having hypoxia.\n His airway is almost obstructed .\nGIVE HIM OXYGEN RIGHT AWAY.");
		}	
		

		else if (o2 <80){
			
			System.out.println(" Code RED! The patient is having hypoxia.\nAirway is obstructed and having stridor.. \n Give him highflow Oxygen.\nRESUSCITATE NOW.");
		}	
	
		else{
			System.out.println(" ERROR");
		}
		
}}
import java.util.*;

import javax.management.DynamicMBean;

public class Mainclass {

	public static void main(String[] args) {
			
		// TODO Auto-generated method stub
//System.out.println("Did you eat last night ?.  press yes or  no");
/*System.out.println("မနေ့ညကဘာစားထားသေးလဲ. yes ဒါမှမဟုတ် no လို့ရွေးပေး ");

Scanner question  = new Scanner(System.in);
String answer = question.nextLine();

if (answer.equalsIgnoreCase("yes") ){
	DM xObject = new DM();
	xObject.RBS();
	
}
else if (answer.equalsIgnoreCase("no")){
	
	DM zObject = new DM();
	zObject.FBS();
	
}
else {System.out.println(" Plz type only Yes  or No");}


//System.out.println("\n\n\n\n\n\nLet's measure ur blood pressure");

System.out.println("\n\n ခင်ဗျားရဲ့သွေးပေါင်တိုင်းကြည့်ရအောင် ");
HT yObject = new HT();
yObject.BP();

HR heartrate = new HR();
heartrate.HR();

HR currentheartrate = new HR();
currentheartrate.currentHR();

RR respiratoryrate= new RR();
respiratoryrate.Resrate();


Temp Temper1 = new Temp ();
Temper1.temperature();




System.out.println("SPO2  LEVEL? ");
Scanner spo2level = new Scanner(System.in);
int o2 = spo2level.nextInt();
Oxygenflow obj = new Oxygenflow();
obj.NAME(o2);
obj.oxygensituation(o2);


/**/
		myblood b = new myblood();
		
		
		
	//Paternity blood test.
		
	System.out.println("What is the child's blood type?");
		Scanner childblood = new Scanner (System.in);
		String c = childblood.nextLine();
		
		System.out.println("What is the Father's blood type?");
		Scanner fatherblood = new Scanner (System.in);
		String f = childblood.nextLine();
		
		System.out.println("What is the mother's blood type?");
		Scanner motherblood = new Scanner (System.in);
		String m = childblood.nextLine(); 
	
		b.myblood(c, f, m);
		
	//Question for dnblood.java.
		
		System.out.println("This is for blood donor and receiver compatibility match.\n Plz answe the following questions.");
		System.out.println("What is your blood type?");
		Scanner bloodtype = new Scanner (System.in);
		String yb = bloodtype.nextLine();
		
		
		System.out.println("What is donor's blood type?");
		Scanner Donorblood = new Scanner (System.in);
		String db = Donorblood.nextLine();
		

		System.out.println("What is receiver's blood type?");
		Scanner Receiverblood = new Scanner (System.in);
		String rb = Receiverblood.nextLine();
	//This will tell dnblood.java to operate blood compatibility check.

	/*	dnblood dnb = new dnblood();
		dnb.donormatchmyblood(yb, rb,db);*/
		
		
		donateblood dnbb= new donateblood();
		dnbb.donormatchmyb(yb, rb, db);
	
	 
		
		
	}}

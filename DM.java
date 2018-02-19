import java.util.*;

public class DM {

	public void RBS (){
	//System.out.println(" Enter your Random Blood Sugar level. ");
	System.out.println(" ခင်ဗျား အခု တိုင်းထားတဲ့ သကြားဓာတ်ကိုပြောပါ mg/dl နဲ့နော်  ");
	
	Scanner rbsvalue = new Scanner(System.in);
	int RBS = rbsvalue.nextInt();
	//normal79–140 mg/dl//prediabetes140–200 mg/dl //diabetes > 200 mg/dl i
	
	if ( RBS>200 ) 
	{
		// System.out.println("You have diabtes");
		System.out.println("ခင်ဗျားမှာ ဆီးချိုရှိနေပြီ ");
	}
	else if ( 140<=RBS && RBS<=200)
	{
		// System.out.println("you are prediabetic");
		System.out.println(" အဖြေကတော့ ခင်ဗျား ဆီးချိုဖြစ်ခါနီးပြီလို့ပြောတယ်ဗျ.. ");
	System.out.println("You need to see your doctor for futher treatment");

	}
	else if ( 79 <=RBS && RBS <=140 )
	{
		//System.out.println("You random blood sugar is normal"
		System.out.println(" သကြားဓာတ်ကတော့ ပုံမှန်ပါပဲ ..စိုးရိမ်စရာမရှိပါဘူး "
	);
	}
	else
	 {
	// System.out.println("You have hypoglycaemia");
		System.out.println("ခင်ဗျားမှာ သကြားဓာတ်ကျနေတယ်.. အချိုနည်းနည်းစားလိုက်ပါ ");
		
	System.	out.println("Drink some glucose.. HURRY");
	}
	}

	
	
//FBS 100 mg/dL (5.6 mmol/L) is normal. 
//100 to 125 mg/dL (5.6 to 6.9 mmol/L) is considered prediabetes. 
//126 mg/dL (7 mmol/L) or higher on two separate tests, you have diabetes.
	
	public void FBS (){
		// System.out.println("GREAT ! \n"+"Enter your Fasting Blood glucose value ");
		System.out.println("ကောင်းပါပြီ \n"+" မစားခင်တိုင်းထားတဲ့ သကြားဓာတ်ဘယ်လောက်ရှိလဲပြောပါဦး. mg/dl နဲ့နော်  ");
		
		Scanner fbsvalue = new Scanner(System.in);
		int FBS = fbsvalue.nextInt();
		//normal79–140 mg/dl//prediabetes140–200 mg/dl //diabetes > 200 mg/dl i
		
		if ( FBS>126 ) 
	//	{System.out.println("You have diabtes");
		{System.out.println("ခင်ဗျားမှာ ဆီးချိုရှိနေပြီ ");
		}
		else if ( 100<=FBS && FBS<=125)
		// {System.out.println("you are prediabetic");
	// 	System.out.println("You need to see your docotr for futher treatment");
	{System.out.println(" အဖြေကတော့ ခင်ဗျား ဆီးချိုဖြစ်ခါနီးပြီလို့ပြောတယ်ဗျ.. ");
		System.out.println("You need to see your doctor for futher treatment");
		}
		
		
		else if ( FBS <100 )
		// {System.out.println("You random blood sugar is normal");
			{System.out.println(" သကြားဓာတ်ကတော့ ပုံမှန်ပါပဲ ..စိုးရိမ်စရာမရှိပါဘူး ");
		}
		else
		 { 
			// System.out.println("You have hypoglycaemia");
		// System.	out.println("Drink some glucose.. HURRY");
			System.out.println("ခင်ဗျားမှာ သကြားဓာတ်ကျနေတယ်.. အချိုနည်းနည်းစားလိုက်ပါ ");
		 }
		}
	}





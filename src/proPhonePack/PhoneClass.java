package proPhonePack;

import java.util.Scanner;

public class PhoneClass {
String[] samsung = {"S22","S22+","S22ULTRA","S22FE"};
String[] apple = {"iphone14","iphone14pro","iphone14promax","iphone14mini"};
int [] samsungMonth= {25,35,55,20};
int [] appleMonth= {30,40,65,25};
String nameOfPhone, modelNumber, plan;

Scanner sc =new Scanner(System.in);
 
 void findPhone() {
	 if(nameOfPhone.equals("samsung")) {
		 for(int i=0;i<samsung.length;i++) {
				System.out.println(samsung[i]);
			}
			System.out.println("ENTER YOUR MODEL NAME");
			modelNumber=sc.next();
			System.out.println("PLEASE SELECT THE PLAN THAT YOU WANT TO OPT FOR: ROGER/TELUS/BELL");
			plan = sc.next();
	
	
 }
	 else if(nameOfPhone.equals("apple")) {
		 for(int k=0;k<apple.length;k++) {
				System.out.println(apple[k]);
			}
		 	System.out.println("ENTER YOUR MODEL NAME");
			modelNumber=sc.next();
			System.out.println("PLEASE SELECT THE PLAN THAT YOU WANT TO OPT FOR: ROGER/TELUS/BELL");
			plan = sc.next();
	 }
	 else
	 {
		 System.out.println("NOT IN LIST");
	 }
		 
	 }
 
 void displayPhone() {
	
	 
	 switch (modelNumber){
		 case "S22":
			 if(plan.equals("telus")) {
		 	 System.out.println("YOU HAVE SELCTED S22 WITH TELUS PLAN");
			 System.out.println("your phone tab will be: 25 ");
			 System.out.println("Your montly plan will be 75");
			 System.out.println("Total Monthly Amount: 100");
			 }
			 else if(plan.equals("rogers")) {
				 System.out.println("YOU HAVE SELCTED S22 WITH ROGERS PLAN");
				 System.out.println("your phone tab will be: 25 ");
				 System.out.println("Your montly plan will be 70");
				 System.out.println("Total Monthly Amount: 95");
			 }
				 else
				 {
					 System.out.println("YOU HAVE SELCTED S22 WITH BELL PLAN");
					 System.out.println("your phone tab will be: 25 ");
					 System.out.println("Your montly plan will be 80");
					 System.out.println("Total Monthly Amount :105");
				 }
			 break;
		 case "S22+":
		 if(plan.equals("telus")) {
			 System.out.println("YOU HAVE SELCTED S22+ WITH TELUS PLAN");
			 System.out.println("your phone tab will be: 35 ");
			 System.out.println("Your montly plan will be 75");
			 System.out.println("Total Monthly Amount: 110");
			 }
			 else if(plan.equals("rogers")) {
				 System.out.println("YOU HAVE SELCTED S22+ WITH ROGERS PLAN");
				 System.out.println("your phone tab will be: 35 ");
				 System.out.println("Your montly plan will be 70");
				 System.out.println("Total Monthly Amount: 105");
			 }
				 else
				 {
					 System.out.println("YOU HAVE SELCTED S22+ WITH BELL PLAN");
					 System.out.println("your phone tab will be: 35 ");
					 System.out.println("Your montly plan will be 80");
					 System.out.println("Total Monthly Amount :115");
				 }
			 break;
		 case "S22ULTRA":
			 if(plan.equals("telus")) {
				 System.out.println("YOU HAVE SELCTED S22ULTRA WITH TELUS PLAN");
				 System.out.println("your phone tab will be: 55 ");
				 System.out.println("Your montly plan will be 75");
				 System.out.println("Total Monthly Amount: 130");
				 }
				 else if(plan.equals("rogers")) {
					 System.out.println("YOU HAVE SELCTED S22ULTRA WITH ROGERS PLAN");
					 System.out.println("your phone tab will be: 55 ");
					 System.out.println("Your montly plan will be 70");
					 System.out.println("Total Monthly Amount: 125");
				 }
					 else
					 {
						 System.out.println("YOU HAVE SELCTED S22ULTRA WITH BELL PLAN");
						 System.out.println("your phone tab will be: 55 ");
						 System.out.println("Your montly plan will be 80");
						 System.out.println("Total Monthly Amount :135");
					 }
				 break;
		 case "S22FE":
			 if(plan.equals("telus")) {
				 System.out.println("YOU HAVE SELCTED S22FE WITH TELUS PLAN");
				 System.out.println("your phone tab will be: 20 ");
				 System.out.println("Your montly plan will be 75");
				 System.out.println("Total Monthly Amount: 95");
				 }
				 else if(plan.equals("rogers")) {
					 System.out.println("YOU HAVE SELCTED S22FE WITH ROGERS PLAN");
					 System.out.println("your phone tab will be: 20 ");
					 System.out.println("Your montly plan will be 70");
					 System.out.println("Total Monthly Amount: 90");
				 }
					 else
					 {
						 System.out.println("YOU HAVE SELCTED S22FE WITH BELL PLAN");
						 System.out.println("your phone tab will be: 20 ");
						 System.out.println("Your montly plan will be 80");
						 System.out.println("Total Monthly Amount :100");
					 }
				 break;
		 case "iphone14":
			 if(plan.equals("telus")) {
				 System.out.println("YOU HAVE SELCTED iphone14 WITH TELUS PLAN");
				 System.out.println("your phone tab will be: 30 ");
				 System.out.println("Your montly plan will be 75");
				 System.out.println("Total Monthly Amount: 105");
				 }
				 else if(plan.equals("rogers")) {
					 System.out.println("YOU HAVE SELCTED iphone14 WITH ROGERS PLAN");
					 System.out.println("your phone tab will be: 30 ");
					 System.out.println("Your montly plan will be 70");
					 System.out.println("Total Monthly Amount: 100");
				 }
					 else
					 {
						 System.out.println("YOU HAVE SELCTED iphone14 WITH BELL PLAN");
						 System.out.println("your phone tab will be: 30 ");
						 System.out.println("Your montly plan will be 80");
						 System.out.println("Total Monthly Amount :110");
					 }
				 break;
		 case "iphone14pro":
			 if(plan.equals("telus")) {
				 System.out.println("YOU HAVE SELCTED iphone14pro WITH TELUS PLAN");
				 System.out.println("your phone tab will be: 40 ");
				 System.out.println("Your montly plan will be 75");
				 System.out.println("Total Monthly Amount: 115");
				 }
				 else if(plan.equals("rogers")) {
					 System.out.println("YOU HAVE SELCTED iphone14pro WITH ROGERS PLAN");
					 System.out.println("your phone tab will be: 40 ");
					 System.out.println("Your montly plan will be 70");
					 System.out.println("Total Monthly Amount: 110");
				 }
					 else
					 {
						 System.out.println("YOU HAVE SELCTED iphone14pro WITH BELL PLAN");
						 System.out.println("your phone tab will be: 40 ");
						 System.out.println("Your montly plan will be 80");
						 System.out.println("Total Monthly Amount :120");
					 }
				 break;
		 case "iphone14promax":
			 if(plan.equals("telus")) {
				 System.out.println("YOU HAVE SELCTED iphone14promax WITH TELUS PLAN");
				 System.out.println("your phone tab will be: 65 ");
				 System.out.println("Your montly plan will be 75");
				 System.out.println("Total Monthly Amount: 140");
				 }
				 else if(plan.equals("rogers")) {
					 System.out.println("YOU HAVE SELCTED iphone14promax WITH ROGERS PLAN");
					 System.out.println("your phone tab will be: 65 ");
					 System.out.println("Your montly plan will be 70");
					 System.out.println("Total Monthly Amount: 135");
				 }
					 else
					 {
						 System.out.println("YOU HAVE SELCTED iphone14 WITH BELL PLAN");
						 System.out.println("your phone tab will be: 65 ");
						 System.out.println("Your montly plan will be 80");
						 System.out.println("Total Monthly Amount :145");
					 }
				 break;
		 case "iphone14mini":
			 if(plan.equals("telus")) {
				 System.out.println("YOU HAVE SELCTED iphone14mini WITH TELUS PLAN");
				 System.out.println("your phone tab will be: 25 ");
				 System.out.println("Your montly plan will be 75");
				 System.out.println("Total Monthly Amount: 100");
				 }
				 else if(plan.equals("rogers")) {
					 System.out.println("YOU HAVE SELCTED iphone14mini WITH ROGERS PLAN");
					 System.out.println("your phone tab will be: 25 ");
					 System.out.println("Your montly plan will be 70");
					 System.out.println("Total Monthly Amount: 95");
				 }
					 else
					 {
						 System.out.println("YOU HAVE SELCTED iphone14mini WITH BELL PLAN");
						 System.out.println("your phone tab will be: 25 ");
						 System.out.println("Your montly plan will be 80");
						 System.out.println("Total Monthly Amount :105");
					 }
				 break;
				 default: 
					 System.out.println("OUT OF SYOCK");
		 }
			 }
			 
			 
		 }
	 
	 
 


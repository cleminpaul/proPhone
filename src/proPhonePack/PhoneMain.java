package proPhonePack;

import java.util.Scanner;

public class PhoneMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner cr = new Scanner(System.in);
		
		PhoneClass phone = new PhoneClass();
		System.out.println("ENTER THE BRAND");
		phone.nameOfPhone=cr.next();
		phone.findPhone();
		phone.displayPhone();
		
		
		

	}

}

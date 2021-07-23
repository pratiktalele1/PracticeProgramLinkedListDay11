package Classes;

import java.util.Scanner;

public class CompanyShare5Main {
	public static void main(String[] args) {
		NodeCompanyShare companyShare=new NodeCompanyShare();
		int i=1;
		do {
			System.out.print("1->add company \t 2->remove company \t 3->print company");
			Scanner scanInput = new Scanner(System.in);
			int getUserInput = scanInput.nextInt();
			
			switch(getUserInput) {
			case 1 :{
				System.out.print("Enter comapny name- ");
				String getUserInput2 = scanInput.next();
				System.out.print("Enter comapny share- ");
				int getUserInput3 = scanInput.nextInt();
				companyShare.addNode(getUserInput3, getUserInput2);
				break;
			}
			case 2 :{
				System.out.print("Enter comapny name- ");
				String getUserInput2 = scanInput.next();
				
				break;
			}
			case 3:{
				companyShare.printList();
				break;
			}
			}
			
			System.out.print("want to repeat- ");
			i = scanInput.nextInt();
		}while(i==1);
	
	}
}

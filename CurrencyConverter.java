import java. util.Scanner;

class Converter{
	
	public double amt;
	
	public void convertRupee(double amt) {
		System.out.println();
	    System.out.println("1 Rupee = " + 0.0122 + " Dollar");
	    System.out.println();
	    System.out.println((int)amt+" Rupee = " + (amt*0.0122) + " Dollar");
	    System.out.println();

	    System.out.println("1 Rupee = " + 0.0115 + " Euro");
	    System.out.println();
	    System.out.println((int)amt+" Rupee = " + (amt*0.0115) + " Euro");
	    System.out.println();
	    
	    System.out.println("1 Rupee = "+ 0.0843 +" Yuan");
	    System.out.println();
	    System.out.println((int)amt+" Rupee = " + (amt*0.0843) + " Yuan");
	    System.out.println();
	    
	    System.out.println("1 Rupee = "+ 1.647 +" Yen");
	    System.out.println();
	    System.out.println((int)amt+" Rupee = " + (amt*1.647) + " Yen");//
	    System.out.println();

	}
	public void convertDollar(double amt) {
	    System.out.println("1 Dollar = " + 81.96 + " Rupee");
	    System.out.println();
	    System.out.println((int)amt+" Dollar = " + (amt*79.37) + " Rupee");
	    System.out.println();

	    System.out.println("1 Dollar = " + 0.9395 + " Euro");
	    System.out.println();
	    System.out.println((int)amt+" Dollar = " + (amt*0.9395) + " Euro");
	    System.out.println();
	    
	    System.out.println("1 Dollar = " + 6.9063 + " Yuan");
	    System.out.println();
	    System.out.println((int)amt+" Dollar = " + (amt*6.9063) + " Yuan");
	    System.out.println();
	    
	    System.out.println("1 Dollar = " + 135 + " Yen");
	    System.out.println();
	    System.out.println((int)amt+" Dollar = " + (amt*135) + " Yen");//
	    System.out.println();
	}

	    

	public void convertEuro(double amt){
	    System.out.println("1 Euro = " + 87.219 + " Rupee");
	    System.out.println();
	    System.out.println((int)amt+" Euro = " + (amt*87.219) + " Rupee");
	    System.out.println();

	    System.out.println("1 Euro = " + 1.0644 + " Dollar");
	    System.out.println();
	    System.out.println((int)amt+" Euro = " + (amt*1.0644) + " Dollar");
	    System.out.println();
	    
	    System.out.println("1 Euro = " + 7.386 + " Yuan");
	    System.out.println();
	    System.out.println((int)amt+" Euro = " + (amt*7.386) + " Yuan");
	    System.out.println();
	    
	    System.out.println("1 Euro = " + 143.69 + " Yen");
	    System.out.println();
	    System.out.println((int)amt+" Euro = " + (amt*143.69) + " Yen");//
	    System.out.println();
	}

	public void convertYuan(double amt) {
		System.out.println("1 Yuan = " + 11.868 + " Rupee");
	    System.out.println();
	    System.out.println((int)amt+" Yuan = " + (amt*11868) + " Rupee");
		System.out.println();
		
	    System.out.println("1 Yuan = " + 0.1448 + " Dollar");
	    System.out.println();
	    System.out.println((int)amt+" Yuan = " + (amt*0.1448) + " Dollar");
	    System.out.println();
	    
	    System.out.println("1 Yuan= " + 0.1354 + " Euro");
	    System.out.println();
	    System.out.println((int)amt+" Yuan = " + (amt*0.1354) + " Euro");
		System.out.println();
		
		System.out.println("1 Yuan= " + 19.546 + " Yen");
	    System.out.println();
	    System.out.println((int)amt+" Yuan = " + (amt*19.546) + " Yen");
		System.out.println();
		
	}
	public void convertYen(double amt) {
		System.out.println("1 Yen = " + 0.6072 + " Rupee");
	    System.out.println();
	    System.out.println((int)amt+" Yen = " + (amt*0.6072) + " Rupee");//
		System.out.println();
		
	    System.out.println("1 Yen = " + 0.0074 + " Dollar");
	    System.out.println();
	    System.out.println((int)amt+" Yen = " + (amt*0.0074) + " Dollar");//
	    System.out.println();
	    
	    System.out.println("1 Yen= " + 0.007 + " Euro");
	    System.out.println();
	    System.out.println((int)amt+" Yen = " + (amt*0.007) + " Euro");//
		System.out.println();
		
		System.out.println("1 Yen = " + 0.0515 + " Yuan");
	    System.out.println();
	    System.out.println((int)amt+" Yen = " + (amt*0.1515) + " Yuan");
	    System.out.println();
	}
	
}

public class CurrencyConverter {

    public static void main(String[] args) {
    	
    	Converter obj=new Converter();
    	
    	System.out.println("-----------------------CURRENCY CONVERTER-------------------------");
        System.out.println("Enter 1: Rupee   ");
        System.out.println("Enter 2: Dollar  ");
        System.out.println("Enter 3: Euro    ");
        System.out.println("Enter 4: Yuan    ");
        System.out.println("Enter 5: Yen     ");
        System.out.println("------------------------------------------------------------------");
        
        Scanner sc = new Scanner(System.in);
        System. out.println("Choose the currency : ");
        int choice = sc.nextInt();
        System.out.println("Enter the amount to be converted : ");
        double amount = sc.nextDouble();
        
        switch (choice) {
            case 1:
                obj.convertRupee(amount);
                break;
            case 2:
                obj.convertDollar(amount);
                break;
            case 3:
                obj.convertEuro(amount);
                break;
            case 4:
            	obj.convertYuan(amount);
            	break;
            case 5:
            	obj.convertYen(amount);
            default:
                System.out.println("Invalid choice");
        }

    }
}
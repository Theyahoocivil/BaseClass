import java.util.Scanner;

public class IncomeTaxCalculator {
	 public static Scanner scanner = new Scanner(System.in);
public static void main(String[] args) {
	System.out.println("Enter the amount");
	double nextInt2 = scanner.nextDouble();
	if(nextInt2<=500000) {
		System.out.println("no tax");
	}else {
		if(nextInt2<=750000) {
			nextInt2=nextInt2*0.025;
			long l = (long)nextInt2;
			
		System.out.println("Tax is "+l);
	}else 
	{
		if(nextInt2<=1000000) {
			nextInt2=nextInt2*0.05;
			double l = (double)nextInt2;
		System.out.println("Tax is " + l);
	}else {
			if(nextInt2>=1000000) 
		System.out.println("No Data");
	}

//	System.out.println("Enter the amount");
//	int nextInt = scanner.nextInt();
//	for(int i=0;i<500000;i++) {
//		if(nextInt<=500000) {
//	System.out.println("no tax");
//		}
//	else {
//for(int j=500000;j<=750000;j++) {
//	if(nextInt<=750000) {
//		
//		System.out.println("Tax is "+(nextInt/0.025));
//		break;
//	}	
//	
//}

}}}}
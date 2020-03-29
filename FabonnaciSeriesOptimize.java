
public class FabonnaciSeriesOptimize {

	public static void main(String[] args) {
		System.out.println("\tThis code is written by MOHD UMAR (Master-Tech271)");
		
		//fabonnaci series with optimize code
		//fabonnaci series means => 0,1,0+1, 1+1, 1+2, ...  The next number is found by adding up the two numbers before it. 
		//0,1, next => prevofprev + prev  = > 0+1
		
		//n is the number of fabonnaci
		System.out.print("Enter the sequence of fabonnaci series = ");
		java.util.Scanner in = new java.util.Scanner(System.in);
		int n = in.nextInt();
		
		int pprev = 0;
		int prev = 1;
		
		System.out.println("Fabonnaci Series of "+n +" is : ");
		
		//print first 0, 1 because it is the starting sequence
		System.out.print(pprev+", "+prev);
		for(int i=0; i<n; i++) {
			System.out.print(", "+(pprev+prev));
			pprev = prev;
			prev += pprev;
		}
	}

}


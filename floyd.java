package Programs;



public class floyd {
	public static void main(String[] args) {
		
	
	// input for number of rows
			/*Scanner in = new Scanner(System.in);
			System.out.println("Enter the number of rows: ");
			int r = in.nextInt();
			int k=1;
			System.out.println("Floyd Triangle of rows: "+r);
			// for number of rows
*/			
			int k=1;
			for(int i=1;i<=4;i++)
			{
				// for no of columns in each row
				for(int j=1;j<=i;j++)
				{
					System.out.print(k++ +" ");
				}
				System.out.println();
			}
		}
}

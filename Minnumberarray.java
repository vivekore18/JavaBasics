package Programs;

public class Minnumberarray {

	public static void main(String[] args) {
		
		
		int a[][] = {{2,4,6},{7,4,1},{9,10,2}};
		int min =a[0][0];
		
			for(int i=0;i<a.length;i++)
		    {
			   for(int j=0;j<a.length;j++)
			{
				if(a[i][j]<min)
			{
				min=a[i][j] ;
			
			System.out.println(min); 
				
			}		
}
}
}
}


	



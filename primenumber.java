package Programs;

public class primenumber {
	
	public static void main(String[] args) {
		int i;
		int count=0;
		
		for(i =2;i<=10;i++){
			
			
			for(int j=i;j<=i/2;j++){
				
					
				count++;
				break;
			}
		}
		
		if(count==0){
			
			System.out.println(i);
		}
	}

}




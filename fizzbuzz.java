package Programs;

public class fizzbuzz {
	
		
		public void fizzbuzz1(int x){
		
		for(int i=0;i<x ;i++){
			
			if(i%3==0 && i%5==0 ){
				System.out.println("fizzbuzz");
			}
			else if(i%3==0){
				System.out.println("fizz");
			}
			else if(i%5==0){
				System.out.println("buzz");
			}
			else{
				System.out.println(i);
			}
		}
	}
	
	public static void main(String[] args) {
		
		fizzbuzz e =new fizzbuzz();
		e.fizzbuzz1(20);
	}


}

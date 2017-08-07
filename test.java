package Programs;

public class test {

	public static void main(String[] args) {
	    int s = 0;
		for(int i=10; s<99999; i++){
	        if(2*i==convertInt(i)){
	            System.out.println(i);
	        }
	    }
	}

	private static int convertInt(int i) {
	    String s = i+"";
	    int index = s.length()-1;
	    String newS = s.charAt(index) + s.substring(0, index);
	    return Integer.parseInt(newS);
	}

       
}
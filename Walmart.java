  package Programs;


	public class Walmart{

	       public static void main(String[] args) {

	    	    String Str = "walmart";
	    	    int ln = Str.length() ;

	           String finalStr = reverse(Str.substring(0, ln/2)) 

	                           + Str.charAt(ln/2) 

	                         + reverse(Str.substring((ln/2 + 1), ln));

	               System.out.println("finalStr = "+ finalStr);
 	         }
   
	       public static String reverse(String source) {
	        int i, len = source.length();
	        StringBuilder sb = new StringBuilder(len);

	        for (i = (len - 1); i >= 0; i--){
	            sb.append(source.charAt(i));
	        }
        return sb.toString();

	    }

	}






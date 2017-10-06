public class Primetest {
	static int threshold = 2000000;
	
	public static void main(String[] args) {
		
		
		primtest(threshold);
	//	collatz(7);
		
		
		
	}
	
	
	private static boolean prime(int number){
		
		boolean isPrime = true;
		
		for(int i=2; i<=number/2&&isPrime==true; i++){
			if(number%i==0){
				isPrime = false;
			}
			
		}
		return isPrime;
	}
	
    public static void primtest(int threshold){
    	int counter = 0;
    	System.out.println("Primzahlen von 2 bis "+threshold+":");
          int number = 2;
    	  while(number<=threshold){	 	
    				
    		  
    		  
    			if(prime(number)){
    				System.out.print(number+" ");
    				counter++;
    				if(counter%20==0){System.out.println();}
    			}
    		 
    			number++;
    			
    			}
    		}
    	
    }
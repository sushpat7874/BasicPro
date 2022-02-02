package Demo;

public class Nested {
public static void main(String[] args) {
	
	    //Creating two variables for age and weight
	    int age=25;    
	    int weight=48;      
	    //applying condition on age and weight    
	    if(age>=18){      
	        if(weight>50){    
	            System.out.println("You are eligible to donate blood");    
	        } else{  
	            System.out.println("You are not eligible to donate blood");    
	        }  
	    } else{  
	      System.out.println("Age must be greater than 18");  
	    }
	    
	    System.out.println(); //for blank line
	    
	    int a=100;
	    int b=200;
	    
	    	if(a<b) { System.out.println("B is big");
	    			} 
	    	else { System.out.println("A is big");
	    		 }
	    	    		
	  
	}
}
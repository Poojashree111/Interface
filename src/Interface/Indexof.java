package Interface;

public class Indexof {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "Welcome to JavaTpoint";      
		int count = 0;  
		int startFrom = 0;  
		for(; ;)  
		{  
		  
		int index = str.indexOf('o', startFrom);  
		  
		if(index >= 0)  
		{  
		 
		count = count + 1;  
		  
		  
		startFrom = index + 1;  
		}  
		  
		else  
		{  
		
		break;  
		}  
		}  
		  
		System.out.println("In the String: "+ str);   
		System.out.println("The 'o' character has come "+ count + " times");  
		}    
		}  

	

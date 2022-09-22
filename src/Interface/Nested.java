package Interface;
interface Shows{  
	  void show();  
	  interface Message{  
	   void msg();  
	  }  
	}  
	
	

public class Nested implements Shows.Message{  
	public void msg(){
	     System.out.println("Hello ,this is a nested interface");} 

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Shows.Message message=new Nested();  
		  message.msg();  

	}

}

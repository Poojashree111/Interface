package Interface;
interface Bank1{
	float rateOfInterest();
	}
	class SBI implements Bank1{
	public float rateOfInterest(){return 9.15f;}
	}
	class PNB implements Bank1{
	public float rateOfInterest(){return 9.7f;}
	}

public class Bank {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
			Bank1 b=new SBI();
			System.out.println("ROI: "+b.rateOfInterest());
			

	}

}

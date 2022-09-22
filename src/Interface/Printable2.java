package Interface;
interface Printable{
void print();
}
interface Showable extends Printable{
void show();
}
class TestInterface4 implements Showable{
public void print(){System.out.println("Hello");}
public void show(){System.out.println("Welcome");}




public class Printable2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TestInterface4 obj = new TestInterface4();
		obj.print();
		obj.show();
		

	}

}
}



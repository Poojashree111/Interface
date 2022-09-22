package Interface;
interface Printable1{
void print();
}
interface Showable1{
void print();
}

class Test1 implements Printable1, Showable1{
public void print()
{
	System.out.println("Hello");


}
}

public class Table {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Test1 obj = new Test1();
		obj.print();

	}

}

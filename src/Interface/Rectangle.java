package Interface;
interface Drawable{
void draw();
static int cube(int x){return x*x*x;}
}
class Rectangle1 implements Drawable{
public void draw(){System.out.println("drawing rectangle");}
}

public class Rectangle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Drawable d=new Rectangle1();
		d.draw();
		System.out.println(Drawable.cube(3));

	}

}

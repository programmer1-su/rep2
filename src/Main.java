import coder.school.Boy;
import coder.school.Girl;

public class Main {

	public static void main(String[] args) {
		Boy b = new Boy();
		b.getParent();
		System.out.println(b.age);
		b.myOwnMethod();
		
		Girl g = new Girl();
		g.getParent();
		System.out.println(g.name);

	}

}

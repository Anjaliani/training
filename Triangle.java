
public class Triangle extends Shape {

	@Override
	public void draw() {
		// TODO Auto-generated method stub
		for (int i = 1; i < getHeight(); i++) {

			for (int j = 1; j <= i; j++)
				System.out.print("*");
			System.out.println("");
		}

		

	}

}

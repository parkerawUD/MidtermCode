
public abstract class Shape {
	double area;
	double perimeter;
	public class Rectangle {
		public Rectangle(double Width, double Length) {
			if (Width < 0) {
				throw new IllegalArgumentException("Width must be positive");
			}
			catch (IllegalArgumentException e) {
				System.out.println(e.getMessage());
			}
			if (Length < 0) {
				throw new IllegalArgumentException("Length must be positive");
			}
			catch (IllegalArgumentException a) {
				System.out.println(a.getMessage());
			}
		}
		area = Width * Length;
		perimeter = (2 * Width) + (2 * Length);
		
		public class Cuboid{
			public Cuboid(double Depth) {
				if (Depth < 0) {
					throw new IllegalArgumentException("Depth must be positive");
				}
				catch (IllegalArgumentException d) {
					System.out.println(d.getMessage());
				}
				
				}
			}
		}
		
	}
}

package z.array;

public class Test01 {
	public static void main(String[] args) {
		int[] a = new int[3];//≥ı ºªØ
		a[0] = 23;
		a[1] = 28;
		a[2] = 32;
		
		Car[] cars = new Car[4];
		cars[0] = new Car("±º≥€");
		
		System.out.println(cars[0].name);
		System.out.println(a.length);
		for(int i=0;i<a.length;i++) {
			System.out.println(a[i]);
		}
	}
}

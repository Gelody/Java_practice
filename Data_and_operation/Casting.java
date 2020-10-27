
public class Casting {

	public static void main(String[] args) {
		
		double a = 1.1; 
		double b = 1;  // 자동으로 
		double b2 = (double) 1; // 명시적으로
		System.out.println(b); 

		
//		int c = 1.1;
		double d = 1.1;
		int e = (int) 1.1; // 명시적으로 형 변환 해야한다
		System.out.println(e);
		
		// 1 to String
		String f = Integer.toString(1);
		System.out.println(f.getClass());
	}

}

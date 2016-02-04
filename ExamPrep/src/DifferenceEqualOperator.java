
public class DifferenceEqualOperator {

	String a;
	String b;
	
	public DifferenceEqualOperator() {
		a = new String("xyz");
		b = new String("xyz");
	}
	
	
	
	public static void main(String[] args) {
		
		DifferenceEqualOperator  obj = new DifferenceEqualOperator();
		DifferenceEqualOperator  obj1 = new DifferenceEqualOperator();
		
		if(obj.a == obj1.b){
			System.out.println("Same");
		}else{
			System.out.println("Different");
		}
		
		if(obj.a.equals(obj1.b)){
			System.out.println("Equal");
		}
	}

}

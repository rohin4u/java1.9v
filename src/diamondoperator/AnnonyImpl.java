package diamondoperator;

public class AnnonyImpl {

	public static void main(String[] args) {
		
//		Annoy<String> a = new Annoy<String>("String");
//		System.out.println(a.m1());
//		
//		Annoy<Integer> aa = new Annoy<Integer>(10);
//		System.out.println(aa.m1());
//		
		Annoy<Integer> ai = new Annoy<>(10){
			public Integer m1() {
				return 2000;
			}
		};
		System.out.println(ai.m1());
		

	}

}

package fridaytest;

public class MethosOverloadingChild extends MethodOverridingParent {

public void properties() {
		
		System.out.println("i dont want properties");
}
	public void marriage() {
		System.out.println("Sorry , I want to study Archeologist");
	}
	
	public static void main(String[] args) {
		MethodOverridingParent p = new MethosOverloadingChild();
		p.properties();
		p.marriage();
	
}
}

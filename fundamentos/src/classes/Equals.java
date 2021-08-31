package classes;

public class Equals {
	
	public static void main(String[] args) {
		
		Usuario u1 = new Usuario();
		u1.nome = "Jose";
		u1.email = "jose@jose.com";
		
		Usuario u2 = new Usuario();
		u2.nome = "Jose";
		u2.email = "jose@jose.com";
		
		System.out.println(u1 == u2);
		System.out.println(u1.equals(u2));
		System.out.println(u2.equals(u1));
		
	}

}

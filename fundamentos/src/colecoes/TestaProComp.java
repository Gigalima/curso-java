package colecoes;

public class TestaProComp {
	public static void  main( String args[] ){

		int Result=0;

		ProComp1 Objs[] = new ProComp1[3];

		Objs[0] = new ProComp1();

		Objs[1] = new ProComp2();

		Objs[2] = new ProComp3();

		for (int i=0; i<3; i++)

		   Result += Objs[i].Calcula();

		System.out.println( Result );

		}
}

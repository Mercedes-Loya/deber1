import java.util.*;
class Suma{
	public static void main(String...Args){
		Scanner lector=new Scanner(System.in);
		Operaciones objOperaciones=new Operaciones();
		System.out.print(" 1er valor: ");
		objOperaciones.setNum1(lector.nextInt());
		System.out.print(" 2do valor: ");
		objOperaciones.setNum2(lector.nextInt());
		System.out.print("\n Resultado: "+objOperaciones.getResultado());
	}
}
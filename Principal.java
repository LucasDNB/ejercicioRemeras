import java.util.*;

public class Principal {
	
	public static void main(String[] args) {
		
		Remeras r1 = new Remeras();
		Remeras r2 = new Remeras();		
		Remeras r3 = new Remeras(300, "Nylon", 986.6, 234.90, false); //Es un objeto con valores significativos
		
		r1.setCodigo(100);
		r1.setTela("Algodon");
		r1.setMusculosa(true);
		r1.setCostoMP(123.56);
		
		System.out.println("Codigo r1: " +r1.getCodigo());
		System.out.println("Tela r1: " + r1.getTela());
		
		System.out.println("Codigo r2: " +r2.getCodigo());
		System.out.println("Musculosa r2: "+r2.getMusculosa());
		
		System.out.println("Codigo r3: "+r3.getCodigo()+"\nTela r3: "+r3.getTela()+"\nMusculosa r3: "+r3.getMusculosa());
		
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		Remeras r4 = new Remeras();
		System.out.println("Ingrese el codigo de R4: ");
		int cod = sc.nextInt(); //Validar que sea mayor a 0
		double cmp = sc.nextDouble(); //Mayor a 0
		double cmo = sc.nextDouble(); //Mayor a 0
		String te = sc.nextLine(); //Ver
		//boolean mus = sc.nextBoolean(); //true o false -> Funcion para si/no 
		r4.setCodigo(cod);
		r4.setCostoMP(cmp);
		r4.setCostoMO(cmo);
		r4.setTela(te);
		//r4.setMusculosa(mus); 
		
		
		Remeras rem[] = new Remeras [3];
		//Ciclo avanzado
		for (Remeras i:rem) {
			i = new Remeras();
			System.out.println("Codigo: "+i.getCodigo());
		}
		
		
		
	}

}

/*
R2
inicializado en 0/false/null
 */


/*
R1
codigo= 100
tela= algodon
musculosa = true
costoMP = 123.56
costoMO = 0 no se seteo
 */
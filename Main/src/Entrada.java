
public class Entrada {
	System.out.print("Ingrese el numero de datos de su arreglo: ");
	int x = Entrada.entero();
	boolean ElNumeroEsta = false;
	int [] posicion = new int[x] ;
	for(int i = 0 ; i < x ; i++) {
		posicion[i] = Entrada.entero();
	}
	System.out.println("Sus datos son:");
	System.out.print("[ ");
	for(int i = 0; i < x; i++) {
		System.out.print(posicion[i]+" ");
	}
	System.out.println("]");
	System.out.print("Ingrese el numero que busca: ");
	int numero_buscar = Entrada.entero();
	for(int i = 0; i < x; i++) {
		if(numero_buscar == posicion[i]) {
			System.out.println("El numero "+numero_buscar+" esta en la posicion "+(i+1));
			ElNumeroEsta=true;
		}
	}
	if(ElNumeroEsta == false) {
		System.out.println("El numero no se encuentra en el arreglo");
	}
	private static int entero() {
		// TODO Auto-generated method stub
		return 0;
	}
}

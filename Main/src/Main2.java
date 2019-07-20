public class Main2 {

	public static void main(String[] args) {
		int[] a = { 1, 2, 3, 1, 4, 5, 6, 1, 7, 8, 9, 1, 1, 1, 1, 1 };
		int size = (int) Math.sqrt(a.length);
		for (int i = 0; i < size; i++) {
			for (int e = 0; e < size - i; e++) {
				System.out.print(a[(i * size + e)] + " \t");
			}
			System.out.println();

		}

		for (int i = 0; i < a.length; i++) {
			if (i % size == 0) {

				System.out.print(a[i] + "\t");
			}
		}

		// TODO Auto-generated method stub

		ImprimirTriangulo(6);
	}

	public static void ImprimirTriangulo(int n) {
		for (int i = 0; i < n; i++) {
			for (int e = 0; e < n - i; e++) {
				System.out.print(" ");
			}
			ImprimirLinea(i + 1);

		}
	}

	public static void ImprimirEscaleraAsc(int n) {
		for (int i = 0; i < n; i++) {
			ImprimirLinea(1 + i);
		}
	}

	public static void ImprimirEscaleraDes(int n) {
		for (int i = 0; i < n; i++) {
			ImprimirLinea(n - i);
		}

	}

	public static void ImprimirRectangulo(int alto, int ancho) {
		for (int i = 0; i < alto; i++) {
			ImprimirLinea(ancho);
		}
	}

	public static void ImprimirCuadrado(int n) {
		for (int i = 0; i < n; i++) {

			ImprimirLinea(n);
		}

	}

	public static void ImprimirLinea(int n) {
		for (int i = 0; i < n; i++) {
			System.out.print("/ ");

		}
		System.out.println();
	}
}
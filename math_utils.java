

public class math_utils {
	
	int i=4; 
	int x=5;

	int resultado=4+5;
	}
public static int multiply(int a, int b) {
    return a * b;}
}
public int subtract(int a, int b) {
	  return a - b;  // Ahora la operación es la correcta (resta).
}public static double divide(int a, int b) {
    if (b == 0) {
        throw new IllegalArgumentException("No se puede dividir por cero");
    }
    return (double) a / b;
}
}
	


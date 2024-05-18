
public class MultiplosDeTres2 {
    public static void main(String[] args) {
        int n = args.length;
        int[] arreglo= new int[n];

        for (int i = 0; i < n; i++) {
            arreglo[i]= Integer.parseInt(args[i]);
        }

        int tot=suma(arreglo);
        mensaje(String.format("La suma de los multiplos de 3 es %d\n", tot));

        int prom=promedio(arreglo);
        mensaje(String.format("EL promedio de los multiplos de 3 es %d\n", prom));
    }

    public static int suma(int[] arreglo) {
        int suma = 0;
        int n=arreglo.length;
        for (int i = 0; i < n; i++) {
            if(arreglo[i]%3==0) {
                suma += arreglo[i];
            }
        }
        return suma;
    }

    public static int promedio(int[] arreglo) {
        int suma = 0;
        int prom = 0;
        int aux=0;
        int n=arreglo.length;
        for (int i = 0; i < n; i++) {
            if(arreglo[i]%3==0) {
                suma += arreglo[i];
                aux++;
            }
        }
        try {
            prom= suma / aux;
        } catch (ArithmeticException e) {
            mensaje("Error no se puede dividir por 0.");
        }
        return prom;
    }

    static void mensaje(String mensaje) {
        System.out.printf(mensaje);
    }
}

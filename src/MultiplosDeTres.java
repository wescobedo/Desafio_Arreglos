import java.util.ArrayList;

public class MultiplosDeTres {
    public static void main(String[] args) {
        ArrayList<Integer> arreglo = new ArrayList<Integer>();

        int n = args.length;

        for (int i = 0; i < n; i++) {
            arreglo.add(Integer.parseInt(args[i]));
        }

        int tot=suma(arreglo);
        mensaje(String.format("La suma de los multiplos de 3 es %d\n", tot));

        int prom=promedio(arreglo);
        mensaje(String.format("EL promedio de los multiplos de 3 es %d\n", prom));
    }

    public static int suma(ArrayList<Integer> arreglo) {
        int suma = 0;
        int n=arreglo.size();
        for (int i = 0; i < n; i++) {
            if(arreglo.get(i)%3==0) {
                suma += arreglo.get(i);
            }
        }
        return suma;
    }

    public static int promedio(ArrayList<Integer> arreglo) {
        int suma = 0;
        int prom = 0;
        int aux=0;
        int n=arreglo.size();
        for (int i = 0; i < n; i++) {
            if(arreglo.get(i)%3==0) {
                suma += arreglo.get(i);
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

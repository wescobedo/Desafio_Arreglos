import java.util.ArrayList;

public class SmartWatch {
    public static void main(String[] args) {
        ArrayList<Integer> pasos = new ArrayList<Integer>();
        ArrayList<Integer> pasosfiltrado = new ArrayList<Integer>();
        int n = args.length;

        for (int i = 0; i < n; i++) {
            pasos.add(Integer.parseInt(args[i]));
        }
        clearSteps(pasos, pasosfiltrado);
        int prompasos = promedio(pasosfiltrado);
        mensaje(String.format("El promedio de pasos es %d\n", prompasos));
    }

    static void clearSteps(ArrayList<Integer> pasos, ArrayList<Integer> pasosfiltrado) {

        for (int i = 0; i < pasos.size(); i++) {
            if (pasos.get(i) >= 200 && pasos.get(i) < 100000) {
                pasosfiltrado.add (pasos.get(i));
            }
        }
    }

    public static int promedio(ArrayList<Integer> pasosfiltrado) {
        int suma = 0;
        int prom = 0;
        int n=pasosfiltrado.size();
        for (int i = 0; i < n; i++) {
            suma += pasosfiltrado.get(i);
        }
        try {
            prom= suma / n;
        } catch (ArithmeticException e) {
            mensaje("Error no se puede dividir por 0.");
        }
        return prom;
    }

    static void mensaje(String mensaje) {
        System.out.printf(mensaje);
    }
}



public class Visitas {
    public static void main(String[] args) {
        int n = args.length;
        float[] numvisitas = new float[n];
        for (int i = 0; i < n; i++) {
            numvisitas[i] = Float.parseFloat(args[i]);
        }
        float promvisitas = promedio(numvisitas);
        mensaje(String.format("El promedio de visitas es %.0f\n", promvisitas));
    }

    static float promedio(float[] numvisitas) {
        float prom = 0;
        for (int i = 0; i < numvisitas.length; i++) {
            prom += numvisitas[i];
        }
        return prom / numvisitas.length;
    }

    static void mensaje(String mensaje) {
        System.out.printf(mensaje);
    }
}
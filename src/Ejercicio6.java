public class Ejercicio6 {

    public static class Estudiante {

        double nota;

        public void mostrarBoletin() {
            System.out.println("Nota del estudiante: " + this.nota);
        }

        public static double compararNotas(double n1, double n2) {
            if (n1 > n2) {
                return n1;
            } else {
                return n2;
            }

        }
    }
public static void main (String[] args){
    Estudiante estudiante1 = new Estudiante();
    estudiante1.nota = 4.5;
    estudiante1.mostrarBoletin();
    double mayor = Estudiante.compararNotas(4.5, 3.2);

    System.out.println("La nota mayor es: " + mayor);
    }
}
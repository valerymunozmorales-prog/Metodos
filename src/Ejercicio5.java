public class Ejercicio5 {
    public static double calcularPromedio(double nota1, double nota2){
        return (nota1 + nota2)/2;
    }
    public static double calcularPromedio(double[] notas){

        double suma = 0;

        for ( int i = 0; i < notas.length; i++){
            suma = suma + notas[i];
        }
        return suma/ notas.length;
    }
    public static void main(String [] args){

        double promedio1 = calcularPromedio(8, 10);
        double [] notas = {8, 10, 9};
        double promedio2 = calcularPromedio(notas);

        System.out.println(promedio1);
        System.out.println(promedio2);

    }
}

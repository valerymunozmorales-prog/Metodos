public class Ejercicio9 {
    public static String clasificarNota(double nota){

        if (nota < 3.0) {
            return "Reprobado";
        }else if (nota >= 3.0 && nota < 4.5) {
            return "Aprobado";
        }else{
            return "Excelente";
        }
    }

    public static void main(String[] args) {
        System.out.println(clasificarNota(2.8));
        System.out.println(clasificarNota(3.7));
        System.out.println(clasificarNota(4.8));
    }
}

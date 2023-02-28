package Theme3;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");

        // Primera parte:
        int resultado = sum(2, 5, 3);
        System.out.println("Resultado es: " + resultado);

        // Segunda parte:
        coche miCoche = new coche();
        miCoche.incrementarPuertas(4);

        System.out.println("Número de puertas: " + miCoche.puertas);
    }

    public static int sum(int a, int b, int c){
        return a + b + c;
    }
}

class coche{
    public int puertas = 0;
    public void incrementarPuertas(int valor){
        this.puertas = valor;
    }
}
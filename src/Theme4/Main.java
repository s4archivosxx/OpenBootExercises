package Theme4;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");

        int numeroIf = 1;
        if (numeroIf > 0){
            System.out.println("Este número es positivo.");
        }else if (numeroIf < 0){
            System.out.println("Este número es negativo.");
        }else if (numeroIf == 0){
            System.out.println("Este número es 0.");
        }

        int numeroWhile = 0;
        while (numeroWhile < 3){
            System.out.println("While-Valor: " + numeroWhile);
            numeroWhile++;
        }

        do {
            System.out.println("DoWhile-Valor: " + numeroWhile);
            numeroWhile++;
        }while (numeroWhile == 3);

        for (int numeroFor = 0; numeroFor < 3; numeroFor++){
            System.out.println("Número For: " + numeroFor);
        }

        String estacion = "VERANO";
        switch (estacion){
            case "PRIMAVERA":
                System.out.println("Estamos en primavera");
                break;
            case "VERANO":
                System.out.println("Estamos en verano");
                break;
            case "OTOÑO":
                System.out.println("Estamos en otoño");
                break;
            case "INVIERNO":
                System.out.println("Estamos en inverno");
                break;
            default:
                System.out.println("No es una estación");
        }
    }
}

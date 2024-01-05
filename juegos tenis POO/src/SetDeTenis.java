import java.util.Scanner;

public class SetDeTenis {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);

        System.out.print("Juegos ganados por A: ");
        int juegosA = leer.nextInt();

        System.out.print("Juegos ganados por B: ");
        int juegosB = leer.nextInt();

        Marcador marcador = new Marcador(juegosA, juegosB);

        if (marcador.esResultadoInvalido()) {
            System.out.println("Valores ilegales - Resultado invalido");
        } else if (marcador.ganoJugadorA()) {
            System.out.println("Gano A");
        } else if (marcador.ganoJugadorB()) {
            System.out.println("Gano B");
        } else if (marcador.aunNoTermina()) {
            System.out.println("Aun no termina");
        }

        leer.close();
    }
}

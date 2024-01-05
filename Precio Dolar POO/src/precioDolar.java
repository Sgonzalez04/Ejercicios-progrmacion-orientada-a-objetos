import java.time.LocalDate;
import java.util.Scanner;

public class precioDolar {
    private double precio;
    private LocalDate fecha;

    public precioDolar(double precio, LocalDate fecha) {
        this.precio = precio;
        this.fecha = fecha;
    }

    public double getPrecio() {
        return precio;
    }

    public LocalDate getFecha() {
        return fecha;
    }

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);

        System.out.print("¿Cuántos días quieres analizar? ");
        int numDias = leer.nextInt();
        double precioDolarHoy = 0.0;
        double precioDolarAyer = 0.0;
        double mayorAlza = 0.0;

        for (int i = 1; i <= numDias; i++) {
            System.out.println("Ingrese el precio del día: " + i);
            precioDolarHoy = leer.nextDouble();
            double diferencia = precioDolarHoy - precioDolarAyer;
            if (diferencia > mayorAlza) {
                mayorAlza = diferencia;
            }
            precioDolarAyer = precioDolarHoy;
        }
        if (mayorAlza > 0.0) {
            System.out.println("La mayor alza fue de " + mayorAlza + " pesos");
        } else {
            System.out.println("No hubo alzas en el período de tiempo.");
        }
        leer.close();
    }
}

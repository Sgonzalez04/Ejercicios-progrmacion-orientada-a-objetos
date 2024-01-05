import java.util.Calendar;
import java.util.Scanner;

public class CalculadoraEdad {
    private int diaNacimiento;
    private int mesNacimiento;
    private int añoNacimiento;

    public CalculadoraEdad(int dia, int mes, int año){
        this.diaNacimiento=dia;
        this.mesNacimiento=mes;
        this.añoNacimiento=año;
    }

    public void calcularEdad() {
        Calendar fechaActual = Calendar.getInstance();//consige el calendaria actual
        int añoActual = fechaActual.get(Calendar.YEAR);
        int mesActual = fechaActual.get(Calendar.MONTH) + 1;
        int diaActual = fechaActual.get(Calendar.DAY_OF_MONTH);

        int edad = añoActual - añoNacimiento;
        if (mesActual < mesNacimiento || (mesActual == mesNacimiento && diaActual < diaNacimiento)) {
            edad--; // Aun no se cumple año
        }

        System.out.println("Usted tiene " + edad + " años.");
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese su fecha de nacimiento:");
        System.out.print("Día: ");
        int dia = scanner.nextInt();
        System.out.print("Mes: ");
        int mes = scanner.nextInt();
        System.out.print("Año: ");
        int año = scanner.nextInt();

        CalculadoraEdad calculadora = new CalculadoraEdad(dia, mes, año);
        calculadora.calcularEdad();

        scanner.close();
    }
}

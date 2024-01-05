import java.util.Random;

public class Main {
    public static void main(String[] args) throws Exception {
        Random random = new Random();

        Carro car1 = new Carro("negro", "FSO576", 2023, "susuki", false);
        Carro car2 = new Carro("azul", "FSO573", 2023, "susuki", false);
        Carro car3 = new Carro("blanco", "FSO574", 2023, "susuki", false);

        for (int i = 0; i < 5; i++) {
            car1.acelerar(random.nextInt(50) + 1);
            car2.acelerar(random.nextInt(50) + 1);
            car3.acelerar(random.nextInt(50) + 1);
        }
        car1.setVelocidad(-9);
        System.out.println("Car1: " + car1.getVelocidad());
        System.out.println("Car2: " + car2.getVelocidad());
        System.out.println("Car3: " + car3.getVelocidad());

    }
}

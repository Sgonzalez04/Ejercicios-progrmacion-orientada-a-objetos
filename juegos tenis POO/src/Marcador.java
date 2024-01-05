
class Marcador {
    private int juegosA;
    private int juegosB;

    public Marcador(int juegosA, int juegosB) {
        this.juegosA = juegosA;
        this.juegosB = juegosB;
    }

    public boolean ganoJugadorA() {
        return (juegosA >= 6 && juegosA - juegosB >= 2) || (juegosA == 7 && juegosB == 5);
    }

    public boolean ganoJugadorB() {
        return (juegosB >= 6 && juegosB - juegosA >= 2) || (juegosB == 7 && juegosA == 5);
    }

    public boolean aunNoTermina() {
        return !(ganoJugadorA() || ganoJugadorB()) && !(juegosA >= 6 && juegosB >= 6);
    }

    public boolean ResultadoInvalido() {
        return (juegosA < 0 || juegosB < 0 || Math.abs(juegosA - juegosB) > 2 || (juegosA > 7 || juegosB > 7) || (juegosA == 6 && juegosB == 6));
    }
}
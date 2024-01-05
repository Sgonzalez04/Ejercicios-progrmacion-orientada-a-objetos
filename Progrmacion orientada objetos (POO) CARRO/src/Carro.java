public class Carro {

    private String color;
    private String placa;
    private int    modelo;
    private String marca;
    private boolean motorEstado;
    private int velocidad;

    public Carro(){

    }

    public Carro(String color, String placa, int modelo, String marca, boolean motorEstado){
        this.color=color;
        this.marca=marca;
        this.modelo=modelo;
        this.motorEstado=motorEstado;
        this.placa=placa;
        this.velocidad=0;

    }

    public void mostrar(){
        System.out.println("Color:"+this.color);
        System.out.println("Placa:"+this.placa);
        System.out.println("Modelo:"+this.modelo);
        System.out.println("Marca:"+this.marca);
        System.out.println("Estado motor:"+this.motorEstado);
    }

    private void validadAceleracion(int dato){
        if (dato<0){
            dato=0;
        }
    }

    //ya que estan privados hay que hacer get and set
    public void acelerar(int valor){
        validadAceleracion(valor);
        if (this.motorEstado!=false){
            this.velocidad+=valor;
        }
        
    }
    public void frenar(int valor){
        this.velocidad-=valor;
    }

    public String getColor() {
        return color;
    }

    public String getPlaca() {
        return placa;
    }

    public int getModelo() {
        return modelo;
    }

    public String getMarca() {
        return marca;
    }

    public boolean isMotorEstado() {
        return motorEstado;
    }

    public int getVelocidad() {
        return velocidad;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public void setModelo(int modelo) {
        this.modelo = modelo;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public void setMotorEstado(boolean motorEstado) {
        this.motorEstado = motorEstado;
    }

    public void setVelocidad(int velocidad) {
        if (velocidad<0){
            this.velocidad=0;
        }else{
        this.velocidad = velocidad;
        }
    }


    
}
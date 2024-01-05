public class Camisa {
    public String color;
    public int    precio;
    public String material;
    public String marca;


    public Camisa(String color, int precio, String material, String marca){
        this.color=color;
        this.precio=precio;
        this.material=material;
        this.marca=marca;
    }

    public void mostrar(){
        System.out.println("Color:"+this.color);
        System.out.println("precio:"+this.precio);
        System.out.println("material:"+this.material);
        System.out.println("Marca:"+this.marca);
    }

}
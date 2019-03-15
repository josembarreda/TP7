import java.lang.Double;
import java.io.Serializable;

class Producto implements Serializable{
    private String color;
    private String tipo;
    private String prod;
    private Double precio;
    public Producto() {
         prod = "";
         color = "";
         tipo = "";
         precio=0.0;
    }
    public Producto(String prod,String color, String tipo, Double precio) {
        this.prod = prod;
        this.color = color;
        this.tipo = tipo;
        this.precio=precio;
    }
    public void setProd(String pr){
      prod=pr;
    }
    public String getProd(){
      return prod;
    }
    public void setTipo(String t) {
      tipo = t;
    }
    public String getTipo() {
      return tipo;
    }
    public void setColor(String c) {
      color = c;
    }
    public String getColor() {
      return color;
    }
    public void setPrecio(Double p) {
      precio=p;
    }
    public Double getPrecio() {
      return precio;
    }
}

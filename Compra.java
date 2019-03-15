import java.io.Serializable;
import java.lang.Double;

public class Compra implements Serializable{
  private Person per;
  private Producto ap;
  private Double cant;
  public Compra() {
    // constructor por defecto
    per = new Person();
    ap = new Producto();
    cant = 0.0;
  }
  public void setPer(String name) {
    per.setName(name);
  }
  public void setAp(Producto producto) {
    ap=producto;
  }
  public void setCant(Double cant) {
    this.cant = cant;
  }
  public Person getPer() {
    return per;
  }
  public Producto getAp() {
    return ap;
  }

  public Double getCant() {
    return cant;
  }
}

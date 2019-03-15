import java.util.List;
import java.util.ArrayList;
import java.io.Console;
import java.lang.Double;
import java.io.*;

public class Demo1 {
   public static void main(String args[]) {
    Person p;
    List<Compra> lista = null;
    String input;
    String input1;
    String prod;
    String color;
    String tipo;
    String preciostr;
    Double precio;
    String entradas;
    String entradas1;
    int n=0;
    int cont=0;
    int cont1=0;
    Console console = null;
    console = System.console();
    try{
      if (console != null)
      {
	FileOutputStream outFile = new FileOutputStream("compras.dat");
        ObjectOutputStream out = new ObjectOutputStream(outFile);
	entradas1=console.readLine("Cuantas personas van a comprar? ");
        cont1=Integer.valueOf(entradas1);
	while(cont1 > 0){
        lista = new ArrayList<Compra>();
        Compra una_compra = new Compra();
        Person per=new Person();
	System.out.println(" Nombre? : ");
        input = console.readLine();
        per.setName(input);
        una_compra.setPer(input);
        entradas=console.readLine("Hola "+input+",cuantas compras realizaras?");
        cont=Integer.valueOf(entradas);
        while(cont > 0) {            
          System.out.println("Elige un producto a comprar: ");
          prod = console.readLine();
          System.out.println("Elige el tipo de " +  prod + " : ");
          tipo = console.readLine();
          System.out.println("Elige el color de " + prod + " : ");
          color = console.readLine();
          System.out.println("Que precio tiene el kilo de " + prod + "? : ");
          preciostr = console.readLine();
          precio =Double.parseDouble(preciostr);
          Producto producto=new Producto(prod,color,tipo,precio);
          una_compra.setAp(producto);
          System.out.println(" Cuantos kilos de " + prod + " has comprado: ? ");
          input1 = console.readLine();
          Double cant = Double.parseDouble(input1);
          una_compra.setCant(cant);
          lista.add(una_compra);
          cont=cont-1;
          una_compra=new Compra();
          una_compra.setPer(input);
        }
        for(Compra c: lista){
          System.out.println(c.getPer().getName() + " ha comprado " + c.getCant() + " kilos de  " + c.getAp().getProd() + " " + c.getAp().getColor() + " " + c.getAp().getTipo()+" por "+c.getAp().getPrecio()*c.getCant()+" euros, a "+c.getAp().getPrecio()+" euros/kg\n");
          out.writeObject(c);
        }
	cont1=cont1-1;
	}	

      }
    }
    catch (Exception ex)
    {
      ex.printStackTrace();
    }
  }
}


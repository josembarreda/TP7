import java.io.FileInputStream;
import java.io.ObjectInputStream;
import java.io.EOFException;
import java.io.IOException;
import java.util.Scanner;


public class CompraReadSerial{
        public static void main(String[] args) throws Exception {
        	Compra c =null;
        	//ArrayList<Object> data=new ArrayList<Object>();
        	try{
        		FileInputStream outFile = new FileInputStream("compras.dat");
        		ObjectInputStream out = new ObjectInputStream(outFile);
                    System.out.println("Lista de comprar realizadas\n");
                while((outFile.available()) > 0){
                    c = (Compra)out.readObject();
                    System.out.println(c.getPer().getName() + " ha comprado " + c.getCant() + " kilos de  " + c.getAp().getProd() + " " + c.getAp().getColor() + " " + c.getAp().getTipo()+" por "+c.getAp().getPrecio()*c.getCant()+" euros, a "+c.getAp().getPrecio()+" euros/kg\n");
                }
        		

        		//data.add(au);
        	}

            catch(IOException e)
     		{
      		System.err.println("ERROR");
     		}
     		catch(ClassNotFoundException e)
     		{
      		System.err.println("ERROR");
     		}
  			
        }
}

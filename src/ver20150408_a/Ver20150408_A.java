package ver20150408_a;
import viaggi.*;

public class Ver20150408_A {

	public static void main(String[] args) {
		int a=4;
		String b ="";
		try{
		Avventura Giungla = new Avventura(b,b,a,a);
		}
		catch(Exception e){
			System.out.println("Costruttore Avventura con stringa=0 ok");
		}

	}

}

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.ArrayList;


public class Read {

	public static void main(String[] args) throws IOException, ClassNotFoundException {
		FileInputStream fis = new FileInputStream("MusterTree.ser");
		ObjectInputStream ois = new ObjectInputStream(fis);
		 Domain D=  (Domain) ois.readObject();
		 System.out.println(D.getAll4LVL().get(20).toString());
	}

}

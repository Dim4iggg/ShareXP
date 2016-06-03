import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.ArrayList;


public class Read {

	public static void main(String[] args) throws IOException, ClassNotFoundException {
		FileInputStream fis = new FileInputStream("MusterTree.ser");
		ObjectInputStream ois = new ObjectInputStream(fis);
		FileInputStream fis1 = new FileInputStream("MusterTree.ser");
		ObjectInputStream ois1 = new ObjectInputStream(fis1);
		 Domain D=  (Domain) ois.readObject();
		 Domain D1=  (Domain) ois1.readObject();
		 ArrayList werts = new ArrayList();
		 werts.add(1);werts.add(0);werts.add(1);werts.add(1);werts.add(1);werts.add(0);
		 Tree Hobby = new Tree(0,"Hobby",D1);
		 Hobby.Setwerts(werts);
		 User u1 = new User(0,Hobby,Hobby,Hobby);
		 System.out.println(u1.getHobby());
		 werts.clear();
		 werts.add(0);werts.add(1);werts.add(0);werts.add(0);werts.add(0);werts.add(1);
		 Tree Hobby2 = new Tree(1,"Hobby",D);
		 Hobby2.Setwerts(werts);
		 System.out.println(u1.getHobby());
		 User u2 = new User(1,Hobby2,Hobby2,Hobby2);
		 System.out.println(u2.getHobby());
		 Hobby2.id = 2;
		 User u3 = new User(2,Hobby2,Hobby2,Hobby2);
		 u1.addRel(u2);
		 u1.addRel(u3);	
		 u2.addRel(u3);
		 for (Edge e :u1.getRel()) System.out.println(e.A.id+"-->"+e.B.id+": "+e.sim);
		 for (Edge e :u2.getRel()) System.out.println(e.A.id+"-->"+e.B.id+": "+e.sim);
		 for (Edge e :u3.getRel()) System.out.println(e.A.id+"-->"+e.B.id+": "+e.sim);
		

		 
	}

}

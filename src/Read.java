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
		 ArrayList werts = new ArrayList();
		 werts.add(1);werts.add(0);werts.add(1);werts.add(1);werts.add(1);werts.add(0);
		 Tree Hobby = new Tree(0,"Hobby",D,werts);
		 System.out.println(Hobby.getAllWerts(4));
		 User u1 = new User(0,Hobby,Hobby,Hobby);
		 werts.clear();
		 werts.add(0);werts.add(1);werts.add(0);werts.add(0);werts.add(0);werts.add(1);
		 Tree Hobby2 = new Tree(1,"Hobby",D,werts);
		 System.out.println(Hobby2.getAllWerts(4));
		 User u2 = new User(1,Hobby2,Hobby2,Hobby2);
		 Hobby2.id = 2;
		 User u3 = new User(2,Hobby2,Hobby2,Hobby2);
		 u1.addRel(u2);
		 u1.addRel(u3);
		 u2.addRel(u3);
		 for(Edge e : u1.getRel()) System.out.println(e.A.id+"--"+e.B.id+": "+e.getSim());
		 for(Edge e : u2.getRel()) System.out.println(e.A.id+"--"+e.B.id+": "+e.getSim());
		 for(Edge e : u3.getRel()) System.out.println(e.A.id+"--"+e.B.id+": "+e.getSim());
		 
	}

}

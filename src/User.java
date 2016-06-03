import java.io.Serializable;
import java.util.ArrayList;



public class User implements Serializable{

	protected int id;
	protected Tree hobby;
	protected Tree study;
	protected Tree work;
	protected ArrayList<Edge> relatives = new ArrayList<Edge>();

	
	
public User(int id,Tree a1, Tree a2, Tree a3 ){
	this.id = id;
	this.hobby = a1;
	this.study = a2;
	this.work = a3;
}
public int getID(){
	return this.id;
}
public ArrayList getHobby(){
	return this.hobby.getAllWerts(4);
}
public ArrayList getStudy(){
	return this.study.getAllWerts(4);
}
public ArrayList getWork(){
	return this.work.getAllWerts(4);
}
public ArrayList<Edge> getRel(){
	return this.relatives;
}
public void addRel(User B){
	Edge e = new Edge(this,B);
	Edge e2 = new Edge(B,this);
	if ( e.getSim()>0.5){ 
		this.relatives.add(e);
		B.relatives.add(e2);
	}
}
}

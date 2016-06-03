import java.io.Serializable;


public class Edge implements Serializable {

	protected double sim;
	public User A;
	public User B;
	
	public Edge(User u1, User u2){
		this.A = u1;
		this.B = u2;
		this.CountSim();
	}
	public void CountSim(){
		int count1 = 0; 
		int count2 = 0; 
		int count3 = 0; 
		for (int i = 0; i<this.A.getHobby().size(); i++){
		    if(i==this.A.getHobby().size()-1){System.out.print(count1+"+");
			System.out.print(A.getHobby().get(i)+"*");
			System.out.println(B.getHobby().get(i)+"->");}
		    else {System.out.print(count1+"+");
			System.out.print(A.getHobby().get(i)+"*");
			System.out.print(B.getHobby().get(i)+"->");}
			count1 = count1 + ((int) A.getHobby().get(i)* (int) B.getHobby().get(i));
		}
		for (int i = 0; i<this.A.getStudy().size(); i++){
			count2 = count2 + (int) A.getStudy().get(i)* (int) B.getStudy().get(i);
		}
		for (int i = 0; i<this.A.getWork().size(); i++){
			count3 = count3 + (int) A.getWork().get(i)* (int) B.getWork().get(i);
		}
		this.sim = 0.3 * (count1+count2+count3);

		
	}
	public void remove(){
		A.getRel().remove(this);
		B.getRel().remove(this); 
	}
	public  double getSim(){
		return this.sim;
	}


}

import java.util.ArrayList;


public class Tree {
	
protected int id;
protected String Name;
protected Domain domain;

public Tree (int id, String N, Domain d){  //id = user; N =type; d = structure; 
	this.id = id;
	this.Name = N;
	this.domain = d;
}
public void Setwerts(ArrayList Werts){
	for (int i = 0; i<this.domain.getAll4LVL().size();i++){
		if (i<Werts.size())this.domain.getAll4LVL().get(i).SetWert((int) Werts.get(i)); //позиции должны обязательно совпадать
		else this.domain.getAll4LVL().get(i).SetWert(0);
	}
}
public int getWert(int idlvl, int id){
	int i = 0;
	if (idlvl == 2){ i = domain.getAll2LVL().get(id).getwert(); }
	if (idlvl == 3){ i = domain.getAll3LVL().get(id).getwert(); }
	if (idlvl == 4){ i = domain.getAll4LVL().get(id).getwert(); }
	return i;
}
public ArrayList getAllWerts(int idlvl){
	ArrayList werts = new ArrayList();
	if (idlvl == 2){
		for (SimpleTreeNode i : domain.getAll2LVL()){
			werts.add(i.getwert());
		}
	}
	if (idlvl == 3){
		for (SimpleTreeNode i : domain.getAll3LVL()){
			werts.add(i.getwert());
		}
	}
	if (idlvl == 4){
		for (SimpleTreeNode i : domain.getAll4LVL()){
			werts.add(i.getwert());
		}
	}
	return werts;
}
public int getID(){
	return this.id;
}
public String getName(){
	return this.Name;
}
public Domain getD(){
	return this.domain;
}
public void Count(){
	
}

}


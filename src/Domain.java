import java.util.ArrayList;


public class Domain extends DefaultTreeNode {
	private ArrayList<SimpleTreeNode> firstlvl = new ArrayList<SimpleTreeNode>();
	private ArrayList<SimpleTreeNode> secondlvl = new ArrayList<SimpleTreeNode>();
	private ArrayList<SimpleTreeNode> thirdlvl = new ArrayList<SimpleTreeNode>();
	private ArrayList<SimpleTreeNode> fourthlvl = new ArrayList<SimpleTreeNode>();;
	
	public Domain (String Name, int id, ArrayList<SimpleTreeNode> sons){
	super (Name, id, 0);
	for (SimpleTreeNode i : sons){ this.addChild(i);}
	this.firstlvl = this.getAllChilds();
	this.secondlvl = this.getAll2LVL();
	this.thirdlvl = this.getAll3LVL();
	this.fourthlvl = this.getAll4LVL();
	}
	
	public ArrayList<SimpleTreeNode> getAll1LVL(){
	     return this.firstlvl;
	}	
public ArrayList<SimpleTreeNode> getAll2LVL(){
	ArrayList<SimpleTreeNode> grandsons = new ArrayList<SimpleTreeNode>();
	for (SimpleTreeNode i : this.firstlvl){
             grandsons.addAll(i.getAllChilds());
	}
	return grandsons;
}
public ArrayList<SimpleTreeNode> getAll3LVL(){
	ArrayList<SimpleTreeNode> grandgrandsons = new ArrayList<SimpleTreeNode>();
	for (SimpleTreeNode i : this.secondlvl){
             grandgrandsons.addAll(i.getAllChilds());
	}
	return grandgrandsons;
}

public ArrayList<SimpleTreeNode> getAll4LVL(){
	ArrayList<SimpleTreeNode> grandgrandgrandsons = new ArrayList<SimpleTreeNode>();
	for (SimpleTreeNode i : this.thirdlvl){
        grandgrandgrandsons.addAll(i.getAllChilds());
}
	return grandgrandgrandsons;
}
}

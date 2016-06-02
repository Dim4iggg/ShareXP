import java.io.Serializable;
import java.util.ArrayList;



public class DefaultTreeNode
			implements Serializable, SimpleTreeNode{

	protected String Name;
	protected int idlvl;
	protected int id;
	protected int Wert;
	protected SimpleTreeNode parent;
	protected ArrayList<SimpleTreeNode> childs = new ArrayList<SimpleTreeNode>();
	public int  childcnt;
	
	   public DefaultTreeNode(String name, int id, int idlvl)
	   {
		 this.id	= id;
		 this.idlvl = idlvl;
	     this.Name     = name;
	     this.childcnt = 0;
	     this.childs = new  ArrayList<SimpleTreeNode>(); 
	   }
	  
	   public void addChild(SimpleTreeNode child) {
	      childs.add(child);
	     ((DefaultTreeNode) child).setParent(this);
	     childcnt++;
	   }
	  
	   public int getChildCnt(){
	     return childcnt;
	   }
	 
	  
	   public SimpleTreeNode getChild(int pos){
	     return childs.get(pos);
	   }
	 
	
	      public String toString(){
	     return this.Name;
	   }
		
	      public SimpleTreeNode getParent() {
			return this.parent;
		}
	      public int getwert(){
	    	  return this.Wert;
	      }
	      public int getID(){
	    	  return this.id;
	      }
	      public int getIDlvl(){
	    	  return this.idlvl;
	      }
		
	      public void setParent( SimpleTreeNode a) {
				this.parent=a;
				}
	      @Override
	      public ArrayList<SimpleTreeNode> getAllChilds() {
				return childs;
			}
	      public void SetWert(int w){
	    	  this.Wert = w;
	      }
}

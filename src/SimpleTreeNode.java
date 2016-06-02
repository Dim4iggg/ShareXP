import java.util.ArrayList;
import java.util.Collection;


public interface SimpleTreeNode {
	public void addChild(SimpleTreeNode child);
	   public SimpleTreeNode getChild(int pos);
	   public SimpleTreeNode getParent();
	   public String toString();
	   public void setParent( SimpleTreeNode a);
	   public ArrayList<SimpleTreeNode> getAllChilds();
	   public int getwert();
	   public int getID();
	   public int getIDlvl();
	   public void SetWert(int w);
	public int getChildCnt();
	   

}

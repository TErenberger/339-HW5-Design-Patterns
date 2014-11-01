import java.util.ArrayList;


public class Ant {

	protected String name;
	protected ArrayList<Ant> children;
	protected Ant parent;
	
	public Ant(String name, Ant parent)
	{
		this.name = name;
		this.parent = parent;
		if(parent != null)
		{
			parent.addChild(this);
		}
		this.children = new ArrayList<Ant>();
	}
	
	public void addChild(Ant inChild)
	{
		this.children.add(inChild);
	}
	
	public void removeChild(Ant inChild)
	{
		this.children.remove(inChild);
	}
	
	public ArrayList<Ant> getChildren()
	{
		return this.children;
	}
		
	public void roleCall()
	{
		
		Ant depthChecker = this.parent;
		String depth = "";
		while(depthChecker != null)
		{
			depth += "\t";
			depthChecker = depthChecker.parent;
		}
		
		System.out.println(depth + this.name );
		
		
		for(Ant child : this.children)
		{
			child.roleCall();
		}
	}
	
	
}

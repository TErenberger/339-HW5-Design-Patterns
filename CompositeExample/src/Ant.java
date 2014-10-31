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
		//System.out.println("Start Name: " + this.name + " Children:");
		if(this.children.isEmpty())
		{
			System.out.println("\t\tLeaf Ant " + this.name + " parent: " + this.parent.name);
		}
		else
		{
			if(this.parent == null)
			{
				System.out.println("Root Ant " + this.name);
			}
			else
			{
				System.out.println("\tNode Ant " + this.name );
			}
			
		}
		for(Ant child : this.children)
		{
			child.roleCall();
		}
		//System.out.println("End "+this.name + " Children");
	}
	
	
}

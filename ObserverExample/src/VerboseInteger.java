import java.util.ArrayList;


public class VerboseInteger {

	private int value;
	ArrayList<IntegerObserver> observers;
	
	public VerboseInteger(int inValue)
	{
		this.value = inValue;
		this.observers = new ArrayList<IntegerObserver>();
		
	}
	
	public void attach(IntegerObserver inObserver)
	{
		this.observers.add(inObserver);
		
	}
	
	public int getValue()
	{
		return this.value;
	}
	
	public void setValue(int newValue)
	{
		this.value = newValue;
		this.updateAllObservers();
	}
	
	public void updateAllObservers()
	{
		for(IntegerObserver current : this.observers)
		{
			current.update();
		}
	}
	
}

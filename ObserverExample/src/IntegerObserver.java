
public abstract class IntegerObserver {

	public abstract void update();
	public VerboseInteger subject;
	
	public IntegerObserver(VerboseInteger inSubject)
	{
		this.subject = inSubject;
		this.subject.attach(this);
	}
	
	
}

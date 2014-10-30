
public abstract class StringDecorator implements DecoratedString {

	protected DecoratedString subject;
	
	public StringDecorator(DecoratedString subject)
	{
		this.subject = subject;
	}
	
	@Override
	public void print() {
		this.subject.print();
	}

}

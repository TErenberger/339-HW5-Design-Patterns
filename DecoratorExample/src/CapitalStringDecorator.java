
public class CapitalStringDecorator extends StringDecorator {

	public CapitalStringDecorator(DecoratedString subject)
	{
		super(subject);
	}
	 
	@Override
	public void print()
	{
		//this.subject.print();
		System.out.println(this.subject.getText().toUpperCase());
	}

	@Override
	public String getText() {
		return subject.getText();
	}

	@Override
	public void dosPrint() {
		System.out.println(this.subject.getText().replace(' ', '-').toUpperCase());
		
	}
	
}

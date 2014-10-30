
public class FancyString implements DecoratedString {

	String text;
	
	public FancyString(String inText)
	{
		this.text = inText;
	}
	
	
	@Override
	public void print() {
		System.out.println(this.text);

	}
	
	@Override
	public String getText()
	{
		return this.text;
	}

}

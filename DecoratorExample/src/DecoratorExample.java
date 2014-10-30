
public class DecoratorExample {

	public static void main(String[] args)
	{
		FancyString text = new FancyString("Iowa State University");
		
		CapitalStringDecorator decoratedText = new CapitalStringDecorator(text);
		
		text.print();
		decoratedText.print();
		
		
	}
	
	
}

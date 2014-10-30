
public class DecoratorExample {

	public static void main(String[] args)
	{
		FancyString text = new FancyString("Iowa State University");
		
		CapitalStringDecorator decoratedText = new CapitalStringDecorator(text);
		LowerStringDecorator otherDecoratedText = new LowerStringDecorator(text);
		System.out.println("Undecorated:");
		text.print();
		text.dosPrint();
		System.out.println("Captial Decorated:");
		decoratedText.print();
		decoratedText.dosPrint();
		System.out.println("Lower Decorated:");
		otherDecoratedText.print();
		otherDecoratedText.dosPrint();
		
		
	}
	
	
}


public class LowerStringDecorator extends StringDecorator {

	public LowerStringDecorator(DecoratedString subject) {
		super(subject);
	}

	@Override
	public String getText() {
		return subject.getText();
	}

	@Override
	public void print()
	{
		System.out.println(this.getText().toLowerCase());
	}
	@Override
	public void dosPrint() {
		System.out.println(this.getText().replace(' ', '-').toLowerCase());
	}

}

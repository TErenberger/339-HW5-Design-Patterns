
public class ReverseObserver extends IntegerObserver {

	private String reversedValue;
	public ReverseObserver(VerboseInteger inSubject) {
		super(inSubject);
	}

	@Override
	public void update() {
		
		this.reversedValue = this.subject.getValue() + "";
		char[] working = this.reversedValue.toCharArray();
		this.reversedValue = "";
		for( int i = working.length-1; i >= 0; i--)
		{
			this.reversedValue = this.reversedValue + working[i];
		}
		
		System.out.println("Reverse Observer has been updated that subject has changed\nSubject Value: " + this.subject.getValue() + " Reversed Value: " + this.reversedValue);

	}

}

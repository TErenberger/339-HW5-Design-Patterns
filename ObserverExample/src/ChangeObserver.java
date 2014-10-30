
public class ChangeObserver extends IntegerObserver {
	
	int previousValue;
	
	public ChangeObserver(VerboseInteger inSubject) {
		super(inSubject);
		this.previousValue = inSubject.getValue();
	}

	@Override
	public void update() {
		int diff =  subject.getValue() - this.previousValue;
		System.out.println("\nChange Observer has been updated that subject has changed\nSubject changed by: " + diff + "\n");
		this.previousValue = subject.getValue();

	}

}

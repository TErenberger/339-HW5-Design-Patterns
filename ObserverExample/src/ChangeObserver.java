
public class ChangeObserver extends IntegerObserver {

	public ChangeObserver(VerboseInteger inSubject) {
		super(inSubject);
		
	}

	@Override
	public void update() {
		
		System.out.println("\nChange Observer has been updated that subject has changed\n");

	}

}

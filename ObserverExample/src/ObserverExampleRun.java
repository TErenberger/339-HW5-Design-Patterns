
public class ObserverExampleRun {
	public static void main(String[] args)
	{
		VerboseInteger subject = new VerboseInteger(1000);
		
		ChangeObserver booleanObs = new ChangeObserver(subject);
		ReverseObserver flipobs = new ReverseObserver(subject);
		
		subject.setValue(1002);
		subject.setValue(1993);
		subject.setValue(1000);
		
	}
}

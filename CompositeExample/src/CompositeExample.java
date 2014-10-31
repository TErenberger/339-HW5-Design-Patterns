
public class CompositeExample {

	public static void main(String[] args) {
		Ant queen = new Ant("Queen Ant", null);
		Ant worker1 = new Ant("Worker1", queen);
		Ant worker2 = new Ant("Worker2", queen);
		
		Ant underling = new Ant("Underling1", worker1);
		Ant general = new Ant("general", queen);
		Ant fighter = new Ant("Fighter1", general);
		queen.roleCall();
		
		

	}

}

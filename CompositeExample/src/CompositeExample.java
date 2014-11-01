
public class CompositeExample {

	public static void main(String[] args) {
		Ant queen = new Ant("Queen Ant", null);
		Ant general = new Ant("general1", queen);
		Ant colonel = new Ant("colonel1", general);
		Ant captain = new Ant("captain1", colonel);
		Ant soldier = new Ant("soldier1", captain);
		Ant soldier2 = new Ant("soldier2", captain);
		Ant worker1 = new Ant("Worker1", queen);
		Ant worker2 = new Ant("Worker2", queen);
		
		Ant underling = new Ant("Underling1", worker1);
		Ant underling2 = new Ant("Underling2", worker1);
		
		
		Ant general2 = new Ant("general2", queen);
		Ant colonel2 = new Ant("colonel2", general2);
		Ant captain2 = new Ant("captain2", colonel2);
		Ant soldier3 = new Ant("soldier3", captain2);
		Ant soldier4 = new Ant("soldier4", captain2);
		
		queen.roleCall();
		
		
		

	}

}

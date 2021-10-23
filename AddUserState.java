package state;
import java.util.*;
import observer.*;
public class AddUserState implements State{
	App app;
	public AddUserState(App app) {
		this.app = app;
	}
	@Override
	public void switchContext(GroupApp group) {
		System.out.println("\n\n===========Welcome to Social Media App=============\n\n"
				+ "Add users to the system for them to get notified\n");

		Scanner input = new Scanner(System.in);
		System.out.println("Enter a name for user");
		String name = input.nextLine();
		User user = new User(name);
		user.Subscribe(group); //subsribe to group

		app.setState(app.getFollowState());;
		app.switchContext(group);


	}

}

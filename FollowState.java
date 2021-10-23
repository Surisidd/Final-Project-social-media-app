package state;

import observer.GroupApp;
import java.util.*;
public class FollowState implements State {
	App app;
	public FollowState(App app) {
		this.app = app;
	}
	@Override
	public void switchContext(GroupApp group) {
		System.out.println("\nWhat do you like to do next?\n"
				+ "1) Add more users\n"
				+ "2) Add posts\n"
				+ "3) Exit");
		Scanner input = new Scanner(System.in);
		int select = input.nextInt();

		switch(select) {
		case 1:
			app.setState(app.getAddUser());
			app.switchContext(group);
			break;
		case 2:
			app.setState(app.getPostState());
			app.switchContext(group);
			break;
		default:
			System.exit(0);

		}

	}

}

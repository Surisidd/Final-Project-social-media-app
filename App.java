package state;
import observer.*;
public class App implements State{
	State addUser;
	State followState;
	State postState;
	State state;
	GroupApp groupApp;

	public App(GroupApp groupApp) {
		addUser = new AddUserState(this);
		followState = new FollowState(this);
		postState = new CreateNewPostState(this);
		this.groupApp = groupApp;
		state = addUser;
	}

	public State getAddUser() {
		return addUser;
	}



	public State getFollowState() {
		return followState;
	}



	public State getPostState() {
		return postState;
	}



	public State getState() {
		return state;
	}

	public void setState(State state) {
		this.state = state;
	}
	public void switchContext(GroupApp groupApp) {
		state.switchContext(groupApp);
	}
}

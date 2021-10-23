package state;
import factory.*;
import observer.GroupApp;
import java.util.*;
public class CreateNewPostState implements State {
	App app;
	public CreateNewPostState(App app) {
		this.app = app;
	}
	@Override
	public void switchContext(GroupApp group) {

		System.out.print("Add post to the group\n\n\n"
				+ "Enter a post content");

		Scanner input = new Scanner(System.in);
		String content = input.nextLine();

		TextPost post = new TextPost();
		post.setBody(content);
		group.newPost(post);

		app.setState(app.getFollowState());
		app.switchContext(group);

	}

}

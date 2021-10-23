package observer;
import factory.*;
public class User implements Observer {
	private String name;
	public User(String name) {
		this.name = name;
	}
	public void Subscribe(GroupApp groupApp) {
		groupApp.registerObserver(this);
		System.out.println("\n "+ this.name+" Subscribed to " + groupApp.getName());

	}
	public void unSubscribe(GroupApp groupApp) {
		groupApp.removeObserver(this);
		System.out.println("\n"+ this.name + " unsubscribed to " + groupApp.getName() +"\n");
	}
	public void update(Post post) {
		System.out.println("\n" + this.name + " got new " + post.getName() + " about " + post.getBody());
	}
	public String getName() {
		return name;
	}
}

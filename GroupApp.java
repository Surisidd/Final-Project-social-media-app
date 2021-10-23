package observer;
import factory.*;
import java.util.*;
public class GroupApp implements Subject{
	private List<Observer> observers = new ArrayList<Observer>();

	private Post post;
	private String name;
	public GroupApp(String name ) {

		this.name = name;

	}

	public void registerObserver(Observer o) {
		observers.add(o);

	}
	public void newPost(Post post) {
		this.post = post;
		notifyObserver();
	}

	public String getName() {
		return name;
	}
	public Post getPost() {
		return post;
	}

	@Override
	public void removeObserver(Observer o) {
		// TODO Auto-generated method stub
		observers.remove(o);
	}

	@Override
	public void notifyObserver() {
		// TODO Auto-generated method stub
		for (Observer observer : observers) {
			observer.update(this.getPost());
		}
	}

}

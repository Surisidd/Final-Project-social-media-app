package test;
import observer.*;
import observer.GroupApp;

public class ObserverUnitTest {

	public static void main(String[] args) {
		GroupApp group = new GroupApp("Java group");
		User testUser = new User("John");
		testUser.Subscribe(group);
	}

}

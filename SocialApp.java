package factory;
import observer.*;
import state.*;
public class SocialApp {

	public static void main(String[] args) {
		//facade pattern
		GroupApp group = new GroupApp("Java group");
		App application = new App(group);
		application.switchContext(group);
	}

}

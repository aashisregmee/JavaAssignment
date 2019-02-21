import java.awt.*;
import java.applet.*;
public class LoginModule extends Applet{
	public void init(){
		Label userName = new Label("Name");
		TextField user_Name = new TextField(20);
		
		Label password = new Label("Password");
		TextField pass_word = new TextField(20);
		
		Button btn = new Button("Login");
		Button cancel = new Button("cancel");
		

		add(userName);
		add(user_Name);
		add(password);
		add(pass_word);
		add(btn);
		add(cancel);
		pass_word.setEchoChar('*');
	}
}
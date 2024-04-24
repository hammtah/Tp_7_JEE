package Tp.Dao.interfaces;
import Tp.beans.*;

public interface UserInterface {
	public User checkUser(String login, String pass);
	public boolean addUser(User u);
}

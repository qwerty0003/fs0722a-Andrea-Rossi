package lez2;

import java.util.ArrayList;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class GestioneUser {
	
	private List<User> userList = new ArrayList<User>();
	Logger log = LoggerFactory.getLogger(Main.class);
	
	public List<User> getUserList() {
		return userList;
	}

	public void setUserList(List<User> userList) {
		this.userList = userList;
	}
	
	public void addToList(User u) {
		if(!userList.contains(u))
			userList.add(u);
		else
			log.error(u.getNome()+ " "+ u.getCognome()+" già inserito");
	}
	
	public void removeFromList(User u) {
		if(userList.contains(u))
			userList.remove(u);
		else
			log.error(u.getNome()+ " "+ u.getCognome()+" non è presente nella lista");
	}
	
	public void print() {
		for(User user: userList) {
			log.info(user.toString());
			System.out.println(user);
		}
	}
	
	public User getUserByIndex(int ind) {
		return userList.get(ind);
	}
	
	public void updateUser(User u, int ind) {
		userList.set(ind, u);
	}
	
}

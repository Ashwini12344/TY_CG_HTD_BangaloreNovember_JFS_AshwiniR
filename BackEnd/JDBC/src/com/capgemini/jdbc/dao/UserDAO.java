package com.capgemini.jdbc.dao;
import com.capgemini.jdbc.bean.UserBean;
import java.util.*;

public interface UserDAO {
	public List<UserBean>getAllUsers();
	public UserBean UserLogin(String username,String password);
	public boolean updateUser(int userid,String password,String email);
	public boolean deleteUser(int userid,String password);
	public boolean insertUser(UserBean user);

}

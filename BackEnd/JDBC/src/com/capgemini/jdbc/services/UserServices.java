package com.capgemini.jdbc.services;
import com.capgemini.jdbc.bean.UserBean;
import java.util.List;

public interface UserServices {
	public List<UserBean> getAllUsers();
	public UserBean userLogin(String username,String password);
	public boolean updateUser(int userid,String passworrd,String email);
	public boolean deleteUser(int userid,String pasword);
	public boolean insertUser(UserBean user);
	

}

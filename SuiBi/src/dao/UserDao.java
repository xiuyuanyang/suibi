package dao;

import beans.User;

public interface UserDao {
	
	User findUserById(String uid);
	
	User findUserByName(String name);

	User findUserByMobile(String mobile);
	
	User findUserByMobileAndPassword(String mobile , String pass);
	
	int insertUser(User user);

	int deleteUser(User user);

	int updateUser(User user);
	
}

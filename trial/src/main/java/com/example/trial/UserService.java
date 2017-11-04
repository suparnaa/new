package com.example.trial;

public interface UserService {
	public User findUserByEmail(String email);
	public void saveUser(User user);
}
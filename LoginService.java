package com.game.ThreeDay.Service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.game.ThreeDay.Model.Login;
@Service
public interface LoginService {
	List<Login> getAllLogin();//lay danh sach cac login
	void saveLogin(Login login);//tao moi login
	Login getLoginById(long id);//tim login theo id
	void deleteLoginById(long id);//xoa login theo id
}

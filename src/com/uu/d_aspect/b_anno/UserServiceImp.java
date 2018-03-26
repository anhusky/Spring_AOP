package com.uu.d_aspect.b_anno;

import org.springframework.stereotype.Service;



@Service("userServiceId")
public class UserServiceImp implements UserService {

	public void addUser() {
		System.out.println("d_aspect.b_anno.............a_jdk");
	}

	public void updateUser() {
		//int i= 1/0;
		System.out.println("d_aspect.b_anno.............a_jdk");
	}

	public void deleteUser() {
		System.out.println("d_aspect.b_anno.............a_jdk");
	}

}

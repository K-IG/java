package com.example.myboard.service;

import java.util.List;

import org.springframework.data.domain.Page;

import com.example.myboard.model.User;


public interface UserService {		//interface : {}가 없고, 상속받은 곳에서 {}를 만들어줘야함
	// 모든 항목 가져오기
	List<User> getAllUser();	//List : 배열의 일종

	//특정 항목 가져오기
	User getUserById(Long id);	// 인터페이스에 있는 메서드는 상속받은 곳에서 완성
	
	//특정 항목 저장하기
	User saveUser(User user);	// User 전체를 받아서 저장
	
	// 특정 항목 수정하기
	User updateUser(User user);		//User 전체를 받아서 User에 덮어쓰기
	
	
	//특정 항목 삭제하기
	void deleteUserById(Long id);	//user의 id만 받아서 삭제
	
	//페이지 나누기
	Page<User> findPaginated(int no, int totalNo); 		//한 페이지에 보여줄 수 있는 갯수
	
	
	
	
	
}

package com.example.myboard.service.imp1;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import com.example.myboard.model.User;
import com.example.myboard.repository.UserRepository;
import com.example.myboard.service.UserService;

@Service
public class UserServiceimpl implements UserService{

	@Autowired
	private UserRepository user;
	
	
	public UserServiceimpl(UserRepository user) {
		super();
		this.user = user;
	}


	//정보 보여주기
	public List<User> getAllUser() {
		return user. findAll(); 						// 상속받은 인터페이스의 함수를 오버라이딩
	}
	
	@Override
	public User getUserById(Long id) {
		// TODO Auto-generated method stub
		return user.findById(id).get();
	}


	@Override
	public User saveUser(User user) {
		// TODO Auto-generated method stub
		return this.user.save(user);
	}


	@Override
	public User updateUser(User user) {				//새로 저장하기
		return this.user.save(user);
	}

	
	//아이디로 삭제하기
	public void deleteUserById(Long id) {
		user.deleteById(id);
		
	}


	//일부만 보여주기
	public Page<User> findPaginated(int no, int totalNo) {
		Pageable pageable = PageRequest.of(no-1, totalNo);
		return user.findAll(pageable);
		
	}

}

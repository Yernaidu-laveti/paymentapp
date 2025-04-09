package com.example.SpringPaymentApp;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;

public interface UserRepository extends JpaRepository<User,Integer>
{
	boolean existsByUserNameAndPassword(String userName,String password);

	boolean existsByUserId(int userId);

}

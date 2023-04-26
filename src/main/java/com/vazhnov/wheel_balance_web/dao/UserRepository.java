package com.vazhnov.wheel_balance_web.dao;







import com.vazhnov.wheel_balance_web.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;


public interface UserRepository extends JpaRepository<User, Integer> {

}

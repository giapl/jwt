package com.example.jwt.repository;

import com.example.jwt.data.enity.User;
import java.util.Optional;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

public interface IUserRepository extends JpaRepository<User, Integer> {

  @Query(value = "select *from test where email = :email", nativeQuery = true)
  Optional<User> findByEmail(@Param("email") String email);

}

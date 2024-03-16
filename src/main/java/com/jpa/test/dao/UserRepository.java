package com.jpa.test.dao;

import com.jpa.test.entities.User;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface UserRepository extends CrudRepository<User,Integer> {

public  List<User> findByName(String name);

public List<User> findByNameAndCity(String name,String city);

  public  List<User> findByNameContaining(String a);

  public List<User> findByNameEndingWith(String a);

// write JPA Querry
    @Query("Select u from User u")
    public List<User> getAllUser();

    @Query("Select u from User u where u.name =:n")
    public List<User>getUserByName(@Param("n")String name);

// Write native Querry i,e SQL

    @Query(value = "Select * from user",nativeQuery = true)
    public List<User>getUsers();

    @Query(value = "Select * from user where name =:n and city=:t",nativeQuery = true)
    public List<User> findByNameAndCityName(@Param("n")String name,@Param("t")String city);
}

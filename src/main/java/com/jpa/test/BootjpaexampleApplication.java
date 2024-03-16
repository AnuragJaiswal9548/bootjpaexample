package com.jpa.test;

import com.jpa.test.dao.UserRepository;
import com.jpa.test.entities.User;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import java.util.ArrayList;
import java.util.List;

@SpringBootApplication
public class BootjpaexampleApplication {

	public static void main(String[] args) {

		ApplicationContext context = SpringApplication.run(BootjpaexampleApplication.class, args);
		UserRepository userRepository = context.getBean(UserRepository.class);


//		Optional<User> optional = userRepository.findById(3);
//		User user = optional.get();
//
//		user.setName("Shresth");
//
//		userRepository.save(user);
//
//		System.out.println("*************************Changes saved");

//		Iterable<User> itr= userRepository.findAll();
//		Iterator<User> iterator=itr.iterator();
//		while (iterator.hasNext()){
//			User user=iterator.next();
//			System.out.println(user);
//		}


//userRepository.deleteById(2);
//	System.out.println("deleted");

//		ArrayList<List<User>> list=new ArrayList<>();
//        list.add(userRepository.findByName("Anurag"));
//		for(int i=0;i<list.size();i++){
//			System.out.println("No-"+i+" "+list.get(i));
//		}

//ArrayList<List<User>>list=new ArrayList<>();
//list.add(userRepository.findByNameAndCity("Anurag","Pilibhit"));
//		for(int i=0;i<list.size();i++){
//			System.out.println(list.get(i));
//		}

//ArrayList<List<User>>list=new ArrayList<>();
//list.add(userRepository.findByNameContaining("A"));
//		System.out.println(list);

//		ArrayList<List<User>> list=new ArrayList<>();
//		list.add(userRepository.findByNameEndingWith("g"));
//
//		System.out.println(list);


//ArrayList<List<User>>list=new ArrayList<>();
//list.add(userRepository.getAllUser());
//		for(int i=0;i<list.size();i++){
//			System.out.println(list.get(i));
//		}


//ArrayList<List<User>> list=new ArrayList<>();
//list.add(userRepository.getUserByName("Anurag"));
//		System.out.println(list);


ArrayList<List<User>> list=new ArrayList<>();
list.add(userRepository.findByNameAndCityName("Anurag","Pilibhit"));
		System.out.println(list);

	}
}

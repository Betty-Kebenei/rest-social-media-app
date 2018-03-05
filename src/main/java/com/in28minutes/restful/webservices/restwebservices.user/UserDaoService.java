package com.in28minutes.restful.webservices.restwebservices.user;

import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

@Component
public class UserDaoService {

    private static List<User> users = new ArrayList<>();

    private static int userCount = 4;

    static {
        users.add(new User(1, "Adam", new Date()));
        users.add(new User(2, "Adam", new Date()));
        users.add(new User(3, "Bill", new Date()));
        users.add(new User(4, "Betty", new Date()));
    }

    public static List<User> findAll() {
        return users;
    }

    public User save(User user) {
        if(user.getId()==null){
            user.setId(++userCount);
        }
        users.add(user);
        return user;
    }

    public User findOne(int id){
        for(User user:users){
            if(user.getId()==id){
                return user;
            }
        }
        return null;
    }

    public User deleteUser(int id){
        Iterator<User> iterator = users.iterator();
        while(iterator.hasNext()){
            User user = iterator.next();
            if(user.getId()==id){
                iterator.remove();
                return user;
            }
        }
        return null;
    }

}

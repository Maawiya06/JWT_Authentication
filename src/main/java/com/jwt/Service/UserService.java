package com.jwt.Service;

import com.jwt.Model.Users;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

@Service
public class UserService {

    private List<Users> Store = new ArrayList<>();

    public UserService(){
        Store.add(new Users(UUID.randomUUID().toString(), "Ameer Maawiya", "ameermaawiya@gmail.com"));
        Store.add(new Users(UUID.randomUUID().toString(), "Ameer", "ameer@gmail.com"));
        Store.add(new Users(UUID.randomUUID().toString(), "Maawiya", "maawiya@gmail.com"));
        Store.add(new Users(UUID.randomUUID().toString(), "Hamza", "Hamza@gmail.com"));
    }

    public List<Users> getUsers(){
        return this.Store;
    }
}

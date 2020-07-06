package com.inm381.app.soacw.services;

import com.inm381.app.soacw.domain.User;
import com.inm381.app.soacw.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {

    @Autowired 
    private UserRepository userRepository;

    /**
     * CRUD - Create operation
     * @param u
     */
    public void createUser(User u){
        userRepository.save(u);
    }

    /**
     * CRUD - read operation
     * @return
     */
    public List<User> getAllUsers(){
        return userRepository.findAll();
    }

    /**
     * CRUD - read operation
     * @param id
     * @return
     */
    public User getUser(Long id){
        return userRepository.findById(id).get();
    }

    /**
     * CRUD - update operation
     * @param details
     * @return
     */
    public User updateUser(User details){
        if(userRepository.findById(details.getId()).isPresent()){
            User storedVal = userRepository.findById(details.getId()).get();

       
                storedVal.equals(details);

            userRepository.save(storedVal);
        }
       
        return userRepository.findById(details.getId()).get();
    }

    /**
     * CRUD - Delete operation
     * @param u
     */
    public void deleteUser(User u){
        userRepository.delete(u);
    }

    /**
     * find by name
     * @param name
     * @return
     */

}

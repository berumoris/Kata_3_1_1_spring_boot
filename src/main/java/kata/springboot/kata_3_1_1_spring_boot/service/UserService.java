package kata.springboot.kata_3_1_1_spring_boot.service;

import kata.springboot.kata_3_1_1_spring_boot.model.User;
import kata.springboot.kata_3_1_1_spring_boot.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import java.util.List;

@Service
public class UserService {

    private final UserRepository userRepository;


    public UserService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    public User getUser(Long id) {
        return userRepository.getById(id);
    }

    public List<User> findAllUsers() {
        return userRepository.findAll();
    }

    public void saveUser(User user) {
        userRepository.save(user);
    }

    public void deleteUser(Long id) {
        userRepository.deleteById(id);
    }

}

package co.duvan.springcloud.user.app.services;

import co.duvan.springcloud.user.app.models.User;

import java.util.List;
import java.util.Optional;

public interface UserService {

    List<User> findAll();

    Optional<User> findById(Long id);

    User save(User user);

    void deleteById(Long id);

}

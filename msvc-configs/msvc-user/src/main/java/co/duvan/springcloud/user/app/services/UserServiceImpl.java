package co.duvan.springcloud.user.app.services;

import co.duvan.springcloud.user.app.models.User;
import co.duvan.springcloud.user.app.repositories.UserRepository;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Optional;

@Service
public class UserServiceImpl implements UserService {

    //* Vars
    private final UserRepository repository;

    //* Constructor
    public UserServiceImpl(UserRepository repository) {
        this.repository = repository;
    }

    //* Methods
    @Override
    @Transactional(readOnly = true)
    public List<User> findAll() {
        return (List<User>) repository.findAll();
    }

    @Override
    @Transactional(readOnly = true)
    public Optional<User> findById(Long id) {
        return repository.findById(id);
    }

    @Override
    @Transactional
    public User save(User user) {
        return repository.save(user);
    }

    @Override
    @Transactional
    public void deleteById(Long id) {
        repository.deleteById(id);
    }

}

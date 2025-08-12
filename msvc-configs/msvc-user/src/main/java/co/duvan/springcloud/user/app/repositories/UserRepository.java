package co.duvan.springcloud.user.app.repositories;

import co.duvan.springcloud.user.app.models.User;
import org.springframework.data.repository.CrudRepository;

public interface UserRepository extends CrudRepository<User, Long> {
}

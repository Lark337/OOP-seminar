package seminar5.controller;

import seminar5.model.User;
import seminar5.repository.GBRepository;
import seminar5.log.log;

import java.util.List;
import java.util.Objects;



public class UserController {
    private final GBRepository<User, Long> repository;
    private log log;



    public UserController(GBRepository<User, Long> repository) {
        this.repository = repository;
        this.log = new log();
    }

    public void saveUser(User user) {
        repository.create(user);
        log.save(user,"Создание контакта");
        
    }

    public User readUser(Long userId) throws Exception {
        List<User> users = repository.findAll();
        for (User user : users) {
            if (Objects.equals(user.getId(), userId)) {
                log.save(user,"Поиск контакта:");
                return user;
            }
        }
        log.save(String.format("Поиск контакта, контакт под id %d не найден",userId));
        throw new RuntimeException("User not found");
    }

    public User findUserById(long id) {
        return repository.findById(id).orElseThrow(()-> new RuntimeException("User not found."));
    }

    public List<User> getAllUsers() {
        List<User> res = repository.findAll();
        log.save("Просмотр списка контакт");
        return res;
    }

    public boolean userUpdate(long id, User update) {
        try {
            log.save(update, String.format("Обновление пользователя\n%s\n на ", readUser(id).toString(),update.toString()));
            repository.update(id, update);
            return true;
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}

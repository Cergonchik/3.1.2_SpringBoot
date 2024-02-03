package web.SpringBoot.servise;



import web.SpringBoot.model.User;

import java.util.List;


public interface UserService {
     List<User> getAllUsers();
     void addUser(User user);
     void deleteUser(int userId);
     void updateUser(int id, User user);
     User getUser(int userId);
}

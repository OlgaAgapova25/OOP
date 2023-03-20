package Seminar5.Task1.view;

import Seminar5.Task1.model.User;
import Seminar5.Task1.service.UserService;
import Seminar5.Task1.service.UserServiceImpl;

public class UserView {
    private UserService userService = new UserServiceImpl();
    public void saveUser(String name, int age, float salary){
        userService.save(new User(name, age, salary));
    }
}

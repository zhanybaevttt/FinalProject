package company.service;

import company.dao.MyExceptionClass;
import company.dao.UserDao;
import company.model.User;

import java.util.List;

import static javax.swing.UIManager.get;

public class UserService implements UserServiceImpl {

    private final UserDao userDao = new UserDao();

    @Override
    public void UserlerdiKoshu(User user) {
        List<User> users = userDao.getUsers();
        users.add(user);

    }

    @Override
    public User IDmenenTabuu(int id) {
        return userDao.getUsers()
                .stream()
                .filter(user -> user.getId() == id)
                .findFirst()
                .orElseThrow(() -> new MyExceptionClass("The program did not find it this id"));
    }


    @Override
    public void IDmenenOchuruu(int id) {
//
//        for (User user : userDao.getUsers()) {
//            if (user.getId() == id) {
//                userDao.getUsers().remove(user);
//            }
//        }
        try {
            User user1 = userDao.getUsers()
                    .stream()
                    .filter(user -> user.getId() == id)
                    .findFirst()
                    .orElseThrow(() -> new MyExceptionClass("The program did not find it this id"));
            userDao.getUsers().remove(user1);

        }catch (MyExceptionClass e){
            System.out.println(e.getMessage());
        }

    }


    @Override
    public void BardykUserlerdiAluu() {
        userDao.getUsers().stream()
                .forEach(System.out::println);
        //System.out.println(userDao.getUsers());
    }


}

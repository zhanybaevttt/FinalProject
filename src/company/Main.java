package company;

import company.dao.MyExceptionClass;
import company.dao.UserDao;
import company.model.User;
import company.service.UserService;
import company.service.impl.Gender;

import javax.swing.text.html.HTMLDocument;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        User user =new User(1,"Tom",24, Gender.MAn);
        User user1 =new User(2,"Azamat",24,Gender.MAn);
        User user2 =new User(3,"Anjelo",22,Gender.WOMAN);

        UserService userService=new UserService();
        userService.UserlerdiKoshu(user);
        userService.UserlerdiKoshu(user1);
        userService.UserlerdiKoshu(user2);


        System.out.println("Айди менен алуу");
        try {
          System.out.println(userService.IDmenenTabuu(1));
      }catch (MyExceptionClass e){
          System.out.println(e.getMessage());
      }
        System.out.println("Айди менен очуру");
          userService.IDmenenOchuruu(2);
          userService.BardykUserlerdiAluu();
    }
}
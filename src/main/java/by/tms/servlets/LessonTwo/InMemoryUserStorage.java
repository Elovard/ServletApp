package by.tms.servlets.LessonTwo;

import java.util.ArrayList;
import java.util.List;

public class InMemoryUserStorage {
    public static List<User> users = new ArrayList<>();
    static int userId = 1;

    public boolean save(User user){
        if (users.contains(user)) {
            return false;
        }
        users.add(user);
        return true;
    }

    public User getByLogin (String login) {
        for (User user: users) {
            if (user.getLogin().equals(login)) {
                return user;
            }
        }
        return null;
    }



//    public User contains (String login) {
//        for (User user: users) {
//            if (user.getLogin().contains(login)) {
//            выбиваем ошибку
//            } else {
//                User user = new User(name, login, password);
//                inMemoryUserStorage.addUser(user);
//                resp.getWriter().println("Thank you for your registration! Enjoy!");
//            }
//
//        }
//    }


}

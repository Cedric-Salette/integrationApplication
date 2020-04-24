import java.util.List;

public class UserManagement {
    List<User> listUser;

    private List<User> getUsers() {
        return listUser;
    }

    private User getUserById(int userId) {
        User user = new User();
        for (int i = 0; i < listUser.size(); i++) {
            int id = listUser.get(i).getId();
            if (id == userId) {
                user = listUser.get(i);
            }
        }
        return user;
    }

    private void newUser(User user) {
        listUser.add(user);
    }

    private void deleteUser(int userId) {
        for (int i = 0; i < listUser.size(); i++) {
            int id = listUser.get(i).getId();
            if (id == userId) {
                listUser.remove(i);
            }
        }
    }
}

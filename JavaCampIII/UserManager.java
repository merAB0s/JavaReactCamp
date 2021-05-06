package JavaCampIII;

public class UserManager {

    public void addUser(User user) {
        System.out.println("Sisteme yeni kullanýcý eklendi: " + user.getEmail() + " " + user.getFirstName() + " "
                + user.getLastName());

    }

    public void deleteUser(User user) {
        System.out.println("Kullanýcý silindi: " + user.getFirstName() + " " + user.getLastName());
    }

    public void updateUser(User user) {
        System.out.println("Kullanýcý Güncellendi: " + user.getFirstName() + " " + user.getLastName());
    }
}

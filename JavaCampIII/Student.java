package JavaCampIII;

public class Student extends User{

    private String imageUrl;

    public Student() {

    }

    public Student(String imageUrl) {
        super();
        this.imageUrl = imageUrl;
    }

    public String getImageUrl() {
        return imageUrl;
    }

    public void setImageUrl(String imageUrl) {
        this.imageUrl = imageUrl;
    }
}

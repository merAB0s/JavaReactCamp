package JavaCampIII;

public class Instructor extends User {
    private String profession;

    public Instructor() {

    }

    public Instructor(String profession) {
        super();
        this.profession = profession;
    }

    public String getProfession() {
        return profession;
    }

    public void setProfession(String profession) {
        this.profession = profession;
    }


}

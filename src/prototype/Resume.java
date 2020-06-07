package src.prototype;

public class Resume implements Cloneable {
    private String name;
    private int level;
    private String profession;
    private AdventureExperience experience;

    public Resume(String name, int level, String profession) {
        this.name = name;
        this.level = level;
        this.profession = profession;
        this.experience = new AdventureExperience();
    }

    public Resume(AdventureExperience experience) throws CloneNotSupportedException {
        this.experience = (AdventureExperience) experience.clone();
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setProfession(String profession) {
        this.profession = profession;
    }

    public void setLevel(int level) {
        this.level = level;
    }

    public void setExperience(String date, String location) {
        this.experience.setDate(date);
        this.experience.setLocation(location);
    }

    @Override
    public Object clone() throws CloneNotSupportedException {
        // return super.clone();

        Resume clone = new Resume(this.experience);
        clone.setName(this.name);
        clone.setLevel(this.level);
        clone.setProfession(this.profession);

        return clone;
    }

    public void display() {
        System.out.printf("Adventure:%s-%s Level:%d\n", this.name, this.profession, this.level);
        System.out.printf("Experience:%s %s\n", this.experience.getDate(), this.experience.getLocation());
        System.out.println();
    }
}

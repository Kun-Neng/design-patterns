package src.prototype;

public class ResumeTest {
    public static void main(String[] args) throws CloneNotSupportedException {
        Resume resume = new Resume("Adventure1", 1, "Adventure");
        resume.setExperience("2020/06/07 11:00", "Taiwan");

        Resume resume_copy1 = (Resume) resume.clone();
        resume_copy1.setLevel(5);
        resume_copy1.setExperience("2020/06/07 11:05", "Dragon Cave");

        Resume resume_copy2 = (Resume) resume_copy1.clone();
        resume_copy2.setProfession("Demon Hunter");
        resume_copy2.setExperience("2020/06/07 11:10", "Dragon Hill");

        resume.display();
        resume_copy1.display();
        resume_copy2.display();
    }
}

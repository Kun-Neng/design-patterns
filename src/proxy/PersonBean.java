package src.proxy;

public class PersonBean implements Person {
    private String name;
    private int likeCount;

    @Override
    public String getName() {
        return this.name;
    }

    @Override
    public void setName(String name) {
        this.name = name;
    }

    @Override
    public int getLikeCount() {
        return this.likeCount;
    }

    @Override
    public void setLikeCount(int likeCount) {
        this.likeCount = likeCount;
    }
}

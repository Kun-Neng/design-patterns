package src.proxy;

public class ProxyPersonBean implements Person {
    PersonBean personBean;

    public ProxyPersonBean(PersonBean personBean) {
        this.personBean = personBean;
    }

    @Override
    public String getName() {
        return this.personBean.getName();
    }

    @Override
    public void setName(String name) {
        this.personBean.setName(name);
    }

    @Override
    public int getLikeCount() {
        return this.personBean.getLikeCount();
    }

    @Override
    public void setLikeCount(int likeCount) {
        System.out.println("Permission Denied: You can't modify likeCount");
    }
}

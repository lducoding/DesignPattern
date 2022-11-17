package abstractFactory.userInfo;

public class MysqlUserInfoDao implements UserInfoDao{

    @Override
    public void insertUserInfo() {
        System.out.println("insert mysql userinfo");
    }

    @Override
    public void updateUserInfo() {
        System.out.println("update mysql userinfo");
    }

    @Override
    public void deleteUserInfo() {
        System.out.println("delete mysql userinfo");
    }
}

package abstractFactory.userInfo;

public class OracleUserInfoDao implements UserInfoDao{

    @Override
    public void insertUserInfo() {
        System.out.println("insert oracle userinfo");
    }

    @Override
    public void updateUserInfo() {
        System.out.println("update oracle userinfo");
    }

    @Override
    public void deleteUserInfo() {
        System.out.println("delete oracle userinfo");
    }
}

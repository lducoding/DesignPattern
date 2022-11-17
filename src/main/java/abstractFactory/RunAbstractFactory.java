package abstractFactory;

import abstractFactory.factory.DaoFactory;
import abstractFactory.factory.MysqlDaoFactory;
import abstractFactory.factory.OracleDaoFactory;
import java.util.Scanner;

public class RunAbstractFactory {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String db = sc.next();

        DaoFactory daoFactory = null;

        if(db.equals("mysql")) {
            daoFactory = new MysqlDaoFactory();
        } else if (db.equals("oracle")) {
            daoFactory = new OracleDaoFactory();
        }

        System.out.println("product info 생성");
        daoFactory.createProductInfoDao().insertProductInfo();
        daoFactory.createProductInfoDao().updateProductInfo();
        daoFactory.createProductInfoDao().deleteProductInfo();
        System.out.println("user info 생성");
        daoFactory.createUserInfoDao().insertUserInfo();
        daoFactory.createUserInfoDao().updateUserInfo();
        daoFactory.createUserInfoDao().deleteUserInfo();
    }

}

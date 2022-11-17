package abstractFactory.factory;

import abstractFactory.productInfo.MysqlProductInfoDao;
import abstractFactory.productInfo.ProductInfoDao;
import abstractFactory.userInfo.MysqlUserInfoDao;
import abstractFactory.userInfo.UserInfoDao;

public class MysqlDaoFactory implements DaoFactory{

    @Override
    public UserInfoDao createUserInfoDao() {
        return new MysqlUserInfoDao();
    }

    @Override
    public ProductInfoDao createProductInfoDao() {
        return new MysqlProductInfoDao();
    }
}

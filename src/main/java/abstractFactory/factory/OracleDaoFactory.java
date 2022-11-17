package abstractFactory.factory;

import abstractFactory.productInfo.MysqlProductInfoDao;
import abstractFactory.productInfo.OracleProductInfoDao;
import abstractFactory.productInfo.ProductInfoDao;
import abstractFactory.userInfo.MysqlUserInfoDao;
import abstractFactory.userInfo.OracleUserInfoDao;
import abstractFactory.userInfo.UserInfoDao;

public class OracleDaoFactory implements DaoFactory{

    @Override
    public UserInfoDao createUserInfoDao() {
        return new OracleUserInfoDao();
    }

    @Override
    public ProductInfoDao createProductInfoDao() {
        return new OracleProductInfoDao();
    }
}

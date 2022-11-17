package abstractFactory.factory;

import abstractFactory.productInfo.ProductInfoDao;
import abstractFactory.userInfo.UserInfoDao;

public interface DaoFactory {

    UserInfoDao createUserInfoDao();
    ProductInfoDao createProductInfoDao();

}

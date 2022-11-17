package abstractFactory.productInfo;

public class MysqlProductInfoDao implements ProductInfoDao{

    @Override
    public void insertProductInfo() {
        System.out.println("insert mysql product info");
    }

    @Override
    public void updateProductInfo() {
        System.out.println("update mysql product info");
    }

    @Override
    public void deleteProductInfo() {
        System.out.println("delete mysql product info");
    }
}

package abstractFactory.productInfo;

public class OracleProductInfoDao implements ProductInfoDao{

    @Override
    public void insertProductInfo() {
        System.out.println("insert oracle product info");
    }

    @Override
    public void updateProductInfo() {
        System.out.println("update oracle product info");
    }

    @Override
    public void deleteProductInfo() {
        System.out.println("delete oracle product info");
    }
}

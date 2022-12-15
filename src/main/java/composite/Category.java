package composite;

import java.util.ArrayList;
import java.util.List;

public class Category extends ProductCategory{

  List<ProductCategory> list;
  public Category(int id, String name, int price) {
    super(id, name, price);
    list = new ArrayList<>();
  }

  @Override
  public void addProduct(ProductCategory product) {
    list.add(product);
  }

  @Override
  public void removeProduct(ProductCategory product) {
    for (ProductCategory pc : list) {
      if(pc.getId() == product.getId()) {
        list.remove(pc);
        return;
      }
    }
    System.out.println("no category");
  }

  @Override
  public int getCount() {
    int count = 0;
    for (ProductCategory pc : list) {
      count += pc.getCount();
    }
    return count;
  }

  @Override
  public String getName() {
    return list.toString();
  }

  @Override
  public int getPrice() {
    int price = 0;
    for (ProductCategory pc : list) {
      price += pc.getPrice();
    }
    return price;
  }

  @Override
  public int getId() {
    return 0;
  }
}

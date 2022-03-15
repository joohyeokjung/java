package product;

import java.util.List;

public interface Service {
	boolean register(Product prod);
	List<Product> getList();
	List<Product> getListT(int pno, String pname, int price);
	Product getDetailPno(int pno);
	boolean modify(Product prod);
	boolean remove(int pno);
	
}

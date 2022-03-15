package product;

import java.util.List;

public interface DateAccessObject {
	int insert(Product prod);
	List<Product> selectList();
	List<Product> selectListT(int pno, String pname, int price);
	Product selectOnePno(int pno);
	int update(Product prod);
	int delete(int pno);
}

package product;

import java.util.List;

public class ProductServiceImple implements Service {

	private DateAccessObject dao;
	
	public ProductServiceImple() {
		dao = new ProductDAOImple();
	}
	
	@Override
	public boolean register(Product prod) {
		return dao.insert(prod) > 0 ? true : false;
	}

	@Override
	public List<Product> getList() {
		return dao.selectList();
	}

	@Override
	public List<Product> getListT(int pno, String pname, int price) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Product getDetailPno(int pno) {
		return dao.selectOnePno(pno);
	}

	@Override
	public boolean modify(Product prod) {
		return dao.update(prod) > 0 ? true : false;
	}

	@Override
	public boolean remove(int pno) {
		return dao.delete(pno) > 0 ? true : false;
	}

	

}

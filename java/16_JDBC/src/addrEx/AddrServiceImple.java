package addrEx;

import java.util.List;

public class AddrServiceImple implements Service {
	
	private DataAccessObject dao;
	
	public AddrServiceImple() {
		dao = new AddrDAOImple();
	}
	
	@Override
	public boolean register(Address addr) {
		return dao.insert(addr) > 0 ? true : false;
	}

	@Override
	public List<Address> getList() {
		return dao.selectList();
	}

	@Override
	public Address getDetailName(String name) {
		return dao.selectOneName(name);
	}

	@Override
	public boolean modify(Address addr) {
		return dao.update(addr) > 0 ? true : false;
	}

	@Override
	public boolean remove(String name) {
		return dao.delete(name) > 0 ? true : false;
	}

	@Override
	public Address getDetailTel(String tel) {
		return dao.selectOneTel(tel);
	}

	@Override
	public List<Address> getListAge(int age) {
		return dao.selectListAge(age);
	}

}

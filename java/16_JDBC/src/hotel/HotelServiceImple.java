package hotel;

import java.util.List;

public class HotelServiceImple implements HotelService {
	private HotelDAO dao;
	
	public HotelServiceImple() {
		dao = new HotelDAOImple();
	}
	@Override
	public List<HotelVO> getList() {
		return dao.selectList();
	}
	
	@Override
	public boolean bool(int roomNum) {
		return dao.selectBool(roomNum);
	}

	@Override
	public int modifyRoomIn(HotelVO hvo) {
		return dao.updateRoomIn(hvo);
	}

	@Override
	public int modifyRoomOut(HotelVO hvo) {
		return dao.updateRoomOut(hvo);
	}

	@Override
	public HotelVO getOneDetail(int roomNum) {
		return dao.selectOne(roomNum);
	}

	@Override
	public List<HotelVO> getName(String name) {
		return dao.selectName(name);
	}

	@Override
	public int register(HotelVO hvo) {
		return dao.insert(hvo);
	}

}

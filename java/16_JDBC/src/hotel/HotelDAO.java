package hotel;

import java.util.List;

public interface HotelDAO {
	List<HotelVO> selectList(); // 객실현황 조회
	boolean selectBool(int roomNum);
	int updateRoomIn(HotelVO hvo); // 입실
	int updateRoomOut(HotelVO hvo); // 퇴실
	HotelVO selectOne(int roomNum); // 객실상세조회
	List<HotelVO> selectName(String name); // 이용객조회
	int insert(HotelVO hvo); // 호텔 건설
}

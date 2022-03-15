package hotel;

import java.util.List;

public interface HotelService {
	List<HotelVO> getList(); // 객실현황 조회
	boolean bool(int roomNum);
	int modifyRoomIn(HotelVO hvo); // 입실
	int modifyRoomOut(HotelVO hvo); // 퇴실
	HotelVO getOneDetail(int roomNum); // 객실상세조회
	List<HotelVO> getName(String name); // 이용객조회
	int register(HotelVO hvo); // 호텔 건설
}

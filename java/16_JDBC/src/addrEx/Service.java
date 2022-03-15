package addrEx;

import java.util.List;

// crud service 정의 > 기본중의 기본
public interface Service {
	boolean register(Address addr); // 입력
	List<Address> getList(); // 전체 조회
	Address getDetailName(String name); // 개별 조회
	Address getDetailTel(String tel); // 개별 조회
	List<Address> getListAge(int age); // 개별(중복) 조회
	boolean modify(Address addr); // 업데이트(수정)
	boolean remove(String name); // 삭제
}

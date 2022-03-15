package addrEx;

import java.util.List;

public interface DataAccessObject { // DAO 라고 함
	int insert(Address addr); // DB 입력 
	List<Address> selectList(); // DB 전체조회
	List<Address> selectListAge(int age); // DB 전체조회
	Address selectOneName(String name); // DB 개별 조회
	Address selectOneTel(String tel); // DB 개별 조회
	int update(Address addr); // DB 수정
	int delete(String name); // DB 삭제
}

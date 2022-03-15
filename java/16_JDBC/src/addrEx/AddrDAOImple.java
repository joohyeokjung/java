package addrEx;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class AddrDAOImple implements DataAccessObject {
	private Connection conn;
	private PreparedStatement pst; // 데이터를 담는 순간부터 어떤 결과가 나오는것까지 명령어. 나의 요청으로 데이터베이스 안에서 일해서 나한테 돌려주는 역할
	private String query = "";
	
	public AddrDAOImple() {
		DataBaseConnect dbc = DataBaseConnect.getInstance(); // dbc 불러오기
		conn = dbc.getConnection();
	}
	
	@Override
	public int insert(Address addr) {
		query = "insert into addr values(?, ?, ?)";
		try {
			pst = conn.prepareStatement(query); // 미완성 쿼리 셋팅
			pst.setString(1, addr.getName()); // 데이터베이스 인덱스값은 1번부터 시작
			pst.setString(2, addr.getTel());
			pst.setInt(3, addr.getAge());
			return pst.executeUpdate(); // 추가한 로우값 반환 1 이상
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			try {
				pst.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		} 
		return 0;
	}

	@Override
	public List<Address> selectList() {
		query = "select * from addr order by age desc";  // 역순 desc 차순 asc
		try {
			pst = conn.prepareStatement(query);
			ResultSet rs = pst.executeQuery();
			List<Address> list = new ArrayList<>();
			while (rs.next()) {
				list.add(new Address(rs.getString("name"), rs.getString("tel"), rs.getInt("age")));
			}
			return list;
		} catch (SQLException e) {
			e.printStackTrace();
		}finally {
			try {
				pst.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		return null;
	}
	
	@Override
	public List<Address> selectListAge(int age) {
		query = "select * from addr where age = ?";
		try {
			pst = conn.prepareStatement(query);
			pst.setInt(1, age);
			ResultSet rs = pst.executeQuery();
			List<Address> list = new ArrayList<>();
			while (rs.next()) {
				list.add(new Address(rs.getString("name"), rs.getString("tel"), rs.getInt("age")));
			}
			return list;
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			try {
				pst.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		return null;
	}
	
	@Override
	public Address selectOneName(String name) {
		query = "select * from addr where name = ?";
		try {
			pst = conn.prepareStatement(query);
			pst.setString(1, name);
			ResultSet rs = pst.executeQuery(); // (ResultSet mysql 테이블 모양으로 돌려준다) 데이터베이스에 있는 데이터를 ResultSet rs 로 담음
			if (rs.next()) {
				return new Address(
							rs.getString("name"),
							rs.getString("tel"),
							rs.getInt("age"));
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return null;
	}

	@Override
	public int update(Address addr) {
		query = "update addr set tel = ?, age = ? where name = ?";
		try {
			pst = conn.prepareStatement(query);
			pst.setString(1, addr.getTel());
			pst.setInt(2, addr.getAge());
			pst.setString(3, addr.getName());
			return pst.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		}finally {
			try {
				pst.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		return 0;
	}

	@Override
	public int delete(String name) {
		query = "delete from addr where name = ?";
		try {
			pst = conn.prepareStatement(query);
			pst.setString(1, name);
			return pst.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		}finally {
			try {
				pst.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		return 0;
	}

	@Override
	public Address selectOneTel(String tel) {
		query = "select * from addr where tel = ?";
		try {
			pst = conn.prepareStatement(query);
			pst.setString(1, tel);
			ResultSet rs = pst.executeQuery(); // (ResultSet mysql 테이블 모양으로 돌려준다) 데이터베이스에 있는 데이터를 ResultSet으로 담음
			if (rs.next()) {
				return new Address(
							rs.getString("name"),
							rs.getString("tel"),
							rs.getInt("age"));
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			try {
				pst.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		return null;
	}
}

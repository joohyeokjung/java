package hotel;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import product_t.MySQLConnect;

public class HotelDAOImple implements HotelDAO {
	private Connection conn;
	private PreparedStatement pst;
	private String query = "";
	
	public HotelDAOImple() {
		MySQLConnect dbc = MySQLConnect.getInstance();
		conn = dbc.getConnection();
	}

	@Override
	public List<HotelVO> selectList() {
		query = "select * from room";
		try {
			pst = conn.prepareStatement(query);
			ResultSet rs = pst.executeQuery();
			List<HotelVO> list = new ArrayList<>();
			
			while (rs.next()) {
				list.add(new HotelVO(rs.getInt("roomnum"), 
									 rs.getString("name"),
									 rs.getInt("age"),
									 rs.getString("gen"),
									 rs.getBoolean("emp"),
									 rs.getString("checkintime")
									 ));
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
	public boolean selectBool(int roomNum) {
		query = "select emp from room where roomnum = ?";
		try {
			pst = conn.prepareStatement(query);
			pst.setInt(1, roomNum);
			ResultSet rs = pst.executeQuery();
			if (rs.next()) {
				return rs.getBoolean("emp");
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
		
		return false;
	}
	
	@Override
	public int updateRoomIn(HotelVO hvo) {
		query = "update room"
				+ " set emp = 'false', name = ?, age = ?, checkintime = now(), gen = ?"
				+ " where roomnum = ?";
		try {
			pst = conn.prepareStatement(query);
			pst.setString(1, hvo.getName());
			pst.setInt(2, hvo.getAge());
			pst.setString(3, hvo.getGen());
			pst.setInt(4, hvo.getRoomNum());
			return pst.executeUpdate();
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
	public int updateRoomOut(HotelVO hvo) {
		query = "update room"
				+ " set emp = 'true', name = 'null', age = 0, checkouttime = now(), gen = 'n'"
				+ " where roomnum = ?";
		try {
			pst = conn.prepareStatement(query);
			pst.setInt(1, hvo.getRoomNum());
			return pst.executeUpdate();
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
	public HotelVO selectOne(int roomNum) {
		query = "select roomnum, name, age, gen, emp, checkintime, checkouttime from room where roomnum = ?";
		try {
			pst = conn.prepareStatement(query);
			pst.setInt(1, roomNum);
			ResultSet rs = pst.executeQuery();
			if (rs.next()) {
				return new HotelVO(rs.getInt("roomnum"),
								   rs.getString("name"),
								   rs.getInt("age"),
								   rs.getString("gen"),
								   rs.getBoolean("emp"),
								   rs.getString("checkintime"),
								   rs.getString("checkouttime")
								   );
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

	@Override
	public List<HotelVO> selectName(String name) {
		query = "select roomnum, name, age, gen, emp, checkintime from room where name = ?";
		try {
			pst = conn.prepareStatement(query);
			pst.setString(1, name);
			ResultSet rs = pst.executeQuery();
			List<HotelVO> list = new ArrayList<>();
			while (rs.next()) {
				list.add(new HotelVO(rs.getInt("roomnum"),
								 rs.getString("name"),
								 rs.getInt("age"),
								 rs.getString("gen"),
								 rs.getBoolean("emp"),
								  rs.getString("checkintime")
								 ));
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
	public int insert(HotelVO hvo) {
		query = "insert into room (roomnum, emp, name, age, gen) values(?, 'true', 'null', 0, 'x')";
		try {
			pst = conn.prepareStatement(query);
			pst.setInt(1, hvo.getRoomNum());
			return pst.executeUpdate();
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
}

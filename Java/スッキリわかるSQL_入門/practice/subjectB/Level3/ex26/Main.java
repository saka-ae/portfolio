package practice.subjectB.Level3.ex26;

import java.sql.Connection;
import java.sql.Date;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class Main {

	public static void main(String[] args) {
		String jdbcUrl	= "jdbc:h2:~/sukkiriSQL";
		String sql		= 	"SELECT 注文日, 注文番号, 注文枝番, 商品コード, 数量"	+
							" FROM 注文"											+
							" WHERE	注文日 >= '2013-03-01'"							+
							" ORDER BY 注文日, 注文番号, 注文枝番";

		try (
				Connection conn = DriverManager.getConnection(jdbcUrl);
				PreparedStatement pstmt = conn.prepareStatement(sql);
				ResultSet rs = pstmt.executeQuery();
		) {
			while (rs.next()) {
				Date date				= rs.getDate("注文日");
				String orderNumber		= rs.getString("注文番号");
				int branchNumber		= rs.getInt("注文枝番");
				String code				= rs.getString("商品コード");
				int num				= rs.getInt("数量");

				System.out.printf("%s %s-%d %s %d\n", date, orderNumber, branchNumber, code, num);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

}

package chap08.リスト8_4;

import java.sql.Connection;
import java.sql.Date;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class Main {

	public static void main(String[] args) {
		String jdbcUrl	= "jdbc:h2:~/sukkiriSQL";

		String sql =	"SELECT	日付, 名前 AS 費目, メモ"	+
						" FROM 家計簿 JOIN 費目 ON 家計簿.費目ID = 費目.ID";

		try (
				Connection conn = DriverManager.getConnection(jdbcUrl);
				PreparedStatement pstmt = conn.prepareStatement(sql);
				ResultSet rs = pstmt.executeQuery();
		) {
			while (rs.next()) {
				Date date		= rs.getDate(1);
				String item		= rs.getString(2);
				String memo		= rs.getString(3);

				System.out.printf("%s %s %s\n", date, item, memo);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

}

package Practice1;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class JdbcCountries {
a
	public static void main(String[] args) {

		String username = "postgres";
		String password = "9030";
		String url = "jdbc:postgresql://localhost:5432/dummy";
		ResultSet rs = null;

		Connection con = null;// the

		try {

			System.out.println("loading driver connecting....");
			// driver name
			Class.forName("org.postgresql.Driver");
			// making connection
			con = DriverManager.getConnection(url, username, password);
			System.out.println("connected...");

			Statement s = con.createStatement();

			rs = s.executeQuery("select * from countries");

			while (rs.next()) {

				// int country_id=rs.getInt(1);
				// System.out.println(" id is"+ country_id);
				String country_name = rs.getString(2);
				System.out.println("Respective country name is " + country_name);
			}

		} catch (Exception e) {
			System.out.println(e);
		}

	}

}

	}

}

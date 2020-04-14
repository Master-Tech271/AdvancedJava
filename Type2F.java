import java.sql.Connection;
import java.sql.Statement;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
public class Type2F {

	private static final String TEMP_SELECT_QUERY = "SELECT * FROM temp";
	public static void main(String[] args) {
		Connection con = null;
		Statement st = null;
		ResultSet rs = null;
		try {
			//register jdbc driver
			Class.forName("com.mysql.jdbc.Driver");
			//connection establish
			con = DriverManager.getConnection("jdbc:mysql://localhost:3306/student?useSSL=false","root","12345678");
			//create statement
			if(con!=null)
				st = con.createStatement();
			//send and process sql query
			if(st!=null)
				rs = st.executeQuery(TEMP_SELECT_QUERY);
			if(rs!=null) {
				while(rs.next())
					System.out.println(rs.getInt(1)+" "+rs.getString(2)+" "+rs.getString(3));
			}
		}//try
		catch(SQLException sqle) {
			sqle.printStackTrace();
		}
//		catch(ClassNotFoundException cnf) {
//			cnf.printStackTrace();
//		}
		catch(Exception e) {
			e.printStackTrace();
		}
		//finally
		finally {
			try {
				if(rs!=null)
					rs.close();
			}
			catch(SQLException rsc) {
				rsc.printStackTrace();
			}
			try {
				if(st!=null)
					st.close();
			}
			catch(SQLException stc) {
				stc.printStackTrace();
			}
			try {
				if(con!=null)
					con.close();
			}
			catch(SQLException conc) {
				conc.printStackTrace();
			}
		}
	}

}

import java.sql.*;
import java.io.*;

public class interrogPostgresql {
	private static final String username = "lo17xxx";
	private static final String password = "dblo17";
	private static final String url = "jdbc:postgresql://tuxa.sme.utc/dblo17";

	// private static final String nom;
	// private static final int nbre;

	public static void main(String args[]) throws SQLException {

		String requete = "";

		// requete="select * from titretexte where mot='micro';";

		BufferedReader br = null;
		try {
			try {
				br = new BufferedReader(new InputStreamReader(System.in));
				System.out.print("saisie : ");
				requete = br.readLine();
				System.out.println("j'ai saisi " + requete);
				askBDD(requete);
			} catch (EOFException e) {
				br.close();
			}
		} catch (IOException e) {
			System.out.println("IO Exception");
		}
	}

	public static void askBDD(String requete) {
		System.out.println("dans askBDD requete: " + requete);
		// INSTALL/load the Driver (Vendor specific Code)
		try {
			Class.forName("org.postgresql.Driver");
		} catch (java.lang.ClassNotFoundException e) {
			System.err.print("ClassNotFoundException: ");
			System.err.println(e.getMessage());
		}

		try {
			Connection con;
			Statement stmt;

			// Establish Connection to the database at URL with usename and
			// password
			con = DriverManager.getConnection(url, username, password);
			stmt = con.createStatement();
			// Send the query and bind to the result set
			ResultSet rs = stmt.executeQuery(requete);
			ResultSetMetaData metadata = rs.getMetaData();
			int columnCount = metadata.getColumnCount();
			System.out.print("\t");
			while (rs.next()) {

				String row = "";
				for (int i = 1; i <= columnCount; i++) {
					row += rs.getString(i);
				}
				System.out.println(row);
				System.out.print("\t");

			}
			// Close resources
			stmt.close();
			con.close();

		}
		// print out decent erreur messages
		catch (SQLException ex) {
			System.err.println("==> SQLException: ");
			while (ex != null) {
				System.out.println("Message:   " + ex.getMessage());
				System.out.println("SQLState:  " + ex.getSQLState());
				System.out.println("ErrorCode: " + ex.getErrorCode());
				ex = ex.getNextException();
				System.out.println("");
			}
		}
	}
}

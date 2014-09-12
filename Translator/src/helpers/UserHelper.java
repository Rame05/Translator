package helpers;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import pojos.User;

public class UserHelper {
	private PreparedStatement authenticateUserStatement;
	public UserHelper(){
		try{
			Class.forName("org.h2.Driver");
			Connection conn = DriverManager.getConnection("jdbc:h2:~/translator", "sa", "");
			authenticateUserStatement = conn.prepareStatement("select * from LOGINS where EMAIL=? and PASS=?");
		} catch (Exception e) {
			System.out.println(e.getClass().getName() + ": " + e.getMessage());
		}
	}
	public User authenticateUser(String email, String pass) {
		User user = null;
		try {
			//Add parameters to the ?'s in the preparedstatement and execute
			authenticateUserStatement.setString(1, email);
			authenticateUserStatement.setString(2, pass);
			ResultSet rs = authenticateUserStatement.executeQuery();
			
			//if we've returned a row, turn that row into a new user object
			if (rs.next()) {
				user = new User(rs.getString("email"), rs.getString("pass"));
			}
		} catch (SQLException e) {
			System.out.println(e.getClass().getName() + ": " + e.getMessage());
		}
		return user;
	}
}


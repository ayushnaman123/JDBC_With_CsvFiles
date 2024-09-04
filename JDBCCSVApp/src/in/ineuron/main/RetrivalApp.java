package in.ineuron.main;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class RetrivalApp {
	private static final String selectCSVQurey = "Select * from data.csv";

	public static void main(String[] args) {
		String url = "jdbc:Text:///D:\\\\images";

		try (Connection connection = DriverManager.getConnection(url)) {
			try (PreparedStatement preparedStatement = connection.prepareStatement(selectCSVQurey)) {
				try (ResultSet resultSet = preparedStatement.executeQuery()) {
					
						while (resultSet.next()) {
							System.out.println(resultSet.getInt(1)+"\t"+resultSet.getString(2)+"\t"
						+resultSet.getString(3));
						}
					
				}

			}

		} catch (SQLException e) {
			e.printStackTrace();
		} catch (Exception e) {

		}
	}

}

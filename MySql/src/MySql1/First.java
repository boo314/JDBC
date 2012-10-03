package MySql1;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.sql.SQLException;

public class First {

	public static void main(String[] args) throws Exception
	{
			// to musi byæ - tyle w temacie
			Class.forName("com.mysql.jdbc.Driver");
			// "jdbc:mysql://nazwa_serwera:port/bazadanych","uzytkownik","haslo"
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/test","root","lol123");
			// "dowolna kwerenda; statement ja przechowuje - > result wykonuje i przechowuje
			PreparedStatement statement = con.prepareStatement("select * from users");
			ResultSet result = statement.executeQuery();
			while(result.next())
			{
				// wylistowanie rezultatu kwerendy "select * from users" (kolumny indeksowane sa od 1)
				System.out.println(result.getString(1) + " " + result.getString(2)  + " " + result.getString(3)  + " " + result.getString(4));
			}
	}

}

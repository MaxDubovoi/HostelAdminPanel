import java.sql.SQLException;

public class HostelConsoleApp {


    public HostelConsoleApp() {

    }

    public static void main(String[] args) throws ClassNotFoundException, SQLException {
        ConnectionToDB conn = new ConnectionToDB();
        conn.Conn();
        conn.CreateDB();
        conn.WriteDB();
        conn.ReadDB();
        conn.CloseDB();
    }
}

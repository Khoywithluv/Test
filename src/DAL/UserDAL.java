package DAL;
import DTO.UserDTO;
import java.sql.*;


public class UserDAL {
    private Connection conn;
    private String url = "jdbc:mysql://localhost:3306/lib";
    private String username = "root";
    private String password = "";

    public UserDAL() {
        try {
            conn = DriverManager.getConnection(url, username, password);
        } catch (SQLException e) {
            System.out.println("Connection failed.");
            e.printStackTrace();
        }
    }
    public UserDAL(Connection conn){
        this.conn = conn;
    }
    
    public boolean authenticate(UserDTO user){
        boolean result = false;
        String sql = "SELECT COUNT(*) as count FROM user WHERE username=? AND password=?";
        try (PreparedStatement stmt = conn.prepareStatement(sql)){
            stmt.setString(1, user.getUsername());
            stmt.setString(2, user.getPass());
            ResultSet rs = stmt.executeQuery();
            if(rs.next()){
                result = rs.getInt("count") > 0;
            }
        }catch(SQLException e){
            e.printStackTrace();
        }
        return result;
    }
    
    public void addUser(UserDTO user){
        String sql = "INSERT INTO users(username,password) VALUES (?,?)";
        try (PreparedStatement stmt = conn.prepareStatement(sql)){
            stmt.setString(1, user.getUsername());
            stmt.setString(2, new String(user.getPass()));
            stmt.executeUpdate();
        }catch(SQLException e){
            e.printStackTrace();
        }
    }
}


package showroom.model;

/**
 * Lớp này đại diện cho một đối tượng Người dùng (User) trong hệ thống.
 */
public class User {

    // --- Các thuộc tính ---
    private int id;
    private String username;
    private String password;
    private String fullName;
    private String role;

    // --- Constructors ---

    /**
     * Constructor mặc định.
     */
    public User() {
    }

    /**
     * Constructor có tham số.
     * @param id Mã người dùng
     * @param username Tên đăng nhập
     * @param password Mật khẩu
     * @param fullName Họ và tên
     * @param role Vai trò
     */
    public User(int id, String username, String password, String fullName, String role) {
        this.id = id;
        this.username = username;
        this.password = password;
        this.fullName = fullName;
        this.role = role;
    }

    // --- Getters and Setters ---

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }

    // --- Phương thức toString() ---
    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", username='" + username + '\'' +
                ", fullName='" + fullName + '\'' +
                ", role='" + role + '\'' +
                '}';
    }
}
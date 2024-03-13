package login;

/**
 * ClassName: Main
 * Package: main
 * Description:自定义异常实现登录
 *
 * @Author 行空XKong
 * @Create 2024/3/13 18:59
 * @Version 1.0
 */
class UserNameException extends Exception {
    public UserNameException(String message) {
        super(message);
    }
}

class PasswordException extends Exception {
    public PasswordException(String message) {
        super(message);
    }
}

public class Main {
    private String userName = "admin";
    private String password = "123456";

    public void loginInfo(String userName, String password) throws
            UserNameException, PasswordException {
        if (!this.userName.equals(userName)) {
            throw new UserNameException("用户名错误！");
        }
        if (!this.password.equals(password)) {
            throw new PasswordException("密码错误！");
        }
        System.out.println("登陆成功！");
    }

    public static void main(String[] args) {
        Main main = new Main();
        try {
            main.loginInfo("admin", "12345");
        } catch (UserNameException e) {
            e.printStackTrace();
        } catch (PasswordException e) {
            e.printStackTrace();
        }
    }
}

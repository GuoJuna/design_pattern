import com.mp.User;

/**
 * @author GuoJun
 * @desc
 * @since 2022/5/27 18:39
 */
public class MediatorPatternDemo {
    public static void main(String[] args) {
        User robert = new User("罗伯特");
        User john = new User("约翰");

        robert.sendMessage("你好! 罗伯特!");
        john.sendMessage("你好! 约翰!");
    }
}

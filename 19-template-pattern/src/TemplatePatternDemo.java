import com.tp.Cricket;
import com.tp.Football;
import com.tp.Game;

/**
 * @author GuoJun
 * @desc
 * @since 2022/5/20 19:12
 */
public class TemplatePatternDemo {
    public static void main(String[] args) {
        Game game = new Cricket();
        game.play();

        System.out.println("=======================");
        game = new Football();
        game.play();
    }
}

import com.sp.Context;
import com.sp.StartState;
import com.sp.StopState;

/**
 * @author GuoJun
 * @desc
 * @since 2022/5/25 20:27
 */
public class StatePatternDemo {
    public static void main(String[] args) {
        Context context = new Context();

        StartState startState = new StartState();
        startState.doAction(context);

        System.out.println(context.getState().toString());

        StopState stopState = new StopState();
        stopState.doAction(context);
        System.out.println(context.getState().toString());
    }
}

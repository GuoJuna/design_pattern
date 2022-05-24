import com.mp.CareTaker;
import com.mp.Originator;

/**
 * @author GuoJun
 * @desc
 * @since 2022/5/24 21:10
 */
public class MementoPatternDemo {
    public static void main(String[] args) {
        Originator originator = new Originator();
        CareTaker careTaker = new CareTaker();

        originator.setState("状态1");
        originator.setState("状态2");

        careTaker.add(originator.saveStateToMemento());
        originator.setState("状态3");
        careTaker.add(originator.saveStateToMemento());
        originator.setState("状态4");

        System.out.println("当前状态: "+originator.getState());
        originator.getStateFromMemento(careTaker.get(0));
        System.out.println("第一个状态: " + originator.getState());
        originator.getStateFromMemento(careTaker.get(1));
        System.out.println("第二个状态: " + originator.getState());
    }
}

import vom.vp.Computer;
import vom.vp.ComputerPartDisplayVisitor;
import vom.vp.iface.ComputerPart;

/**
 * @author GuoJun
 * @desc
 * @since 2022/5/26 18:29
 */
public class VisitorPatternDemo {
    public static void main(String[] args) {
        ComputerPart computer = new Computer();
        computer.accept(new ComputerPartDisplayVisitor());
    }
}

package vom.vp.iface;

import vom.vp.Computer;
import vom.vp.KeyBoard;
import vom.vp.Monitor;
import vom.vp.Mouse;

/**
 * @author GuoJun
 * @desc 电脑部件访问者
 * @since 2022/5/26 18:19
 */
public interface ComputerPartVisitor {
    void visit(Computer computer);
    void visit(KeyBoard keyBoard);
    void visit(Mouse mouse);
    void visit(Monitor monitor);

}

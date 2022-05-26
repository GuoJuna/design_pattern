package vom.vp;

import vom.vp.iface.ComputerPartVisitor;

/**
 * @author GuoJun
 * @desc
 * @since 2022/5/26 18:27
 */
public class ComputerPartDisplayVisitor implements ComputerPartVisitor {

    @Override
    public void visit(Computer computer) {
        System.out.println("显示-电脑");
    }

    @Override
    public void visit(KeyBoard keyBoard) {
        System.out.println("显示-键盘");
    }

    @Override
    public void visit(Mouse mouse) {
        System.out.println("显示-鼠标");
    }

    @Override
    public void visit(Monitor monitor) {
        System.out.println("显示-显示器");
    }
}

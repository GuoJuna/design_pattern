package vom.vp;

import vom.vp.iface.ComputerPart;
import vom.vp.iface.ComputerPartVisitor;

/**
 * @author GuoJun
 * @desc 键盘
 * @since 2022/5/26 18:20
 */
public class KeyBoard implements ComputerPart {
    @Override
    public void accept(ComputerPartVisitor computerPartVisitor) {
        computerPartVisitor.visit(this);
    }
}

package vom.vp;

import vom.vp.iface.ComputerPart;
import vom.vp.iface.ComputerPartVisitor;

/**
 * @author GuoJun
 * @desc 鼠标
 * @since 2022/5/26 18:23
 */
public class Mouse implements ComputerPart {
    @Override
    public void accept(ComputerPartVisitor computerPartVisitor) {
        computerPartVisitor.visit(this);
    }
}

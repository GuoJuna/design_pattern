package vom.vp;

import vom.vp.iface.ComputerPart;
import vom.vp.iface.ComputerPartVisitor;

/**
 * @author GuoJun
 * @desc 显示器
 * @since 2022/5/26 18:22
 */
public class Monitor implements ComputerPart {
    @Override
    public void accept(ComputerPartVisitor computerPartVisitor) {
        computerPartVisitor.visit(this);
    }
}

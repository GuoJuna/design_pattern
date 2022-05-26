package vom.vp;

import vom.vp.iface.ComputerPart;
import vom.vp.iface.ComputerPartVisitor;

/**
 * @author GuoJun
 * @desc 电脑
 * @since 2022/5/26 18:24
 */
public class Computer implements ComputerPart {

    ComputerPart[] parts;

    public Computer() {
        this.parts = new ComputerPart[]{new Monitor(), new KeyBoard(), new Monitor()};
    }

    @Override
    public void accept(ComputerPartVisitor computerPartVisitor) {
        for (ComputerPart part : parts) {
            part.accept(computerPartVisitor);
        }
        computerPartVisitor.visit(this);
    }
}

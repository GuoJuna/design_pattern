package vom.vp.iface;

/**
 * @author GuoJun
 * @desc 电脑部件
 * @since 2022/5/26 18:19
 */
public interface ComputerPart {
    void accept(ComputerPartVisitor computerPartVisitor);
}

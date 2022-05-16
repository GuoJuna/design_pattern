import com.cp.Broker;
import com.cp.BuyStock;
import com.cp.SellStock;
import com.cp.Stock;

/**
 * @author GuoJun
 * @desc
 * @since 2022/5/16 18:44
 */
public class CommandPatternDemo {

    public static void main(String[] args) {
        Stock stock = new Stock();

        BuyStock buyStockOrder = new BuyStock(stock);
        SellStock sellStockOrder = new SellStock(stock);

        Broker broker = new Broker();
        broker.takeOrder(buyStockOrder);
        broker.takeOrder(sellStockOrder);

        broker.placeOrders();
    }
}

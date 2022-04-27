import com.bp.MealBuilder;
import com.bp.Meal;

public class BuilderPatternDemo {

    public static void main(String[] args) {
        MealBuilder builder = new MealBuilder();
        System.out.println("------------鸡肉汉堡套餐------------");
        Meal chickBurger = builder.prepareChickBurger();
        chickBurger.showItems();
        chickBurger.getCost();

        System.out.println("-----------蔬菜汉堡套餐--------------");
        Meal vegMeal = builder.prepareVegMeal();
        vegMeal.showItems();
        vegMeal.getCost();
    }
}

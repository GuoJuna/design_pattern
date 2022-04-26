import com.sp.*;

public class SingletonDemo {

    public static void main(String[] args) {
        System.out.println(_1_LazySingleton.getInstance() == _1_LazySingleton.getInstance());
        System.out.println(_2_HungerSingleton.getInstance() == _2_HungerSingleton.getInstance());
        System.out.println(_3_DclSingleton.getInstance() == _3_DclSingleton.getInstance());
        System.out.println(_4_StaticInnerSingleton.getInstance() == _4_StaticInnerSingleton.getInstance());
        System.out.println(_5_EnumSingleton.INSTANCE == _5_EnumSingleton.INSTANCE);
    }
}

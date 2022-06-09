package SingletonLazy;

public class CommonUsage {
    public static void main(String[] args) {
        CommonStorage commonStorageA = CommonStorage.getInstance();
        CommonStorage commonStorageB = CommonStorage.getInstance();
        System.out.println(commonStorageA == commonStorageB);

        commonStorageA.addValue(7);
        commonStorageB.addValue(9);
        commonStorageB.addValue(8);
        System.out.println(commonStorageA.getValues().size());
        System.out.println(commonStorageB.getValues());



        CommonStorage2 commonStorageC = CommonStorage2.getInstance();
        CommonStorage2 commonStorageD = CommonStorage2.getInstance();
        System.out.println(commonStorageC == commonStorageD);

        commonStorageC.addValue(7);
        commonStorageD.addValue(9);
        commonStorageC.addValue(8);
        System.out.println(commonStorageA.getValues().size());
    }
}

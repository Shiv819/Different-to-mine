package JavaLearning;

public class AT05_CreateAnObjectAndUseIt01 {

    public static void main(String[] args) {
        AT05_CreateAnObjectAndUseIt01 obj = new AT05_CreateAnObjectAndUseIt01();
        obj.test07();
        obj.test08();
}
    public void test07(){
    int i=10;
    int j=20;
    System.out.println("value of k is : "+ (i+j));
    }

    public void test08(){
        String test01="software";
        String test02="testlab";
        System.out.println("value of k is : "+test01+test02);
    }

}

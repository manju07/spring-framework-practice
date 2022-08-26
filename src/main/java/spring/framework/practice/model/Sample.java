package spring.framework.practice.model;

public class Sample {

    private D1 d1;
    private D2 d2;

    static int count = 1;

    public Sample() {
        System.out.println("Sample constructor calling");
    }

    public Sample(D1 d1, D2 d2) {
        this.d1 = d1;
        this.d2 = d2;
        System.out.println("Sample parameterized constructor calling");
    }

    public Sample(String name, double salary) {
        System.out.println("name:" + name + " salary:" + salary + " count:" + count);
        count++;
    }

    public void setD1(D1 d1) {
        this.d1 = d1;
    }

    public void setD2(D2 d2) {
        this.d2 = d2;
    }

    public void test() {
        System.out.println("test method calling");
    }

    public void testOnDepedencies() {
        System.out.println("Sample testOnDepedencies calling");
        d1.testD1();
        d2.testD2();
    }

    public static Sample createInstance() {
        System.out.println("calling createInstance method");
        return new Sample();
    }

    public Sample createInstanceByFactoryMethod() {
        System.out.println("calling createInstanceByFactoryMethod method");
        return new Sample();
    }
}
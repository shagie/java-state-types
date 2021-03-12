package net.shagie.states.three;

public class Example {
    public static void main(String[] args) {
        int sum = new Three()   // 1001
            .start()
            .one()
            .zero()
            .zero()
            .one()
            .build();
        System.out.println(sum);
    }
}

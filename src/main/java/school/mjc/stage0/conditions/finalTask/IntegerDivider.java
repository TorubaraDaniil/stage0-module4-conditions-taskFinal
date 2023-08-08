package school.mjc.stage0.conditions.finalTask;

public class IntegerDivider {
    public void printCompletelyDivided(int dividend, int divider) {
        switch (divider == 0 ? 0 : 1){
            case 1:
                double result = dividend / divider;
                switch (dividend == (int)result * divider ? 0 : 1){
                    case 0:
                        System.out.println("can be divided completely");
                        break;
                    case 1:
                        System.out.println("cannot be divided completely");
                        break;
                }
                break;
            case 0:
                System.out.println("division by zero");
                break;
        }

    }
}

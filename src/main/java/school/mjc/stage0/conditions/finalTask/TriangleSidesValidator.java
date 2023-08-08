package school.mjc.stage0.conditions.finalTask;

public class TriangleSidesValidator {
    public void validate(double firstSide, double secondSide, double thirdSide) {
        switch ((firstSide + secondSide > thirdSide
                ? ((firstSide + thirdSide > secondSide)
                ? ((secondSide + thirdSide > firstSide)
                ? 1 : 0) : 0) : 0)){
            case 0:
                System.out.println("it's not a triangle");
                break;
            case 1:
                System.out.println("this is a valid triangle");
                break;
        }
    }
}

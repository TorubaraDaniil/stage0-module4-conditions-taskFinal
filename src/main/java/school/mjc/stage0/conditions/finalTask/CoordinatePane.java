package school.mjc.stage0.conditions.finalTask;

public class CoordinatePane {
    public void printQuadrant(int x, int y) {
        switch (x == 0 ? (y == 0 ? 0 : 1) : 1){
            case 1:
                switch (x > 0 ? 0 : 1){
                    case 0:
                        switch (y > 0 ? 0 : 1){
                            case 0:
                                System.out.println("first");
                                break;
                            case 1:
                                System.out.println("fourth");
                        }
                        break;
                    case 1:
                        switch (y > 0 ? 0 : 1){
                            case 0:
                                System.out.println("second");
                                break;
                            case 1:
                                System.out.println("third");
                        }
                        break;
                }
                break;
            case 0:
                System.out.println("zero");
                break;
        }
    }
}

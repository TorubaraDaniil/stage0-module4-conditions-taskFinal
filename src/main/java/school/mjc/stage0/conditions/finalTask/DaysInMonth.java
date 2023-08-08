package school.mjc.stage0.conditions.finalTask;

public class DaysInMonth {
    public void printDays(int year, int month) {
        switch (year > 0 ? (month >= 1 && month <= 12 ? 0 : 1) : 1) {
            case 0:
            switch (year % 4) {
                case 0:
                    switch (year % 100) {
                        case 0:
                            switch (year % 400) {
                                case 0:
                                    switch (month) {
                                        case 1:
                                        case 3:
                                        case 5:
                                        case 7:
                                        case 8:
                                        case 10:
                                        case 12:
                                            System.out.println(31);
                                            break;
                                        case 4:
                                        case 6:
                                        case 9:
                                        case 11:
                                            System.out.println(30);
                                            break;
                                        case 2:
                                            System.out.println(29);
                                            break;
                                        default:
                                            switch (month) {
                                                case 1:
                                                case 3:
                                                case 5:
                                                case 7:
                                                case 8:
                                                case 10:
                                                case 12:
                                                    System.out.println(31);
                                                    break;
                                                case 4:
                                                case 6:
                                                case 9:
                                                case 11:
                                                    System.out.println(30);
                                                    break;
                                                case 2:
                                                    System.out.println(28);
                                                    break;

                                            }
                                            break;

                                    }
                                    break;
                                default:
                                    switch (month) {
                                        case 1:
                                        case 3:
                                        case 5:
                                        case 7:
                                        case 8:
                                        case 10:
                                        case 12:
                                            System.out.println(31);
                                            break;
                                        case 4:
                                        case 6:
                                        case 9:
                                        case 11:
                                            System.out.println(30);
                                            break;
                                        case 2:
                                            System.out.println(28);
                                            break;

                                    }
                                    break;
                            }
                            break;
                        default:
                            switch (month) {
                                case 1:
                                case 3:
                                case 5:
                                case 7:
                                case 8:
                                case 10:
                                case 12:
                                    System.out.println(31);
                                    break;
                                case 4:
                                case 6:
                                case 9:
                                case 11:
                                    System.out.println(30);
                                    break;
                                case 2:
                                    System.out.println(29);
                                    break;

                            }
                            break;
                    }
                    break;
                default:
                    switch (month) {
                        case 1:
                        case 3:
                        case 5:
                        case 7:
                        case 8:
                        case 10:
                        case 12:
                            System.out.println(31);
                            break;
                        case 4:
                        case 6:
                        case 9:
                        case 11:
                            System.out.println(30);
                            break;
                        case 2:
                            System.out.println(28);
                            break;

                    }
                    break;
            }
            break;
            case 1:
                System.out.println("invalid date");
        }
    }
}
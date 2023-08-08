package school.mjc.stage0.conditions.finalTask;

public class SeasonDeterminer {
    public void tellTheSeason(int monthNumber) {
        switch ((monthNumber >= 1 && monthNumber < 3 || monthNumber == 12) ? 0
                : ((monthNumber >= 3 && monthNumber < 6) ? 1
                : ((monthNumber >= 6 && monthNumber < 9) ? 2
                : ((monthNumber >= 9 && monthNumber < 12) ? 3 : 4)))){
            case 0:
                System.out.println("Winter");
                break;
            case 1:
                System.out.println("Spring");
                break;
            case 2:
                System.out.println("Summer");
                break;
            case 3:
                System.out.println("Autumn");
                break;
            case 4:
                System.out.println("Wrong month number");

        }
    }
}

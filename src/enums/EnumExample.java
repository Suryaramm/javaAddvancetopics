package enums;

enum Day {
    SUNDAY, MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY
}

public class EnumExample {
    public static void main(String[] args) {
        Day today = Day.WEDNESDAY;

        switch (today) {
            case MONDAY:
                System.out.println("It's the beginning of the week.");
                break;
            case WEDNESDAY:
                System.out.println("It's the middle of the week.");
                break;
            case FRIDAY:
                System.out.println("It's the end of the week.");
                break;
            default:
                System.out.println("It's some other day.");
        }
    }
}


public class DayOfWeek {

    public static void main(String[] args) {

        // Read command-line input
        int month = Integer.parseInt(args[0]);
        int day = Integer.parseInt(args[1]);
        int year = Integer.parseInt(args[2]);

        int adjustedYear = year - (14 - month) / 12;
        int calculationValue = adjustedYear + adjustedYear / 4 - adjustedYear / 100 + adjustedYear / 400;
        int adjustedMonth = month + 12 * ((14 - month) / 12) - 2;
        int dayOfWeek = (day + calculationValue + (31 * adjustedMonth) / 12) % 7;

        // Print day number
        System.out.println(dayOfWeek);
    }
}

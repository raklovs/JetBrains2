class App1 {
    public static String[] getWeekends(String format) {

        String[] daysWeekendsLong = {"saturday", "sunday" };

        String[] daysWeekendsShort = {"sat", "sun" };

        if (format.equals("short")) {

            return daysWeekendsShort;

        } else {

            return daysWeekendsLong;

        }
    }
}

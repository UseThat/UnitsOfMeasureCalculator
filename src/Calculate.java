public class Calculate {
    public static void main(String[] args) {
        MeasureSwitcher mswitcher = new MeasureSwitcher();
        double a = 4.3;

        System.out.println("A = "+a);

        System.out.println(a+" meter to centimeter: "+mswitcher.meterToCentimeter(a));
        System.out.println((a+" meter to millimeter: "+mswitcher.meterToMillimeter(a)));

        System.out.println(mswitcher.meterToCentimeter(a)+" centimeter to meter "+mswitcher.centimeterToMeter(mswitcher.meterToCentimeter(a)));
        System.out.println(mswitcher.meterToMillimeter(a) +" millimeter to meter: "+mswitcher.millimeterToMeter(mswitcher.meterToMillimeter(a)));

        int hours = 14;

        System.out.println(hours+ " hours to millisec " + mswitcher.hourToMinute(mswitcher.minuteToSec(mswitcher.secToMillisec(hours))));
    }
}

package katas;
// 12:03:44PM
public class TimeConverter {
  public static String timeConversion (String s) {
    String period = s.substring(8);
    String [] time = s.substring(0, 8).split(":");

    int hours = Integer.parseInt(time[0]);
    String minutes = time[1];
    String seconds = time[2];

    if(period.equals("PM") && hours !=12) {
      hours += 12;
    }
    else if(period.equals("AM") && hours == 12) {
      hours = 0;
    }
    String formattedHours = String.format("%02d", hours);
    return formattedHours + ":" + minutes + ":" +seconds;
    //return String.format("%2d:%s:%s", hours, minutes, seconds);
  }
}

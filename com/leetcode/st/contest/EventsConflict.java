package com.leetcode.st.contest;

public class EventsConflict {

  public static void main(String[] args) {
//    System.out.println(
//        haveConflict(new String[] { "01:15", "02:00" }, new String[] { "02:00", "03:00" }));
//    System.out.println(
//        haveConflict(new String[] { "01:00","02:00" }, new String[] { "01:20","03:00" }));
//    System.out.println(
//        haveConflict(new String[] { "10:00","11:00" }, new String[] { "14:00","15:00" }));

    System.out.println(
        haveConflict(new String[] { "14:13","22:08" }, new String[] { "02:40","08:08" }));

    // a 75 - b 120
    // x 120 - y 180
    // (x>a && x>b) // false

    // "01:00","02:00" | "01:20","03:00"
    // 60 - 120
    // 80 - 180
    //

    // 600 - 660
    // 840 - 900

    //"14:13","22:08" || "02:40","08:08"
    // a 853, b 1328
    // x 160, y 488
    // x<a && y<a


  }

  // Input: event1 = ["01:15","02:00"], event2 = ["02:00","03:00"]
  // Output: true
  public static boolean haveConflict(String[] event1, String[] event2) {
    String e1Start = event1[0];
    String e1End = event1[1];
    int e1StartMin =
        (Integer.parseInt(e1Start.split(":")[0]) * 60) + Integer.parseInt(e1Start.split(":")[1]);
    int e1EndMin =
        (Integer.parseInt(e1End.split(":")[0]) * 60) + Integer.parseInt(e1End.split(":")[1]);

    String e2Start = event2[0];
    String e2End = event2[1];
    int e2StartMin =
        (Integer.parseInt(e2Start.split(":")[0]) * 60) + Integer.parseInt(e2Start.split(":")[1]);
    int e2EndMin =
        (Integer.parseInt(e2End.split(":")[0]) * 60) + Integer.parseInt(e2End.split(":")[1]);
    return (e2StartMin >= e1StartMin || e2EndMin >= e1StartMin) && (e2StartMin <= e1StartMin
        || e2StartMin <= e1EndMin);
  }

}

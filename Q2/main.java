import java.util.ArrayList;
import java.util.List;

public class Main {
  public static String compareVersion(String version1, String version2) {
    if (version1 == null || "".equals(version1) || version2 == null || "".equals(version2)) {
      return "0";
    }

    String[] v1 = version1.split("\\.");
    String[] v2 = version2.split("\\.");
    if (v1.length != v2.length) {
      return "0";
    }

    for (int i=0; i < v1.length; i++) {
      int num1 = Integer.parseInt(v1[i]);
      int num2 = Integer.parseInt(v2[i]);
      if (num1 < num2) {
        return "-1";
      } else if (num1 > num2) {
        return "1";
      }
    }
    
    return "0";
  }

  public static void main(String[] args) {
    String version1 = "1.01";
    String version2 = "1.001";
    String version3 = "1.0";
    String version4 = "1.0.0";
    String version5 = "0.1";
    String version6 = "1.1";

    System.out.println("Ex1: " + compareVersion(version1, version2));
    System.out.println("Ex2: " + compareVersion(version3, version4));
    System.out.println("Ex3: " + compareVersion(version5, version6));
  }
}

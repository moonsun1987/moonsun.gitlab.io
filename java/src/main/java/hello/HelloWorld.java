package hello;

import org.joda.time.LocalTime;

public class HelloWorld {
  public static void main(String[] args) {
    LocalTime currentTime = new LocalTime();
    System.out.println("The current local time is: " + currentTime);
    Greeter greeter = new Greeter();
    System.out.println(greeter.sayHello());
    TwoSum twoSum = new TwoSum();
    int[] result = twoSum.twoSum({2,7,11,15}, 9);
    System.out.println(result[0]);
    System.out.println(result[1]);
  }
}
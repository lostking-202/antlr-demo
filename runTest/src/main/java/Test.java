import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Test {
  public static void main(String[] args) {
    regTest6();
  }
  public static void regTest1(){
    String op="a";
    String regex = "^\\w+$";
    Pattern pattern = Pattern.compile(regex);
    Matcher matcher=pattern.matcher(op);
    System.out.println(matcher.find());
  }
  public static void regTest2(){
    String op="origina";
    String regex = "origin(\\w+)";
    Pattern pattern = Pattern.compile(regex);
    Matcher matcher=pattern.matcher(op);
    if(matcher.find()){
      System.out.println(matcher.group(0));
      System.out.println(matcher.group(1));
    }
  }
  public static void regTest3(){
    String op="origin(a)";
    String regex = "origin\\((\\D+)\\)";
    Pattern pattern = Pattern.compile(regex);
    Matcher matcher=pattern.matcher(op);
    if(matcher.find()){
      System.out.println(matcher.group(0));
      System.out.println(matcher.group(1));
    }
  }
  public static void regTest4(){
    String op="batch100117_flatten_request";
    String regex = "\\w+";
    Pattern pattern = Pattern.compile(regex);
    Matcher matcher=pattern.matcher(op);
    if(matcher.find()){
      System.out.println(matcher.group(0));
      System.out.println(matcher.group(1));
    }
  }
  public static void regTest5(){
    String op="origin(batch100117_flatten_request)";
    String regex = "origin\\((\\w+)\\)";
    Pattern pattern = Pattern.compile(regex);
    Matcher matcher=pattern.matcher(op);
    if(matcher.find()){
      System.out.println(matcher.group(0));
      System.out.println(matcher.group(1));
    }
  }
  public static void regTest6(){
    String op="origin(batch100117_flatten_request.bank)";
    String regex = "origin\\(((\\w+).(\\w+))\\)";
    Pattern pattern = Pattern.compile(regex);
    Matcher matcher=pattern.matcher(op);
    if(matcher.find()){
      System.out.println(matcher.group(0));
      System.out.println(matcher.group(1));
      System.out.println(matcher.group(2));
      System.out.println(matcher.group(3));
    }
  }
}

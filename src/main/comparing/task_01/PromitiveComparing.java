package main.comparing.task_01;

public class PromitiveComparing {

  public static void main(String[] args) {
    int x = 5;
    int y = 10;
    int z = 5;

    boolean result = x == y;
    System.out.println("Результат сравнени  x and y " + result);
    result = x == z;
    System.out.println("Результат сравнени  x and z " + result);

    Integer integer = 5;
    result = x == integer;
    System.out.println(result);
  }

}

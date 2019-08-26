import java.util.Scanner;

public class Main {

  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    System.out.print("Введите необходимое для отправки количество ящиков: ");
    int boxAmount = scan.nextInt();
    int truckAmount = 1;
    int containerAmount = 1;

    System.out.println("Грузовик: " + truckAmount);
    System.out.println(" Контейнер: " + containerAmount);

    for (int i = 1; i <= boxAmount; i++) {
      System.out.println("   Ящик " + i);

      if (i % 324 == 0) {
        truckAmount++;
        System.out.println("Грузовик: " + truckAmount);
      }

      if (i % 27 == 0) {
        containerAmount++;
        System.out.println(" Контейнер: " + containerAmount);
      }
    }

    System.out.println("Для доставки всех ящиков необходимо: ");
    System.out.println(" Грузовиков: " + truckAmount);
    System.out.println(" Контейнеров: " + containerAmount);

  }
}

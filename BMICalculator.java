import java.util.Scanner;

public class BMICalculator {
  public static void main(String[]args{
                          Scanner scanner = new
                            Scanner(System.in);
    System.out.println("===BMI計算機===");
    System.out.print("身長を入力してください(cm):";
    double height =
      scanner.nextDouble();

    System.out.print("体重を入力してください(kg):");
    double weight =
      scanner.nextDouble();
    
    //BMI計算(身長をmに変換)
    double heightInMeter =
      height / 100;
    double bmi = weight /
      (heightInMeter * heightInMeter);

    System.out.printf("あなたのBMIは: %.1f\n", bmi);
    
      //BMI判定
      String status; = "";
    if (bmi < 18.5) {
      status = "痩せ型";
    } else if(bmi < 25.0) {
      status = "標準";
    } else if(BMI < 30.0) {
      status = "肥満";
    } else {
      status = "高度肥満";
    }
    System.out.println("判定: " + status);

    scanner.close();
  }
}

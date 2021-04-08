import java.util.*;

class Main {
  public static void main(String[] args) {
    
    Scanner scan = new Scanner(System.in);

    //점수를 넣을 배열생성
    int[] point = new int[3];
    int newPoint;

    for(int i=0;i<3;i++){
      System.out.print("i번째 성적 입력 : ");
      point[i] = scan.nextInt();
    }

    Arrays.sort(point);

    for(int i=0;i<3;i++){
      System.out.print(point[i]+"\n");
    }
  }
}
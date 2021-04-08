import java.util.*;

class Main {
  public static void main(String[] args) {
    
    Scanner scan = new Scanner(System.in);

    //점수를 넣을 배열생성
    int num;

    System.out.print("몇개의 성적을 입력합니까?");
    num = scan.nextInt();

    //배열 선언
    int[] point = new int[num];
    int newPoint;

    for(int i=0;i<num;i++){
      System.out.print((i+1)+"번째 성적 입력 : ");
      point[i] = scan.nextInt();
    }

    Arrays.sort(point);

    for(int i=0;i<num;i++){
      System.out.print(point[i]+"\n");
    }
  }
}
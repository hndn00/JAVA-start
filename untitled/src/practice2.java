import java.util.Scanner;//scanner클래스 입력위해 import
public class practice2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);//입력받는 도구생성

        System.out.print("이름을 입력하세요: ");
        String name = scanner.nextLine(); //한줄 문자열 입력받기

        System.out.println("안녕하세요, " + name);//출력
    }

}

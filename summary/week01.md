# WEEK01

### JAVA클래스의 기본 툴

<code>

    public class Main {
        public static void main(String[] args) {
            System.out.println("Hello World!");
        }
    }
</code>




- class: 자바의 기본단위. 모든 코드는 class 내부에 있어야함.
- public: 접근 제어자, 다른 클래스에서도 접근 가능하게함.
- static: 객체 생성 없이 실행 가능하게 함(main 메서드에서 필수)
- void: 반환값 없음
- main: 자바 프로그램의 시작점
- String[]args: 명령줄 인자
- System.out.println(...): 콘솔 출력 명령

### 자바 프로그램 실행
1. main 메서드부터 실행시작
2. 클래스는 .java파일 저장
3. 컴파일: javac Main.java
4. 실행: java Main.java

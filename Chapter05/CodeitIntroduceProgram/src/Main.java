import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        boolean bool = true;
        boolean bool2 = true;

        while (bool) {
           Scanner scanner = new Scanner(System.in);

           System.out.println("(I)ntro (C)ourse (E)xit");

           String type = scanner.next();

           switch (type) {
               case "i" :
               case "I" :
                   System.out.println("I");
                   System.out.println("안녕하세요! 우리는 코드잇입니다.");
                   System.out.println("함께 공부합시다!");

                   break;

               case "c":
               case "C":
                   System.out.println("C");
                   while (bool2) {
                       System.out.println("코드잇 수업을 소개합니다.");
                       System.out.println("(P)ython (J)ava (i)OS (B)ack");
                       String type2 = scanner.next();


                       switch (type2) {
                           case "p":
                           case "P":
                               System.out.println("Python 언어를 통해 컴퓨터 사이언스의 기초를 배웁니다.");
                               System.out.println("강영훈");
                               System.out.println("추천 선수 과목 : 없음");
                               break;

                           case "j":
                           case "J":
                               System.out.println("김신의");
                               System.out.println("추천 선수 과목 : Python");
                               break;

                           case "i":
                           case "I":
                               System.out.println("최신 Swift 언어를 통해 iOS 개발을 시작할 수 있습니다.");
                               System.out.println("성태호");
                               System.out.println("Python, Java");
                               break;

                           case "b":
                           case "B":
                               bool2 = false;
                               bool = true;
                               break;
                       }
                   }

               break;

               case "e":
               case "E":
                   System.out.println("E");
                   System.out.println("안녕히 가세요.");
                   bool = false;
                   break;
           }


        }



    }


}



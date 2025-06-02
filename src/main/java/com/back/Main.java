package com.back;

import java.util.Scanner;

// Shift을(를) 두 번 눌러 전체 검색 대화상자를 열고 'show whitespaces'를 입력한 다음,
// Enter를 누르세요. 그러면 코드 내에서 공백 문자를 확인할 수 있습니다.
public class Main {
    public static void main(String[] args){
        lab1();
    }

    private static void lab1() {
        String input = """
                등록
                나의 죽음을 적들에게 알리지 말라.
                """;

        Scanner scanner = new Scanner(input);
        System.out.println(scanner.nextLine());
        System.out.println(scanner.nextLine());
    }
}
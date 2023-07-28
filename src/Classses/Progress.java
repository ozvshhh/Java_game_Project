package Classses;
import java.util.Scanner;

public class Progress {

    int champ = 0;
    void printHowToPlay(){
        String[] scripts = {
                "이자만 게임에 오신 것을 환영합니다",
                "이 게임은 원하는 챔피언을 골라 적과 턴제 전투를 벌이는 게임입니다.",
                "적을 섬멸하고 살아남으세요",
        };
    }

    void selectChamp(){
        String[] scripts = {
                "원하는 챔피언을 골라주세요",
                "1.트페",
                "3장의 카드를 뽑아 싸웁니다.",
                "2.갱플랭크",
                "적에게 총을 쏩니다",
                "3.샤코",
                "박스를 설치해 적을 우롱합니다"
        };

        Scanner sc = new Scanner(System.in);
        System.out.print("원하는 챔프를 숫자입력을 통해 선택하세요:");
        champ = sc.nextInt();
        this.champ = champ;

    }
}

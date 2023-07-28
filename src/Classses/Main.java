package Classses;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main{
    public static void main(String[] args){

        Progress progress1 = new Progress();
        //게임 안내문 출력받기
        progress1.printHowToPlay();

        //챔피언 설명 및 선택창 띄우기
        //챔피언 입력받기
        progress1.selectChamp();

        //입력받은 챔피언에 맞게 인스턴스 생성하기
        if (progress1.champ == 1){ //트페
            Unit.Player.Tpe.Card tpe1 = new Unit().new Player().new Tpe().new Card();
            tpe1.drawCards();
            for(int i=0; i!=tpe1.cards.length; i++){
                System.out.println(tpe1.cards[i]);
            }
        } else if (progress1.champ == 2){ //갱플

        } else if (progress1.champ == 3){ //샤코

        }



    }
}
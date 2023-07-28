package Classses;

public class Unit {
    int hp;
    int dmg;

    void setStat(int hp, int dmg) {
        this.hp = hp;
        this.dmg = dmg;
    }

    void giveDmg(String trg, int dmg) {
    }

    public class Enemy extends Unit {
        int level;

        void setRandomDmg(int level) {
        }

    }

    public class Player extends Unit {
        public class Tpe extends Player {
            public class Card extends Game {
                //없음 0,노랑 1, 빨강2, 파랑3
                int[] cards = new int[3];

                int randInt123() {
                    double dValue = Math.random();
                    int iValue = (int)(dValue * 10);
                    return iValue%3 + 1; }

                void drawCards() {
                    System.out.println("카드를 드로우 합니다.");
                    for(int i=0; i!=3; i++){
                        int card = randInt123();
                        this.cards[i] = card;}
                    for(int i=0; i!=3; i++){
                        if(this.cards[i] == 1) {
                            System.out.println("노랑");
                        } else if (this.cards[i] == 2) {
                            System.out.println("파랑");
                        } else if (this.cards[i] == 3) {
                            System.out.println("빨강");
                        } else{
                            System.out.println("error: card draw error");
                        }
                    }

                }


            }
        }

        public class GP extends Player {
            public class Gun extends Game {
            }
        }

        public class Shaco extends Player {
            public class Box extends Game {
            }
        }
    }

}

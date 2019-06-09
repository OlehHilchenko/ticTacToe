import java.util.*;
public class ticTacToe {
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        char[]a={'1', '2', '3'};
        char[]b={'4', '5', '6'};
        char[]c={'7', '8', '9'};
        int p1=1;
        char y1='x';
        for(int i=0; i<p1; i++){
        System.out.println("choice x or o");
        String y = s.next();
        y1 = y.charAt(0);
        if (y1=='x'||y1=='o'){
         switch (y1){
             case 'x':
                 System.out.println("firs player is x, second player is o");
                 break;
             case 'o':
                 System.out.println("firs player is o, second player is x");
                 break;
                 default: System.out.println("you must choice x or o !!!");
                 break; }}
       else{System.out.println("you must choice x or o !!!"); p1+=1;} }
        int count=1;
         int nin=9;
        if (y1=='x'){count=1;}
        if (y1=='o'){count=2;}
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
         for (int i=0; i<nin; i++) {
             if (1==count%2) {System.out.println("x player:");}
             else{System.out.println("o player:");}
             String v = s.next();
             char v1 = v.charAt(0);
             if (v1=='1'||v1=='2'||v1=='4'||v1=='3'||v1=='5'||v1=='6'||v1=='7'||v1=='8'||v1=='9'){
             switch (v1) {
                 case '1':
                     if (a[0]=='1'){
                     if (1==count%2) {a[0] = 'x';count++; }
                     else{a[0] = 'o';count++;}}
                     else {System.out.println("select empty field");nin+=1;}
                     break;
                 case '2':
                     if(a[1]=='2'){
                     if (1==count%2) {a[1] = 'x';count++; }
                     else{a[1] = 'o';count++;}}
                     else {System.out.println("select empty field");nin+=1;}
                     break;
                 case '3':
                     if(a[2]=='3'){
                     if (1==count%2) {a[2] = 'x';count++; }
                     else{a[2] = 'o';count++;}}
                     else {System.out.println("select empty field");nin+=1;}
                     break;
                 case '4':
                     if (b[0]=='4'){
                     if (1==count%2) {b[0] = 'x'; count++;}
                     else{b[0] = 'o';count++;}}
                     else {System.out.println("select empty field");nin+=1;}
                     break;
                 case '5':
                     if(b[1]=='5'){
                     if (1==count%2) {b[1] = 'x';count++; }
                     else{b[1] = 'o';count++;}}
                     else {System.out.println("select empty field");nin+=1;}
                     break;
                 case '6':
                     if (b[2]=='6'){
                     if (1==count%2) {b[2] = 'x';count++; }
                     else{b[2] = 'o';count++;}}
                     else {System.out.println("select empty field");nin+=1;}
                     break;
                 case '7':
                     if (c[0]=='7'){
                     if (1==count%2) {c[0] = 'x';count++; }
                     else{c[0] = 'o';count++;}}
                     else {System.out.println("select empty field");nin+=1;}
                     break;
                 case '8':
                     if (c[1]=='8'){
                     if (1==count%2) {c[1] = 'x';count++; }
                     else{c[1] = 'o';count++;}}
                     else {System.out.println("select empty field");nin+=1;}
                     break;
                 case '9':
                     if(c[2]=='9'){
                     if (1==count%2) {c[2] = 'x';count++; }
                     else{c[2] = 'o';count++;}}
                     else {System.out.println("select empty field");nin+=1;}
                     break;
                 default:
                     System.out.println("error"); nin+=1;
                     break;}}
             else {System.out.println("Choice number 1 - 9");nin+=1;}
                     if ('x'==a[0] && 'x'==a[1] && 'x'==a[2]){
                         if(1==count%2){i=9;
                             System.out.println("player 1 win");}
                         if(0==count%2){i=9;
                             System.out.println("player 2 win");}
                     }
                     else if ('x'==b[0] && 'x'==b[1] && 'x'==b[2]){
                         if(1==count%2){i=9;
                             System.out.println("player 1 win");}
                         if(0==count%2){i=9;
                             System.out.println("player 2 win");}
                     }
                     else if ('x'==c[0] && 'x'==c[1] && 'x'==c[2]){
                         if(1==count%2){i=9;
                             System.out.println("player 1 win");}
                         if(0==count%2){i=9;
                             System.out.println("player 2 win");}
                     }
                     else if ('x'==a[0] && 'x'==b[0] && 'x'==c[0]){
                         if(1==count%2){i=9;
                             System.out.println("player 1 win");}
                         if(0==count%2){i=9;
                             System.out.println("player 2 win");}
                     }
                     else if ('x'==a[1] && 'x'==b[1] && 'x'==c[1]) {
                         if (1 == count % 2) {i=9;
                             System.out.println("player 1 win");
                         }
                         if (0 == count % 2) {i=9;
                             System.out.println("player 2 win");
                         }
                     }
                     else if ('x'==a[2] && 'x'==b[2] && 'x'==c[2]) {
                         if (1 == count % 2) {i=9;
                             System.out.println("player 1 win");
                         }
                         if (0 == count % 2) {i=9;
                             System.out.println("player 2 win");
                         }
                     }
                     else if ('x'==a[0] && 'x'==b[1] && 'x'==c[2]) {
                         if (1 == count % 2) {i=9;
                             System.out.println("player 1 win");
                         }
                         if (0 == count % 2) {i=9;
                             System.out.println("player 2 win");
                         }
                     }
                     else if ('x'==a[2] && 'x'==b[1] && 'x'==c[0]) {
                         if (1 == count % 2) {i=9;
                             System.out.println("player 1 win");
                         }
                         if (0 == count % 2) {i=9;
                             System.out.println("player 2 win");
                         }
                     }
                     //by o
                     if ('o'==a[0] && 'o'==a[1] && 'o'==a[2]){
                        if(1==count%2){i=9;
                        System.out.println("player 1 win");}
                        if(0==count%2){i=9;
                        System.out.println("player 2 win");}
                     }
                     else if ('o'==b[0] && 'o'==b[1] && 'o'==b[2]){
                        if(1==count%2){i=9;
                        System.out.println("player 1 win");}
                        if(0==count%2){i=9;
                        System.out.println("player 2 win");}
                     }
                     else if ('o'==c[0] && 'o'==c[1] && 'o'==c[2]){
                        if(1==count%2){i=9;
                        System.out.println("player 1 win");}
                        if(0==count%2){i=9;
                        System.out.println("player 2 win");}
                     }
                     else if ('o'==a[0] && 'o'==b[0] && 'o'==c[0]){
                        if(1==count%2){i=9;
                        System.out.println("player 1 win");}
                        if(0==count%2){i=9;
                        System.out.println("player 2 win");}
                     }
                     else if ('o'==a[1] && 'o'==b[1] && 'o'==c[1]) {
                        if (1 == count % 2) {i=9;
                        System.out.println("player 1 win");
                        }
                        if (0 == count % 2) {i=9;
                        System.out.println("player 2 win");
                        }
                     }
                     else if ('o'==a[2] && 'o'==b[2] && 'o'==c[2]) {
                        if (1 == count % 2) {i=9;
                        System.out.println("player 1 win");
                        }
                        if (0 == count % 2) {i=9;
                        System.out.println("player 2 win");
                        }
                     }
                     else if ('o'==a[0] && 'o'==b[1] && 'o'==c[2]) {
                        if (1 == count % 2) {i=9;
                        System.out.println("player 1 win");
                        }
                        if (0 == count % 2) {i=9;
                        System.out.println("player 2 win");
                        }
                     }
                     else if ('o'==a[2] && 'o'==b[1] && 'o'==c[0]) {
                        if (1 == count % 2) {i=9;
                        System.out.println("player 1 win");
                        }
                        if (0 == count % 2) {i=9;
                        System.out.println("player 2 win");
                        }
                     }

                     System.out.println(a);
                     System.out.println(b);
                     System.out.println(c);


         }
    }
}

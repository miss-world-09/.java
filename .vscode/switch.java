package .vscode;
import java.util.Scanner;

public class switch {
    public static void main(String[] args){
        Scanner in=new Scanner(System.in);
        String fruit=in.next();
        switch(fruit){
            case "mango":
            System.out.println("king of fruit");
            break;
            case "apple":
            System.out.println("apple is red in color");
            break;
            case "grapes":
            System.out.println("green in color");
            break;
            case "orange":
            System.out.println("good for skin");
            break;
            default:
            System.out.println("not valid");
        }
    }
}
/*
 ANOTHER SYNTAX OF SWITCH STATEMENT IS :-
 case "mango"->System.out.println("king of fruit");
case "apple"->System.out.println("apple is red in color");
 */
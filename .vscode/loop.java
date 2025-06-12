/*conditional loops:
1. If-else statement:
*/
import java.util.Scanner;
import java.util.scanner;
public class loop {

    public static void main(String[] args) {
        int salary=1000;
        if(salary>1000){
            System.out.println("greater salary");
        } else{
            System.out.println("better luck next time.");
        }
    }
}

/*
 2. Multiple if else loop:

 */
if(salary<=1000){
    salary+=2000;
} 
else if(salary<=2000){
    salary+=1000;
}
else{
    salary+=200;
} 
System.out.println(salary);

/*
 LOOPS:- used to iterarate the program several times.
 1. for loops
 */
for(int num=1;num<=5;num+=1){
    System.out.println(num);
}

// 2. while loop1:
int num=1;
while(num<=6){
    System.out.println(num);
    num+=1;
}

// 3. do while loop
int n=1;
do{
    System.out.println(n);
    n++;
} while(n<=5);

// WAP TO PRINT LARGEST OF THREE NUMBERS
 Scanner in=new Scanner (System.in);
 int a=in.nextInt();
 int b=in.nextInt();
 int c=in.nextInt();
 if(a>b && a>c){
    System.out.println(a is the greatest number);
 } else if(b>a && b>c){
    System.out.println("greatest number is b");
 } else{
    System.out.println("greatst number is c");
 }

//  ALPHABET CASE CHECK:- TAKE THE INPUT CHARACTER FROM KEYBOARD AND CHECK WEATHER IT IS UPPER OR LOWER CASE ALPHABET.

Scanner in=new Scanner(System.in);
char ch= in.next().trim().charAt(0);
if(ch>'a' && ch<='z'){
    System.out.println("lowercase");
} else{
    System.out.println("uppercase");
}

// FIBONACCI NUMBERS:- SERIES OF NUMBERS IN WHICH EACH NUMBER IS SUM OF TWO PRECEDING NUMBERS.
Scanner in=new Scanner(System.in);
int n=in.nextInt();
int a=in.nextInt();
int b=in.nextInt();
int count=2;
while(count<=2){
    int temp=b;
    b=b+a;
    a=temp;
    count++;
} 
System.out.println(b);

// COUNTING OCCURENCE:- INPUT TWO NUMBER, FIND OUT HOW MANY TIMES SECOND NUMBER DIGIT IS PRESENT IN FIRST NUMBER. EX: FIRST NUMBER:14458, SECOND NUMBER=4 OUTPUT=2.
int count=0;
int Fn=in.nextInt();
int Sn=in.nextInt();
while(Fn>0){
    int rem=Fn%10;
    if(rem==Sn){
        count++;
    }
    Fn=Fn/10;
}
System.out.println(count);

// REVERSE A NUMBER:- INPUT:12345,  OUTPUT:54321
int num=in.nextInt();
int ans=0;
while(num>0){
    int rem=num%10;
    num/=10;
    ans=ans*10+rem;
}
System.out.println(ans);


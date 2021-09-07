import java.util.Scanner;
class Q6{
public static void main(String[] args){
Scanner sc=new Scanner(System.in);
System.out.println();
System.out.print("-->Enter the Table Number : ");
int num=sc.nextInt();
int sum=0;
System.out.println();
for(int i=1;i<=10;i++){
System.out.println(" "+ num+" x "+i+" = "+(num*i));
}

}
}
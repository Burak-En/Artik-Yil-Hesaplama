import java.util.Scanner;

public class main {
    public static void main(String[] args){
        int yil;
        Scanner kul=new Scanner(System.in);
        System.out.print("Yıl Giriniz: ");
        yil=kul.nextInt();


        if((yil %4 == 0) && (yil %100 !=0)){
            System.out.print(yil +" "+ "Artık Yıldır!");
        }else if  (yil%400==0){
            System.out.print(yil +" "+ "Artık Yıldır!");
        }else{
            System.out.print(yil  +" "+ "Artık Yıl Değildir!");
        }
    }
}

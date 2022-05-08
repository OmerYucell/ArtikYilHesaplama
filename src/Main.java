import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        int yil,artik;
        Scanner inp = new Scanner(System.in);

        System.out.print("Yil Giriniz :");
        yil = inp.nextInt();
        artik = yil%4;

        if (artik == 0){
            if(yil % 100 != 0){
                System.out.println(yil + " Artik Yildir");
            }
            else if((yil % 100 == 0) && (yil % 400 == 0)){
                System.out.println(yil + " Artik Yildir");
            }else{
                System.out.println(yil + " Artik Yil Degildir.");
            }
        }
        else{
            System.out.println(yil + " Artik Yil Degildir.");
        }

    }
}

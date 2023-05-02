import java.util.Scanner;


public class YariCapHesaplama {
    public static void main(String[] args) {
        int a, r;
        double  pi = 3.14;

        Scanner inp = new Scanner(System.in);


        System.out.print("dairenin yarıçapını girin : ");
        r  = inp.nextInt();

        System.out.print("açıyı girin : ");
        a = inp.nextInt();


        double alan = pi * r * r;
        double cevre = 2 * pi * r;
        double dilim = (pi * (r * r) * a ) / 360;

        System.out.println("alan : "+ alan);
        System.out.println("çevre : "+ cevre);
        System.out.println("daire dilimi : "+ dilim );

    }

}

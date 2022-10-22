import java.util.Scanner;

class inputScanner {
    public static <string> void main(String[] args){
        Scanner in = new Scanner(System.in);

        System.out.println("Nama : Riko");
        System.out.println("Umur : 28");
        System.out.println("jenis kelamin : laki-laki");


        System.out.println("Nama : Anton");
        System.out.println("Umur : 30");
        System.out.println("jenis kelamin : laki-laki");


        String nama = in.nextLine();
        String umur = in.nextLine();
        String jeniskelamin = in.nextLine();

    }
}
import java.util.Scanner;

public class tugas6 {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.print("Masukan nilai : ");
    int nilai = scanner.nextInt();
    String hasil;
    if (nilai < 60 ){
        hasil = "belum lulus";
    }else{
        hasil = "lulus ";  
    }
    System.out.println("nilai yang anda masukan adalah " + nilai + " jadi anda " + hasil);
  }
}
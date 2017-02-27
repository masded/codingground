public class tugas4{
    
    public static void main(String []args){
        int parameter = 2;
        int hasil = penjumlahan(parameter);
        System.out.println("angka penjumlahan " + parameter + " + 1 = " + hasil);
    }
    
    public static int penjumlahan(int a1) {
        int angka = a1;
        
        return angka + 1;
    }
}
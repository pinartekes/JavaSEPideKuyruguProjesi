
import java.util.LinkedList;
import java.util.Queue;
import java.util.Random;


public class Main {
    
    public static void main(String[] args) throws InterruptedException{
        
        System.out.println("\t Tekes Firin");
        
        Random random = new Random();
        Queue<String> pide_kuyrugu = new LinkedList<String>();
        
        pide_kuyrugu.offer("Pinar");
        pide_kuyrugu.offer("Berat");
        pide_kuyrugu.offer("Zeynep");
        pide_kuyrugu.offer("Faize");
        pide_kuyrugu.offer("İsmail");
        pide_kuyrugu.offer("Ali");
        pide_kuyrugu.offer("Haydar");
        pide_kuyrugu.offer("Zeynep");
        pide_kuyrugu.offer("Hatice");
        
        int pide_sayisi = 1 + random.nextInt(10);
        System.out.println("  Pideler cikiyor....");
        Thread.sleep(2000);
        System.out.println("  Cikan pide sayisi: " + pide_sayisi);
        
        while(pide_sayisi !=0){
            System.out.println(pide_kuyrugu.poll() + " pideyi aldi");
            pide_sayisi--;
            Thread.sleep(1000);
        }
        
        System.out.println("Pide kalmadi...");
        
    }
}

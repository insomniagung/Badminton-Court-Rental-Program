/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BadmintonCourtRentalSystem;
import java.io.File;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.util.GregorianCalendar;
import java.util.Calendar;
import java.util.Scanner;
/**
 *
 * @author Agung Gunawan
 */
public class main_transaksi extends pegawai{
    public static void main(String[] args){
      String ulang = "Y";        
      while(ulang.equals("Y")){
        cls();
        //TAMPILAN INPUT
        System.out.flush(); //pointer ada di paling atas
        System.out.print("\n======== SISTEM INFORMASI SEWA LAPANGAN BADMINTON AHSAN-HENDRA ========");
        System.out.print("\n============= SEWA MULAI JAM 08.00 S/D 17.00 ==============");
        
        //Inheritance
        pegawai pg = new pegawai("Agung Gunawan","PG-2019230012");
        System.out.println(pg);

        pelanggan pl = new pelanggan();
        System.out.print("\nNama Pelanggan: ");
        pl.setnamaPelanggan(pl.Input().nextLine());
        System.out.print("No. Telpon: ");
        pl.setnoTelp(pl.Input().nextLine());        

        lapangan lp = new lapangan();
        System.out.print("\nTanggal Penyewaan? [Misal: 020222] : ");
        lp.settglSewa(lp.Input().nextLine());
        System.out.print("\nIngin Sewa Jam Berapa? [8-17] : ");
        lp.setpenyewaanJam(lp.Input().nextInt());
        
        while (lp.getpenyewaanJam() > 17 || lp.getpenyewaanJam() < 8){
            System.out.println("((MAAF, BOOKING HANYA BISA JAM"
                    + " 08.00 S/D 17.00, INPUT DENGAN BENAR!");
            System.out.print("\nIngin Sewa Jam Berapa? [8-17] : ");
            lp.setpenyewaanJam(lp.Input().nextInt());
        }    
        
        System.out.print("\n==> DAFTAR MENU <==");
        System.out.print("\n[1] Lapangan 1 (Bonus 1 Shuttlecock) | Rp80.000 /Jam"
                       + "\n[2] Lapangan 2 (Bonus 6 Shuttlecock) | Rp100.000 /Jam"
                       + "\n[3] Lapangan 3 (Bonus 6 Shuttlecock & Sewa 2 Racket) | Rp120.000 /Jam"
                       + "\nSilakan Input Pilihan [1/2/3] : ");
        lp.setkdLapangan(lp.Input().nextInt());
        System.out.print("\nIngin Sewa Berapa Jam? : ");
        lp.setjamSewa(lp.Input().nextInt());
        System.out.print("Total Biaya (Rp)"+lp.totalBiaya());
        System.out.print("\nUang Bayar (Rp)");
        lp.setjumlahBayar(lp.Input().nextInt());
        if (lp.getjumlahBayar() < lp.totalBiaya()){
            System.out.println("((UANG BAYAR KURANG, INPUT DENGAN BENAR!))");
            System.out.print("\nUang Bayar (Rp)");
            lp.setjumlahBayar(lp.Input().nextInt());
        }        
        System.out.println("\nSEWA LAPANGAN SEDANG MEMPROSES STRUK PEMBAYARAN, MOHON TUNGGU.");
        
        //TAMPILAN OUTPUT
        System.out.println("\n\t========== STRUK PEMBAYARAN - SEWA LAPANGAN BADMINTON ==========");
        System.out.println("\t\t\t Nama Pegawai      : " +pg.getnamaPegawai());
        System.out.println("\t\t\t Kode Pegawai      : " +pg.getkdPegawai());
        
        System.out.println("\n\t\t\t Nama Pelanggan    : " +pl.getnamaPelanggan());
        System.out.println("\t\t\t No. Telpon        : " +pl.getnoTelp());
        
        System.out.println("\n\t\t\t Harga Sewa Lapangan     : Rp"+lp.getkdLapangan() +" /Jam");
        System.out.println("\t\t\t Tgl Penyewaan           : "+lp.gettglSewa());
        System.out.println("\t\t\t Jam Penyewaan (PUKUL) "+lp.getpenyewaanJam() +".00 WIB");
        System.out.println("\t\t\t Lama Sewa               : "+lp.getjamSewa() +" Jam");
        
        //Polymorphism
        System.out.println("\t\t\t Total Biaya (Rp)"+lp.totalBiaya());       
        System.out.println("\n\t\t\t Uang Bayar              : Rp"+lp.getjumlahBayar());
        System.out.println("\t\t\t Uang Kembali            : Rp"+lp.uangKembali());
        System.out.println("\t=================== TERIMA KASIH TELAH MENYEWA ===================\n");
        
        //Konversi Struk ke TXT
        try{
        //Tanggal Hari Ini
        String months[] = {"Jan", "Feb","Mar","Apr","Mei","Jun",
                            "Jul","Aug","Sep","Oct","Nov","Dec"};
        int year;
        GregorianCalendar gcalendar = new GregorianCalendar();
        
        File data = new File("Struk Sewa Lapangan.txt");
        PrintWriter pr = new PrintWriter(new FileWriter(data,true));  
        //jika false maka file lama akan ditimpa, jika true maka data akan ditambahkan kebawah        
        pr.println("===> STRUK PEMBAYARAN SEWA LAPANGAN BADMINTON AHSAN-HENDRA");
        pr.print("TGL CETAK: " );
        pr.print(+gcalendar.get(Calendar.DATE) +" ");
        pr.print(months[gcalendar.get(Calendar.MONTH)] + ", ");
        pr.print(year = gcalendar.get(Calendar.YEAR));
        pr.print(" JAM " +gcalendar.get(Calendar.HOUR) + ":");
        pr.print(gcalendar.get(Calendar.MINUTE) + ":");
        pr.println(gcalendar.get(Calendar.SECOND));
        pr.println("Nama Pegawai      : " +pg.getnamaPegawai());
        pr.println("Kode Pegawai      : " +pg.getkdPegawai());
        pr.println("");
        pr.println("Nama Pelanggan    : " +pl.getnamaPelanggan());
        pr.println("No. Telpon        : " +pl.getnoTelp());
        pr.println("");
        pr.println("Harga Sewa Lapangan     : Rp"+lp.getkdLapangan() + " /Jam");
        pr.println("Tgl Penyewaan           : "+lp.gettglSewa());
        pr.println("Jam Penyewaan           : "+lp.getpenyewaanJam());
        pr.println("Lama Sewa               : "+lp.getjamSewa() +" Jam");
        pr.println("Total Biaya             : Rp"+lp.totalBiaya());       
        pr.println("");
        pr.println("Uang Bayar              : Rp"+lp.getjumlahBayar());
        pr.println("Uang Kembali            : Rp"+lp.uangKembali());
        pr.println("===> AKHIR STRUK");
        pr.println("");
        pr.close();
        System.out.println("PROGRAM SELESAI. STRUK TERSIMPAN.\n");
        }catch(Exception e){
            System.out.println("GAGAL CETAK STRUK!");
        }
      
      System.out.print("Ingin Sewa Lagi? [Y/T]");
      Scanner x = new Scanner(System.in);
      ulang = x.nextLine().toUpperCase();
      } //ulang
            System.out.println("PROGRAM DITUTUP. TERIMA KASIH.");
    }
    
    public static void cls(){
        System.out.print("\033[H\033[2J"); //clrscreen
    }
    
}

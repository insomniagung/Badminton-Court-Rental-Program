/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BadmintonCourtRentalSystem;
import java.util.Scanner;

/**
 *
 * @author Agung Gunawan
 */
public class lapangan {
    public int kdLapangan,jamSewa,jumlahBayar,penyewaanJam;
    public String tglSewa;
    public Scanner Input;

//constructor    
public lapangan(){
    this.Input=new Scanner(System.in);
}

//SETTER
public void setInput(Scanner Input){
    this.Input = Input;}
public void setkdLapangan(int kdLapangan){
    this.kdLapangan = kdLapangan;}
public void setjamSewa(int jamSewa){
    this.jamSewa = jamSewa;}
public void setjumlahBayar(int jumlahBayar){
    this.jumlahBayar = jumlahBayar;}
//NEW
public void settglSewa(String tglSewa){
    this.tglSewa = tglSewa;}
public void setpenyewaanJam(int penyewaanJam){
    this.penyewaanJam = penyewaanJam;}


//GETTER
public int getkdLapangan(){
 if(this.kdLapangan == 1){return 80000;}
 else if (this.kdLapangan == 2){return 100000;}
 else{return 120000;}
}

public int getjamSewa(){return jamSewa;}
public int getjumlahBayar(){return jumlahBayar;}
public String gettglSewa(){return tglSewa;}
public int getpenyewaanJam(){return penyewaanJam;}

//PROSES POLYMORPHISM
public int uangKembali(){return getjumlahBayar()-(getkdLapangan()*getjamSewa());}
public int totalBiaya(){return getkdLapangan()*getjamSewa();}
public Scanner Input(){return this.Input;}

}

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
public class pelanggan {
        public String namaPelanggan,noTelp;
    public Scanner Input;

public pelanggan(){
    this.Input=new Scanner(System.in);
}

//SETTER
public void setInput(Scanner Input){
    this.Input = Input;
}
public void setnamaPelanggan(String namaPelanggan){
    this.namaPelanggan = namaPelanggan;
}

public void setnoTelp(String noTelp){
    this.noTelp = noTelp;
}

public String getnamaPelanggan(){return namaPelanggan;}
public String getnoTelp(){return noTelp;}

//FUNGSI INPUT
public Scanner Input(){return this.Input;}
}

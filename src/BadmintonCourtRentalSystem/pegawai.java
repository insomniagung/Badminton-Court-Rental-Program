/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BadmintonCourtRentalSystem;

/**
 *
 * @author Agung Gunawan
 */
public class pegawai {
    //access-modifier
    private String namaPegawai;
    private String kdPegawai;
    
    public pegawai(){}
    public pegawai(String namaPegawai,String kdPegawai){
    this.namaPegawai = namaPegawai;
    this.kdPegawai = kdPegawai;
    }
    
    //SETTGETTER
    public void setnamaPegawai(String namaPegawai){this.namaPegawai = namaPegawai;}
    public String getnamaPegawai(){return namaPegawai;}

    public void setkdPegawai(String kdPegawai){this.kdPegawai = kdPegawai;}
    public String getkdPegawai(){return kdPegawai;}
    
    //Inheritance
    @Override
    public String toString(){
        return "\n\t\t Nama Pegawai : " +this.getnamaPegawai() 
              +"\n\t\t Kode Pegawai : " +this.getkdPegawai();
    }
}

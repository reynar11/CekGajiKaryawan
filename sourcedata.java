/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cek.gaji.karyawan;

/**
 *
 * @author Nitro5
 */
public class sourcedata {
    private String[][] sc = new String[2][3];
    private String email, password, nama = "";
    private String[][] user = new String[2][3]; //Array untuk output data dari setiap user
       String [][] scdata = {
		{"Rp 17.880.920", "Rp 8.550.000", "Rp 10.000.000", "08527289 (BNI)"},
		{"Rp 15.235.600", "Rp 15.000.000", "Rp 28.000.000", "08127512 (BRI)"},
		{"Rp 18.284.345", "Rp 12.500.000", "Rp 730.000", "08957667 (MANDIRI)"},
		{"Rp 21.912.293", "Rp 8.550.000", "Rp 1.200.000", "08367169 (RIAU KEPRI)"},
                {"BU JONA", "PAK JONI", "PAK JONU", "BU JONE"},
       };
   
    private String norekening, totalsaldo, transfer, tarik = "";

    
    public sourcedata(String emails, String passwords) { //Data untuk inputan email serta password user
        email = emails;
        password = passwords;
        String[][] datauser = {
            {"jona@gmail.com", "jona"},
		{"joni@gmail.com", "joni"},
		{"jonu@gmail.com", "jonu"},
		{"jone@gmail.com", "jone"},
        };
        
        this.sc = datauser;
    }
    
    //Method untuk -checkCredential
    private boolean checkCredential() {  
            if(sc[0][0].equals(email) && sc[0][1].equals(password)) {
                    totalsaldo = scdata [0][0];
                    transfer = scdata [0][1];
                    tarik   = scdata [0][2];
                    norekening = scdata [0][3];
                    nama = scdata [4][0];
                return true;
                
            }
            if(sc[1][0].equals(email) && sc[1][1].equals(password)) {
                    totalsaldo = scdata [1][0];
                    transfer  = scdata [1][1];
                    tarik   = scdata [1][2];
                    norekening = scdata [1][3];
                    nama = scdata [4][1];
                return true;
            }
            if(sc[2][0].equals(email) && sc[2][1].equals(password)) {
                    totalsaldo = scdata [2][0];
                    transfer  = scdata [2][1];
                    tarik   = scdata [2][2];
                    norekening = scdata [2][3];
                    nama = scdata [4][2];
                return true;
            }
            if(sc[3][0].equals(email) && sc[3][1].equals(password)) {
                    totalsaldo = scdata [3][0];
                    transfer  = scdata [3][1];
                    tarik   = scdata [3][2];
                    norekening = scdata [3][3];
                    nama = scdata [4][3];
                return true;
            }
            return false;
        
    }       
    //Method untuk output setelah berhasil login dengan email dan password yang benar
    public void login() {
        boolean source = checkCredential();
        if(source == true) {
            System.out.println("---> SELAMAT DATANG " + nama );
            System.out.println("---> SEMOGA HARI ANDA BAHAGIA SELALU");
            System.out.println("---> NO REKENING (BANK) : " + norekening);
            System.out.println("---> JUMLAH SALDO ANDA : " + totalsaldo);
            System.out.println("---> JUMLAH SALDO MASUK ANDA : "  + transfer);
            System.out.println("---> JUMLAH TARIK SALDO ANDA : "  + tarik);
            System.out.println("---> TERIMAKASIH DAN SAMPAI JUMPA!" );
        } else {
            System.out.println("\nMAAF EMAIL ATAU PASSWORD ANDA SALAH ");
        }
    }
}
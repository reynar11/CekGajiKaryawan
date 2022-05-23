/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cek.gaji.karyawan;

import java.util.Scanner;
/**
 *
 * @author Nitro5
 */
//Method untuk output login user dengan email dan password 
public class main {
    public static void main(String[] args) {
        System.out.println("--------------------------------");
        System.out.println("-------- SELAMAT DATANG --------");
        System.out.println("--------------------------------");
        String email, password;
        Scanner input = new Scanner(System.in);
        System.out.print("\nEmail : ");
        email = input.nextLine();
        System.out.print("Password : ");
        password = input.nextLine();

        sourcedata login = new sourcedata ( email, password );
        login.login();
    }
}
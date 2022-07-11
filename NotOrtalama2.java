package com.Alistirmalar;

import java.util.Scanner;

public class NotOrtalama2 {

	public static void main(String[] args) {
		int mat;
		int fizik;
		int kimya;
		int turkce;
		int tarih;
		int muzik;
		Scanner scanner = new Scanner(System.in);
		System.out.print("Matematik notu : ");
		mat = scanner.nextInt();
		System.out.print("Fizik notu : ");
		fizik = scanner.nextInt();
		System.out.print("Kimya notu : ");
		kimya = scanner.nextInt();
		System.out.print("Türkçe notu : ");
		turkce = scanner.nextInt();
		System.out.print("Tarih notu : ");
		tarih = scanner.nextInt();
		System.out.print("Müzik notu : ");
		muzik = scanner.nextInt();

		int ortalama = (mat + fizik + kimya + turkce + tarih + muzik) / 6;
		System.out.println("Ortalama : " + ortalama);

		while (ortalama > 60) {
			System.out.println("Sýnýfý geçti.");
			break;
		}
		while (ortalama <= 60) {
			System.out.println("Sýnýfta kaldý.");
			break;
		}

	}

}

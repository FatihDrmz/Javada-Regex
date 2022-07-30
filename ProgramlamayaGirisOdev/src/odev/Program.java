/**
*
* @author Fatih DURMAZ ve fatih.durmaz1@ogr.sakarya.edu.tr
* @since 29.03.2022
* <p>
* 	G191210064
* 	1. Öðretim B grubu
* </p>
*/

package odev;

import java.io.*;
import java.util.*;

public class Program {

	public static void main(String[] args) {

		String str = "";

		ArrayList<String> veri = new ArrayList<String>();

		String dosyaAdi = args[0];

		// Dosya Okuma islemini yapan kisim :
		try {

			FileInputStream fStream = new FileInputStream(dosyaAdi);
			DataInputStream dStream = new DataInputStream(fStream);
			BufferedReader bReader = new BufferedReader(new InputStreamReader(dStream));

			while ((str = bReader.readLine()) != null) {

				veri.add(str);

			}

			dStream.close();

		} catch (Exception e) {
			System.err.println("Hata : " + e.getMessage());
		}

		Lexical operator = new Lexical();

		System.err.println("Operator Bilgisi:");
		System.err.println("	Tekli Operator Sayisi: " + operator.TekliOperatorBul(veri));
		System.err.println("	Ikili Operator Sayisi: " + operator.IkiliOperatorBul(veri));
		System.err.println("	Sayisal Operator Sayisi: " + operator.SayisalOperatorBul(veri));
		System.err.println("	Iliskisel Operator Sayisi: " + operator.IliskiselOperatorBul(veri));
		System.err.println("	Mantiksal Operator Sayisi: " + operator.MantiksalOperatorBul(veri));

		Lexical operand = new Lexical();

		System.err.println("Operand Bilgisi:");
		System.err.println("	Toplam Operand Sayisi: " + operand.OperandBul(veri));

	}
}

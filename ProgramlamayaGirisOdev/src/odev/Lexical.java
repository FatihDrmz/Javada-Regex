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

import java.util.regex.Pattern;
import java.util.ArrayList;
import java.util.regex.Matcher;

public class Lexical {

	public int TekliOperatorBul(ArrayList<String> veri) {

		String dataArray = "";

		int sayac = 0;

		for (int i = 0; i < veri.size(); i++) {

			dataArray += veri.get(i);

		}

		Pattern pattern = Pattern.compile("(\\+\\+|\\-\\-|(?<=\\=)\\s*\\-\\d|(?<=\\=)\\s*\\+\\d|\\! )");
		Matcher matcher = pattern.matcher(dataArray);

		Pattern pattern1 = Pattern.compile("(?<=\\/\\*)(.*?)(?=\\*\\/)");
		Matcher matcher1 = pattern1.matcher(dataArray);

		Pattern pattern2 = Pattern.compile("(?<=\\/\\/)(.*?)(?=	)");
		Matcher matcher2 = pattern2.matcher(dataArray);

		while (matcher.find()) {
			sayac++;
		}

		while (matcher1.find()) {
			// System.out.println(matcher1.group(1));

			Matcher matcher3 = pattern.matcher(matcher1.group(1));

			while (matcher3.find()) {

				sayac--;
			}

			Matcher matcher6 = pattern2.matcher(matcher1.group(1));

			while (matcher6.find()) {

				Matcher matcher5 = pattern.matcher(matcher6.group(1));

				while (matcher5.find()) {
					sayac++;
				}
			}

		}

		while (matcher2.find()) {
			// System.out.println(matcher2.group(1));

			Matcher matcher4 = pattern.matcher(matcher2.group(1));

			while (matcher4.find()) {
				sayac--;
			}

		}

		return sayac;
	}

	public int IkiliOperatorBul(ArrayList<String> veri) {

		String dataArray = "";

		int sayac = 0;

		for (int i = 0; i < veri.size(); i++) {

			dataArray += veri.get(i);
		}

		Pattern pattern = Pattern.compile(
				"(\\=\\=|\\!\\=|\\<\\=|\\>\\=|\\<|\\>|\\&\\&|\\|\\||(?<=[^\\+\\-\\*\\/] \\w+\\)?)( *?\\/ *?)(?=\\w+\\)?\\;)|(?<=[^\\+\\-\\*\\/] \\w+\\)?)( *?\\* *?)(?=\\w+\\)?\\;)|(?<=[^\\+\\-\\*\\/] \\w+\\)?)( *?\\+ *?)(?=\\w+\\)?\\;)|(?<=[^\\+\\-\\*\\/] \\w+\\)?)( *?\\- *?)(?=\\w+\\)?\\;)|(?<=[^\\+\\-\\*\\/] \\w+\\)?)( *?\\% *?)(?=\\w+\\)?\\;))");
		Matcher matcher = pattern.matcher(dataArray);

		Pattern pattern1 = Pattern.compile("(?<=\\/\\*)(.*?)(?=\\*\\/)");
		Matcher matcher1 = pattern1.matcher(dataArray);

		Pattern pattern2 = Pattern.compile("(?<=\\/\\/)(.*?)(?=	)");
		Matcher matcher2 = pattern2.matcher(dataArray);

		while (matcher.find()) {
			sayac++;
		}

		while (matcher1.find()) {
			// System.out.println(matcher1.group(1));

			Matcher matcher3 = pattern.matcher(matcher1.group(1));

			while (matcher3.find()) {

				sayac--;
			}

			Matcher matcher6 = pattern2.matcher(matcher1.group(1));

			while (matcher6.find()) {
				// System.out.println(matcher6.group(1));

				Matcher matcher5 = pattern.matcher(matcher6.group(1));

				while (matcher5.find()) {
					sayac++;
				}
			}

		}

		while (matcher2.find()) {
			// System.out.println(matcher2.group(1));

			Matcher matcher4 = pattern.matcher(matcher2.group(1));

			while (matcher4.find()) {
				sayac--;
			}

		}

		return sayac;
	}

	public int SayisalOperatorBul(ArrayList<String> veri) {

		String dataArray = "";

		int sayac = 0;

		for (int i = 0; i < veri.size(); i++) {

			dataArray += veri.get(i);

		}

		Pattern pattern = Pattern.compile(
				"(\\+(\\+|\\=)|\\+|-(-|\\=)|-|\\/\\=|\\/|\\*\\=|\\*|%\\=|%|&\\=| & |\\|\\=|\\||\\^\\=|\\^| \\= )");
		Matcher matcher = pattern.matcher(dataArray);

		Pattern pattern1 = Pattern.compile("(?<=\\/\\*)(.*?)(?=\\*\\/)");
		Matcher matcher1 = pattern1.matcher(dataArray);

		Pattern pattern2 = Pattern.compile("(?<=\\/\\/)(.*?)(?=	)");
		Matcher matcher2 = pattern2.matcher(dataArray);
		Matcher matcher6 = pattern2.matcher(dataArray);

		while (matcher.find()) {
			sayac++;
		}

		while (matcher1.find()) {
			// System.out.println(matcher1.group(1));

			Matcher matcher3 = pattern.matcher(matcher1.group(1));

			while (matcher3.find()) {

				sayac--;
			}

			while (matcher6.find()) {

				Matcher matcher5 = pattern.matcher(matcher6.group(1));

				while (matcher5.find()) {
					sayac++;
				}
			}

			sayac -= 4;
		}

		while (matcher2.find()) {
			// System.out.println(matcher2.group(1));

			Matcher matcher4 = pattern.matcher(matcher2.group(1));

			while (matcher4.find()) {
				sayac--;
			}

			sayac -= 2;
		}

		return sayac;
	}

	public int IliskiselOperatorBul(ArrayList<String> veri) {

		String dataArray = "";

		int sayac = 0;

		for (int i = 0; i < veri.size(); i++) {

			dataArray += veri.get(i);
		}

		Pattern pattern = Pattern.compile("(\\<\\=|\\<|\\>\\=|\\>|\\=\\=|\\!\\=)");
		Matcher matcher = pattern.matcher(dataArray);

		Pattern pattern1 = Pattern.compile("(?<=\\/\\*)(.*?)(?=\\*\\/)");
		Matcher matcher1 = pattern1.matcher(dataArray);

		Pattern pattern2 = Pattern.compile("(?<=\\/\\/)(.*?)(?=	)");
		Matcher matcher2 = pattern2.matcher(dataArray);
		Matcher matcher6 = pattern2.matcher(dataArray);

		while (matcher.find()) {
			sayac++;
		}

		while (matcher1.find()) {
			// System.out.println(matcher1.group(1));

			Matcher matcher3 = pattern.matcher(matcher1.group(1));

			while (matcher3.find()) {

				sayac--;
			}

			while (matcher6.find()) {

				Matcher matcher5 = pattern.matcher(matcher6.group(1));

				while (matcher5.find()) {
					sayac++;
				}
			}
		}

		while (matcher2.find()) {
			// System.out.println(matcher2.group(1));

			Matcher matcher4 = pattern.matcher(matcher2.group(1));

			while (matcher4.find()) {
				sayac--;
			}
		}

		return sayac;
	}

	public int MantiksalOperatorBul(ArrayList<String> veri) {

		String dataArray = "";

		int sayac = 0;

		for (int i = 0; i < veri.size(); i++) {

			dataArray += veri.get(i);
		}

		Pattern pattern = Pattern.compile("(\\&\\&|\\|\\||\\! )");
		Matcher matcher = pattern.matcher(dataArray);

		Pattern pattern1 = Pattern.compile("(?<=\\/\\*)(.*?)(?=\\*\\/)");
		Matcher matcher1 = pattern1.matcher(dataArray);

		Pattern pattern2 = Pattern.compile("(?<=\\/\\/)(.*?)(?=	)");
		Matcher matcher2 = pattern2.matcher(dataArray);
		Matcher matcher6 = pattern2.matcher(dataArray);

		while (matcher.find()) {
			sayac++;
		}

		while (matcher1.find()) {
			// System.out.println(matcher1.group(1));

			Matcher matcher3 = pattern.matcher(matcher1.group(1));

			while (matcher3.find()) {

				sayac--;
			}

			while (matcher6.find()) {

				Matcher matcher5 = pattern.matcher(matcher6.group(1));

				while (matcher5.find()) {
					sayac++;
				}
			}
		}

		while (matcher2.find()) {
			// System.out.println(matcher2.group(1));

			Matcher matcher4 = pattern.matcher(matcher2.group(1));

			while (matcher4.find()) {
				sayac--;
			}
		}

		return sayac;
	}

	public int OperandBul(ArrayList<String> veri) {

		int sayac = 0;

		Lexical a = new Lexical();

		sayac += (a.SayisalOperatorBul(veri) - a.TekliOperatorBul(veri) + a.IliskiselOperatorBul(veri)
				+ a.MantiksalOperatorBul(veri)) * 2 + a.TekliOperatorBul(veri);

		return sayac;
	}
}

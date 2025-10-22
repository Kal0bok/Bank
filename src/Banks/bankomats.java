package Banks;

import java.util.ArrayList;
import java.util.Arrays;

import javax.swing.JOptionPane;


public class bankomats extends banks {

	public bankomats(int CVC, int KarNum, int DerTer, String MakSis, int nauduSk) {
		super(CVC, KarNum, DerTer, MakSis, nauduSk);
	}

	public static void main(String[] args) {
		String izvele;
		int izvelesID;
		String[]darbibas = {"Jauns konts","Noņemt kontu",
				"Kartu saraksts","Izsaukt metode",
				"Aizvērt programmu"};
		String[]veidi = {"Noreķinu karte", "Kredītkarte"};
		String[] atbilde = {"Jā", "Nē"};
		ArrayList<Object> riteni = new ArrayList<>();

		do {
			izvele = (String) JOptionPane.showInputDialog(null, "Izvēlies darbību",
					"Izvēlne", JOptionPane.QUESTION_MESSAGE, null
					,darbibas, darbibas[0]);
			if(izvele == null) break;
			
			izvelesID = Arrays.asList(darbibas).indexOf(izvele);
			
			switch(izvelesID) {
			case 0:
				izvele = (String) JOptionPane.showInputDialog(null, "Izvēlies karti",
						"Izvēlne", JOptionPane.QUESTION_MESSAGE, null
						,veidi, veidi[0]);
				if (izvele == null)break;
				
				String vards = Metodes.virknesParbaude("Ievadi vardu ");
				String uzvards = Metodes.virknesParbaude("Ievadi uzvardu");
				
				switch(izvele) {
				case "Velosipēds": 
					riteni.add(new banks((int)ritenaD, sedeklaPoz, cena, razotajs));
					JOptionPane.showMessageDialog(null, "Veiksmīgi uztaisīts velosipēds",
							"Paziņojums", JOptionPane.INFORMATION_MESSAGE);
					break;
					
				case "Kalnu velosipēds":
					int Atrums = Metodes.iestatitAtrumu();
				
					izvele = (String)JOptionPane.showInputDialog(null, "Vai būs atsperes",
							"Izvēlne", JOptionPane.QUESTION_MESSAGE, null
							,atbilde, atbilde[0]);
					if(izvele == null) break;
					
					boolean a;
					if(izvele == "Jā")
						a = true;
					else a = false;
					
					riteni.add(new KalnuRitenis(Atrums, a,
							(int)ritenaD, sedeklaPoz, cena, razotajs));	
					JOptionPane.showMessageDialog(null, "Veiksmīgi uztaisīts kalnu ritenis",
							"Paziņojums", JOptionPane.INFORMATION_MESSAGE);
					break;
					
				case "Bērnu velosipēds":
					izvele = (String)JOptionPane.showInputDialog(null, "Vai būs papildriteņi?",
							"Izvēlne", JOptionPane.QUESTION_MESSAGE, null
							,atbilde, atbilde[0]);
					if(izvele == null) break;
					
					boolean rit;
					if(izvele == "Jā") rit = true;
					else rit = false;
					
					izvele = (String)JOptionPane.showInputDialog(null, "Vai būs zvaniņš?",
							"Izvēlne", JOptionPane.QUESTION_MESSAGE, null
							,atbilde, atbilde[0]);
					if(izvele == null) break;
					
					boolean zvan;
					if(izvele == "Jā") zvan = true;
					else zvan = false;
					
					riteni.add(new BernuRitenis(rit, zvan,
							(int)ritenaD, sedeklaPoz, cena, razotajs));
					JOptionPane.showMessageDialog(null, "Veiksmīgi uztaisīts bērnu ritenis",
							"Paziņojums", JOptionPane.INFORMATION_MESSAGE);
					break;
				}
		
			}
		


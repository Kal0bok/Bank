package Banks;


public class banks implements Comparable<banks> {

	private int CVC, KarNum, DerTer, nauduSk;
	private String MakSis;
	
	
	public banks(int CVC, int KarNum, int DerTer, String MakSis, int nauduSk) {
		
		//Konstruktors
		this.CVC = CVC;
		this.KarNum = KarNum;
		this.DerTer = DerTer;
		this.MakSis = MakSis;
		
	}
		//Metodes
		
		public int noteiktCVC() {
			return CVC;
		}
		
		public int noteiktKarNum() {
			return KarNum;
			
		}
		
		public int noteiktDerTer() {
			return DerTer;
		}
		
		public String noteiktMakSis() {
			return MakSis;
		}

		public int noteiktnauduSk() {
			return nauduSk;
		}
		@Override
		public int compareTo(banks o) {
			
			return 0;
		}
	}

	
	
	
	

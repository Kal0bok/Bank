package Banks;

public class kredkarte extends banks{
private String KarVeid;
private int pienak;
	public kredkarte(int CVC, int KarNum, int DerTer, String MakSis, String KarVeid, int pienak, int nauduSk) {
		super(CVC, KarNum, DerTer, MakSis, nauduSk);
		this.KarVeid = KarVeid;
		this.pienak = pienak;
	}
public String noteiktKarVeid() {
	return KarVeid;
	
}

public int noteiktPienakumu() {
	return pienak;
}

}
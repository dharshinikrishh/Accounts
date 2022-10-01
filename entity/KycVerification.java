package entity;

public class KycVerification {

	private String panNo;
	private long aadhar;
	private String doctype;
	private String docNo;
	
	
	public KycVerification()
	{
		super();
	}
	public String getPanNo() {
		return panNo;
	}
	public void setPanNo(String panNo) {
		this.panNo = panNo;
	}
	public long getAadhar() {
		return aadhar;
	}
	public void setAadhar(long aadhar) {
		this.aadhar = aadhar;
	}
	public String getDoctype() {
		return doctype;
	}
	public void setDoctype(String doctype) {
		this.doctype = doctype;
	}
	public String getDocNo() {
		return docNo;
	}
	public void setDocNo(String docNo) {
		this.docNo = docNo;
	}
	@Override
	public String toString() {
		return "KycVerification [panNo=" + panNo + ", aadhar=" + aadhar + ", doctype=" + doctype + ", docNo=" + docNo
				+ "]";
	}
	public KycVerification(String panNo, long aadhar, String doctype, String docNo) {
		super();
		this.panNo = panNo;
		this.aadhar = aadhar;
		this.doctype = doctype;
		this.docNo = docNo;
	}
	
	
}

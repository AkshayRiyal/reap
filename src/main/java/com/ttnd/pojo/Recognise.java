package com.ttnd.pojo;

public class Recognise {

	private	Integer rtid;
	private Employee to;
	private Employee from;
	private String reason;
	private String karma;
	private Badges b;
    
	public Integer getRtid() {
		return rtid;
	}
	public void setRtid(Integer rtid) {
		this.rtid = rtid;
	}
	public Employee getTo() {
		return to;
	}
	public void setTo(Employee to) {
		this.to = to;
	}
	public Employee getFrom() {
		return from;
	}
	public void setFrom(Employee from) {
		this.from = from;
	}
	public String getReason() {
		return reason;
	}
	public void setReason(String reason) {
		this.reason = reason;
	}
	public String getKarma() {
		return karma;
	}
	public void setKarma(String karma) {
		this.karma = karma;
	}
	public Badges getB() {
		return b;
	}
	public void setB(Badges b) {
		this.b = b;
	}
}

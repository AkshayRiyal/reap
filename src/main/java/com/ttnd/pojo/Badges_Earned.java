
package com.ttnd.pojo;

import java.util.Date;

public class Badges_Earned {
	private Integer badges_earned_id;
	private Employee sender;
	private Employee receiver;
	private Badges badges;
	private Date earned_date;
	private String reason;
	private String karma;

	public Integer getBadges_earned_id() {
		return badges_earned_id;
	}

	public void setBadges_earned_id(Integer badges_earned_id) {
		this.badges_earned_id = badges_earned_id;
	}

	public Employee getSender() {
		return sender;
	}

	public void setSender(Employee sender) {
		this.sender = sender;
	}

	public Employee getReceiver() {
		return receiver;
	}

	public void setReceiver(Employee receiver) {
		this.receiver = receiver;
	}

	public Date getEarned_date() {
		return earned_date;
	}

	public void setEarned_date(Date earned_date) {
		this.earned_date = earned_date;
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

	public Badges getBadges() {
		return badges;
	}

	public void setBadges(Badges badges) {
		this.badges = badges;
	}
}

package com.ttnd.pojo;

import javax.persistence.Entity;

@Entity
public class Badges_Remaining {
	private Employee eid;
	private Badges bid;
	private int badgesRemaining;

	public Employee getEid() {
		return eid;
	}

	public void setEid(Employee eid) {
		this.eid = eid;
	}

	public Badges getBid() {
		return bid;
	}

	public void setBid(Badges bid) {
		this.bid = bid;
	}

	public int getBadgesRemaining() {
		return badgesRemaining;
	}

	public void setBadgesRemaining(int badgesRemaining) {
		this.badgesRemaining = badgesRemaining;
	}

}

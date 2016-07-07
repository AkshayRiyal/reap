package com.ttnd.pojo;

import javax.persistence.GeneratedValue;
import javax.persistence.Id;

public class Badges {
	@Id @GeneratedValue 
	private Integer badge_id;
	private Integer badge_type;
	private Integer badge_weight;

	public Integer getBadge_id() {
		return badge_id;
	}

	public void setBadge_id(Integer badge_id) {
		this.badge_id = badge_id;
	}

	public Integer getBadge_weight() {
		return badge_weight;
	}

	public void setBadge_weight(Integer badge_weight) {
		this.badge_weight = badge_weight;
	}

	public Integer getBadge_type() {
		return badge_type;
	}

	public void setBadge_type(Integer badge_type) {
		this.badge_type = badge_type;
	}

}

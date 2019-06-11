package com.miracle.cognitive.global.bean;

import java.util.List;

public class ReleaseEffort {

	private int totalEffort;
	private List<ReleaseFeature> releaseFeature;

	/**
	 * @return the totalEffort
	 */
	public int getTotalEffort() {
		return totalEffort;
	}

	/**
	 * @param totalEffort the totalEffort to set
	 */
	public void setTotalEffort(int totalEffort) {
		this.totalEffort = totalEffort;
	}

	/**
	 * @return the releaseFeature
	 */
	public List<ReleaseFeature> getReleaseFeature() {
		return releaseFeature;
	}

	/**
	 * @param releaseFeature the releaseFeature to set
	 */
	public void setReleaseFeature(List<ReleaseFeature> releaseFeature) {
		this.releaseFeature = releaseFeature;
	}
}

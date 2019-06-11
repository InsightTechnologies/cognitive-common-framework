package com.miracle.cognitive.global.bean;

public class ReleaseReport {
	private String sprintName;
	private ReleaseEffort releaseEffort;

	/**
	 * @return the sprintName
	 */
	public String getSprintName() {
		return sprintName;
	}

	/**
	 * @param sprintName the sprintName to set
	 */
	public void setSprintName(String sprintName) {
		this.sprintName = sprintName;
	}

	/**
	 * @return the releaseEffort
	 */
	public ReleaseEffort getReleaseEffort() {
		return releaseEffort;
	}

	/**
	 * @param releaseEffort the releaseEffort to set
	 */
	public void setReleaseEffort(ReleaseEffort releaseEffort) {
		this.releaseEffort = releaseEffort;
	}
}

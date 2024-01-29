package edu.ksu.canvas.model.announcement;

public class LockInfo {
	private boolean canView;
	private String assetString;

	public boolean isCanView() {
		return canView;
	}

	public LockInfo setCanView(boolean canView) {
		this.canView = canView;
		return this;
	}

	public String getAssetString() {
		return assetString;
	}

	public LockInfo setAssetString(String assetString) {
		this.assetString = assetString;
		return this;
	}
}

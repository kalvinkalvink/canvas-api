package edu.ksu.canvas.model;

import java.util.Date;

public class Folder {
	private Long id;
	private String name;
	private String fullName;
	private Long contextId;
	private String contextType;
	private Long parentFolderId;
	private Date createdAt;
	private Date updatedAt;
	private Date lockAt;
	private Date unlockAt;
	private Long position;
	private boolean locked;
	private String foldersUrl;
	private String filesUrl;
	private Long filesCount;
	private Long foldersCount;
	private boolean hidden;
	private boolean lockedForser;
	private boolean hiddenForUser;
	private boolean forSubmissions;
	private boolean canUpload;

	public Long getId() {
		return id;
	}

	public Folder setId(Long id) {
		this.id = id;
		return this;
	}

	public String getName() {
		return name;
	}

	public Folder setName(String name) {
		this.name = name;
		return this;
	}

	public String getFullName() {
		return fullName;
	}

	public Folder setFullName(String fullName) {
		this.fullName = fullName;
		return this;
	}

	public Long getContextId() {
		return contextId;
	}

	public Folder setContextId(Long contextId) {
		this.contextId = contextId;
		return this;
	}

	public String getContextType() {
		return contextType;
	}

	public Folder setContextType(String contextType) {
		this.contextType = contextType;
		return this;
	}

	public Long getParentFolderId() {
		return parentFolderId;
	}

	public Folder setParentFolderId(Long parentFolderId) {
		this.parentFolderId = parentFolderId;
		return this;
	}

	public Date getCreatedAt() {
		return createdAt;
	}

	public Folder setCreatedAt(Date createdAt) {
		this.createdAt = createdAt;
		return this;
	}

	public Date getUpdatedAt() {
		return updatedAt;
	}

	public Folder setUpdatedAt(Date updatedAt) {
		this.updatedAt = updatedAt;
		return this;
	}

	public Date getLockAt() {
		return lockAt;
	}

	public Folder setLockAt(Date lockAt) {
		this.lockAt = lockAt;
		return this;
	}

	public Date getUnlockAt() {
		return unlockAt;
	}

	public Folder setUnlockAt(Date unlockAt) {
		this.unlockAt = unlockAt;
		return this;
	}

	public Long getPosition() {
		return position;
	}

	public Folder setPosition(Long position) {
		this.position = position;
		return this;
	}

	public boolean isLocked() {
		return locked;
	}

	public Folder setLocked(boolean locked) {
		this.locked = locked;
		return this;
	}

	public String getFoldersUrl() {
		return foldersUrl;
	}

	public Folder setFoldersUrl(String foldersUrl) {
		this.foldersUrl = foldersUrl;
		return this;
	}

	public String getFilesUrl() {
		return filesUrl;
	}

	public Folder setFilesUrl(String filesUrl) {
		this.filesUrl = filesUrl;
		return this;
	}

	public Long getFilesCount() {
		return filesCount;
	}

	public Folder setFilesCount(Long filesCount) {
		this.filesCount = filesCount;
		return this;
	}

	public Long getFoldersCount() {
		return foldersCount;
	}

	public Folder setFoldersCount(Long foldersCount) {
		this.foldersCount = foldersCount;
		return this;
	}

	public boolean isHidden() {
		return hidden;
	}

	public Folder setHidden(boolean hidden) {
		this.hidden = hidden;
		return this;
	}

	public boolean isLockedForser() {
		return lockedForser;
	}

	public Folder setLockedForser(boolean lockedForser) {
		this.lockedForser = lockedForser;
		return this;
	}

	public boolean isHiddenForUser() {
		return hiddenForUser;
	}

	public Folder setHiddenForUser(boolean hiddenForUser) {
		this.hiddenForUser = hiddenForUser;
		return this;
	}

	public boolean isForSubmissions() {
		return forSubmissions;
	}

	public Folder setForSubmissions(boolean forSubmissions) {
		this.forSubmissions = forSubmissions;
		return this;
	}

	public boolean isCanUpload() {
		return canUpload;
	}

	public Folder setCanUpload(boolean canUpload) {
		this.canUpload = canUpload;
		return this;
	}
}

package edu.ksu.canvas.model.announcement;

public class Author {
    private Long id;
    private String anonymousId;
    private String displayName;
    private String avatarImageUrl;
    private String htmlUrl;
    private Object pronouns;

	public Long getId() {
		return id;
	}

	public Author setId(Long id) {
		this.id = id;
		return this;
	}

	public String getAnonymousId() {
		return anonymousId;
	}

	public Author setAnonymousId(String anonymousId) {
		this.anonymousId = anonymousId;
		return this;
	}

	public String getDisplayName() {
		return displayName;
	}

	public Author setDisplayName(String displayName) {
		this.displayName = displayName;
		return this;
	}

	public String getAvatarImageUrl() {
		return avatarImageUrl;
	}

	public Author setAvatarImageUrl(String avatarImageUrl) {
		this.avatarImageUrl = avatarImageUrl;
		return this;
	}

	public String getHtmlUrl() {
		return htmlUrl;
	}

	public Author setHtmlUrl(String htmlUrl) {
		this.htmlUrl = htmlUrl;
		return this;
	}

	public Object getPronouns() {
		return pronouns;
	}

	public Author setPronouns(Object pronouns) {
		this.pronouns = pronouns;
		return this;
	}
}

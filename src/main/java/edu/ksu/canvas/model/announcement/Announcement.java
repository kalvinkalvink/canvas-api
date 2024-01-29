package edu.ksu.canvas.model.announcement;

import java.util.ArrayList;
import java.util.Date;

public class Announcement {
    private Long id;
	private String title;
	private Date lastReplyAt;
	private Date createdAt;
	private Object delayedPostAt;
	private Date postedAt;
	private Object assignmentId;
	private Object rootTopicId;
	private Long position;
	private boolean podcastHasStudentPosts;
	private String discussionType;
	private Date lockAt;
	private boolean allowRating;
	private boolean onlyGradersCanRate;
	private boolean sortByRating;
	private boolean isSectionSpecific;
	private Object anonymousState;
	private String userName;
	private Long discussionSubentryCount;
	private Permissions permissions;
	private Object requireInitialPost;
	private boolean userCanSeePosts;
	private Object podcastUrl;
	private String readState;
	private Long unreadCount;
	private boolean subscribed;
    private ArrayList<Object> attachments;
    private boolean published;
    private boolean canUnpublish;
    private boolean locked;
    private boolean canLock;
    private boolean commentsDisabled;
    private Author author;
    private String htmlUrl;
    private String url;
    private boolean pinned;
    private Object groupCategoryId;
    private boolean canGroup;
    private ArrayList<Object> topicChildren;
    private ArrayList<Object> groupTopicChildren;
    private String contextCode;
    private boolean lockedForUser;
    private LockInfo lockInfo;
    private String lockExplanation;
    private String message;
    private String subscriptionHold;
    private Object todoDate;
    private boolean isAnnouncement;

	public Long getId() {
		return id;
	}

	public Announcement setId(Long id) {
		this.id = id;
		return this;
	}

	public String getTitle() {
		return title;
	}

	public Announcement setTitle(String title) {
		this.title = title;
		return this;
	}

	public Date getLastReplyAt() {
		return lastReplyAt;
	}

	public Announcement setLastReplyAt(Date lastReplyAt) {
		this.lastReplyAt = lastReplyAt;
		return this;
	}

	public Date getCreatedAt() {
		return createdAt;
	}

	public Announcement setCreatedAt(Date createdAt) {
		this.createdAt = createdAt;
		return this;
	}

	public Object getDelayedPostAt() {
		return delayedPostAt;
	}

	public Announcement setDelayedPostAt(Object delayedPostAt) {
		this.delayedPostAt = delayedPostAt;
		return this;
	}

	public Date getPostedAt() {
		return postedAt;
	}

	public Announcement setPostedAt(Date postedAt) {
		this.postedAt = postedAt;
		return this;
	}

	public Object getAssignmentId() {
		return assignmentId;
	}

	public Announcement setAssignmentId(Object assignmentId) {
		this.assignmentId = assignmentId;
		return this;
	}

	public Object getRootTopicId() {
		return rootTopicId;
	}

	public Announcement setRootTopicId(Object rootTopicId) {
		this.rootTopicId = rootTopicId;
		return this;
	}

	public Long getPosition() {
		return position;
	}

	public Announcement setPosition(Long position) {
		this.position = position;
		return this;
	}

	public boolean isPodcastHasStudentPosts() {
		return podcastHasStudentPosts;
	}

	public Announcement setPodcastHasStudentPosts(boolean podcastHasStudentPosts) {
		this.podcastHasStudentPosts = podcastHasStudentPosts;
		return this;
	}

	public String getDiscussionType() {
		return discussionType;
	}

	public Announcement setDiscussionType(String discussionType) {
		this.discussionType = discussionType;
		return this;
	}

	public Date getLockAt() {
		return lockAt;
	}

	public Announcement setLockAt(Date lockAt) {
		this.lockAt = lockAt;
		return this;
	}

	public boolean isAllowRating() {
		return allowRating;
	}

	public Announcement setAllowRating(boolean allowRating) {
		this.allowRating = allowRating;
		return this;
	}

	public boolean isOnlyGradersCanRate() {
		return onlyGradersCanRate;
	}

	public Announcement setOnlyGradersCanRate(boolean onlyGradersCanRate) {
		this.onlyGradersCanRate = onlyGradersCanRate;
		return this;
	}

	public boolean isSortByRating() {
		return sortByRating;
	}

	public Announcement setSortByRating(boolean sortByRating) {
		this.sortByRating = sortByRating;
		return this;
	}

	public boolean isSectionSpecific() {
		return isSectionSpecific;
	}

	public Announcement setSectionSpecific(boolean sectionSpecific) {
		isSectionSpecific = sectionSpecific;
		return this;
	}

	public Object getAnonymousState() {
		return anonymousState;
	}

	public Announcement setAnonymousState(Object anonymousState) {
		this.anonymousState = anonymousState;
		return this;
	}

	public String getUserName() {
		return userName;
	}

	public Announcement setUserName(String userName) {
		this.userName = userName;
		return this;
	}

	public Long getDiscussionSubentryCount() {
		return discussionSubentryCount;
	}

	public Announcement setDiscussionSubentryCount(Long discussionSubentryCount) {
		this.discussionSubentryCount = discussionSubentryCount;
		return this;
	}

	public Permissions getPermissions() {
		return permissions;
	}

	public Announcement setPermissions(Permissions permissions) {
		this.permissions = permissions;
		return this;
	}

	public Object getRequireInitialPost() {
		return requireInitialPost;
	}

	public Announcement setRequireInitialPost(Object requireInitialPost) {
		this.requireInitialPost = requireInitialPost;
		return this;
	}

	public boolean isUserCanSeePosts() {
		return userCanSeePosts;
	}

	public Announcement setUserCanSeePosts(boolean userCanSeePosts) {
		this.userCanSeePosts = userCanSeePosts;
		return this;
	}

	public Object getPodcastUrl() {
		return podcastUrl;
	}

	public Announcement setPodcastUrl(Object podcastUrl) {
		this.podcastUrl = podcastUrl;
		return this;
	}

	public String getReadState() {
		return readState;
	}

	public Announcement setReadState(String readState) {
		this.readState = readState;
		return this;
	}

	public Long getUnreadCount() {
		return unreadCount;
	}

	public Announcement setUnreadCount(Long unreadCount) {
		this.unreadCount = unreadCount;
		return this;
	}

	public boolean isSubscribed() {
		return subscribed;
	}

	public Announcement setSubscribed(boolean subscribed) {
		this.subscribed = subscribed;
		return this;
	}

	public ArrayList<Object> getAttachments() {
		return attachments;
	}

	public Announcement setAttachments(ArrayList<Object> attachments) {
		this.attachments = attachments;
		return this;
	}

	public boolean isPublished() {
		return published;
	}

	public Announcement setPublished(boolean published) {
		this.published = published;
		return this;
	}

	public boolean isCanUnpublish() {
		return canUnpublish;
	}

	public Announcement setCanUnpublish(boolean canUnpublish) {
		this.canUnpublish = canUnpublish;
		return this;
	}

	public boolean isLocked() {
		return locked;
	}

	public Announcement setLocked(boolean locked) {
		this.locked = locked;
		return this;
	}

	public boolean isCanLock() {
		return canLock;
	}

	public Announcement setCanLock(boolean canLock) {
		this.canLock = canLock;
		return this;
	}

	public boolean isCommentsDisabled() {
		return commentsDisabled;
	}

	public Announcement setCommentsDisabled(boolean commentsDisabled) {
		this.commentsDisabled = commentsDisabled;
		return this;
	}

	public Author getAuthor() {
		return author;
	}

	public Announcement setAuthor(Author author) {
		this.author = author;
		return this;
	}

	public String getHtmlUrl() {
		return htmlUrl;
	}

	public Announcement setHtmlUrl(String htmlUrl) {
		this.htmlUrl = htmlUrl;
		return this;
	}

	public String getUrl() {
		return url;
	}

	public Announcement setUrl(String url) {
		this.url = url;
		return this;
	}

	public boolean isPinned() {
		return pinned;
	}

	public Announcement setPinned(boolean pinned) {
		this.pinned = pinned;
		return this;
	}

	public Object getGroupCategoryId() {
		return groupCategoryId;
	}

	public Announcement setGroupCategoryId(Object groupCategoryId) {
		this.groupCategoryId = groupCategoryId;
		return this;
	}

	public boolean isCanGroup() {
		return canGroup;
	}

	public Announcement setCanGroup(boolean canGroup) {
		this.canGroup = canGroup;
		return this;
	}

	public ArrayList<Object> getTopicChildren() {
		return topicChildren;
	}

	public Announcement setTopicChildren(ArrayList<Object> topicChildren) {
		this.topicChildren = topicChildren;
		return this;
	}

	public ArrayList<Object> getGroupTopicChildren() {
		return groupTopicChildren;
	}

	public Announcement setGroupTopicChildren(ArrayList<Object> groupTopicChildren) {
		this.groupTopicChildren = groupTopicChildren;
		return this;
	}

	public String getContextCode() {
		return contextCode;
	}

	public Announcement setContextCode(String contextCode) {
		this.contextCode = contextCode;
		return this;
	}

	public boolean isLockedForUser() {
		return lockedForUser;
	}

	public Announcement setLockedForUser(boolean lockedForUser) {
		this.lockedForUser = lockedForUser;
		return this;
	}

	public LockInfo getLockInfo() {
		return lockInfo;
	}

	public Announcement setLockInfo(LockInfo lockInfo) {
		this.lockInfo = lockInfo;
		return this;
	}

	public String getLockExplanation() {
		return lockExplanation;
	}

	public Announcement setLockExplanation(String lockExplanation) {
		this.lockExplanation = lockExplanation;
		return this;
	}

	public String getMessage() {
		return message;
	}

	public Announcement setMessage(String message) {
		this.message = message;
		return this;
	}

	public String getSubscriptionHold() {
		return subscriptionHold;
	}

	public Announcement setSubscriptionHold(String subscriptionHold) {
		this.subscriptionHold = subscriptionHold;
		return this;
	}

	public Object getTodoDate() {
		return todoDate;
	}

	public Announcement setTodoDate(Object todoDate) {
		this.todoDate = todoDate;
		return this;
	}

	public boolean isAnnouncement() {
		return isAnnouncement;
	}

	public Announcement setAnnouncement(boolean announcement) {
		isAnnouncement = announcement;
		return this;
	}
}

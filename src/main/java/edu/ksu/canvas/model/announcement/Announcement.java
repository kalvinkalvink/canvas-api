package edu.ksu.canvas.model.announcement;

import java.util.ArrayList;
import java.util.Date;

public class Announcement {
    public int id;
    public String title;
    public Date last_reply_at;
    public Date created_at;
    public Object delayed_post_at;
    public Date posted_at;
    public Object assignment_id;
    public Object root_topic_id;
    public int position;
    public boolean podcast_has_student_posts;
    public String discussion_type;
    public Object lock_at;
    public boolean allow_rating;
    public boolean only_graders_can_rate;
    public boolean sort_by_rating;
    public boolean is_section_specific;
    public Object anonymous_state;
    public String user_name;
    public int discussion_subentry_count;
    public Permissions permissions;
    public Object require_initial_post;
    public boolean user_can_see_posts;
    public Object podcast_url;
    public String read_state;
    public int unread_count;
    public boolean subscribed;
    public ArrayList<Object> attachments;
    public boolean published;
    public boolean can_unpublish;
    public boolean locked;
    public boolean can_lock;
    public boolean comments_disabled;
    public Author author;
    public String html_url;
    public String url;
    public boolean pinned;
    public Object group_category_id;
    public boolean can_group;
    public ArrayList<Object> topic_children;
    public ArrayList<Object> group_topic_children;
    public String context_code;
    public boolean locked_for_user;
    public LockInfo lock_info;
    public String lock_explanation;
    public String message;
    public String subscription_hold;
    public Object todo_date;
    public boolean is_announcement;
}

package edu.ksu.canvas.requestOptions;

import com.sun.org.apache.bcel.internal.generic.ANEWARRAY;
import com.sun.org.apache.xpath.internal.operations.Bool;

import java.util.*;

public class ListCourseAnnouncementOptions extends BaseOptions {
    public enum Include {
        SECTIONS, SECTIONS_USER_COUNT;

        @Override
        public String toString() {
            return name().toLowerCase();
        }
    }


    public List<String> getCourseIdList() {
        return courseIdList;
    }

    List<String> courseIdList = new ArrayList<>();

    public ListCourseAnnouncementOptions(String courseId) {
        courseIdList=new ArrayList<String>() {{
            add(courseId);
        }};
    }

    public ListCourseAnnouncementOptions(List<String> courseIdList) {
        this.courseIdList = courseIdList;
    }


    public ListCourseAnnouncementOptions startDate(Date startDate) {
        addSingleItem("start_date", startDate.toString());
        return this;
    }

    public ListCourseAnnouncementOptions endDate(Date endDate) {
        addSingleItem("end_date", endDate.toString());
        return this;
    }

    public ListCourseAnnouncementOptions activeOnly(Boolean activeOnly) {
        addSingleItem("active_only", activeOnly.toString());
        return this;
    }

    public ListCourseAnnouncementOptions latestOnly(Boolean lastOnly) {
        addSingleItem("last_only", lastOnly.toString());
        return this;
    }

    public ListCourseAnnouncementOptions includes(List<GetAssignmentGroupOptions.Include> includes) {
        List<Include> announcementDependents = Arrays.asList(Include.SECTIONS, Include.SECTIONS_USER_COUNT);
        addEnumList("include[]", includes);
        return this;
    }
}

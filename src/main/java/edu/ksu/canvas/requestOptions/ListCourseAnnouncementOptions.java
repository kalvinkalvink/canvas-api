package edu.ksu.canvas.requestOptions;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.List;
import java.util.stream.Collectors;

public class ListCourseAnnouncementOptions extends BaseOptions {
	public enum Include {
		SECTIONS, SECTIONS_USER_COUNT;

		@Override
		public String toString() {
			return name().toLowerCase();
		}
	}

	public ListCourseAnnouncementOptions(String courseId) {
		optionsMap.put("context_codes[]", new ArrayList<String>() {{
			add(String.format("course_%s", courseId));
		}});
	}

	public ListCourseAnnouncementOptions(List<String> courseIdList) {
		List<String> contextCodeCourseIdList = courseIdList.stream()
				.map(courseId -> String.format("course_%s", courseId))
				.collect(Collectors.toList());
		optionsMap.put("context_codes[]", contextCodeCourseIdList);
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

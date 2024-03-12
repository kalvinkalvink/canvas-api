package edu.ksu.canvas.interfaces;

import edu.ksu.canvas.model.announcement.Announcement;
import edu.ksu.canvas.requestOptions.ListCourseAnnouncementOptions;

import java.io.IOException;
import java.util.List;
import java.util.Optional;

public interface AnnouncementReader extends CanvasReader<Announcement, AnnouncementReader> {
    List<Announcement> listCourseAnnouncement(ListCourseAnnouncementOptions listCourseAnnouncementOptions) throws IOException;
}

package edu.bsuir.service;

import edu.bsuir.model.Notices;

import java.util.List;

public interface NoticesService {
    Notices addNotices(Notices notice);
    List<Notices> getNotices();
    Notices getNotice(int id);
    void deleteNotice(int id);


}

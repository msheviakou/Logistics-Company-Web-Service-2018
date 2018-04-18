package edu.bsuir.service;

import edu.bsuir.model.Notices;

import java.util.List;

public interface NoticesService {
    Notices addNotices(Notices notice);
    List<Notices> getAll();
    Notices getNotice(int id);
    void deleteNotice(int id);


}

package edu.bsuir.controller.notice;

import edu.bsuir.model.Notices;
import edu.bsuir.service.implementation.NoticesServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class NoticesREST {

    @Autowired
    private NoticesServiceImpl noticesService;

    @RequestMapping(value = "/notice",
            method = RequestMethod.POST,
            produces = { MediaType.APPLICATION_JSON_VALUE,
                    MediaType.APPLICATION_XML_VALUE })
    public Notices addNotice(@RequestBody Notices notice) {return noticesService.addNotices(notice);}

    @RequestMapping(value = "/notices",
            method = RequestMethod.GET,
            produces = { MediaType.APPLICATION_JSON_VALUE,
                    MediaType.APPLICATION_XML_VALUE })
    public List<Notices> getAllNotices() {
        return noticesService.getNotices();
    }

    @RequestMapping(value = "/notice/{noticeId}",
            method = RequestMethod.GET,
            produces = { MediaType.APPLICATION_JSON_VALUE,
                    MediaType.APPLICATION_XML_VALUE })
    public Notices getNotice(@PathVariable("noticeId") String noticeId) {
        return noticesService.getNotice(Integer.parseInt(noticeId));
    }

    @RequestMapping(value = "/notice/{noticeId}",
            method = RequestMethod.DELETE,
            produces = { MediaType.APPLICATION_JSON_VALUE,
                    MediaType.APPLICATION_XML_VALUE })
    public void deleteNotice(@PathVariable("noticeId") String noticeId) {
        noticesService.deleteNotice(Integer.parseInt(noticeId));
    }
}

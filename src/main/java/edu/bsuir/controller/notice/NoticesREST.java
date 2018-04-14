package edu.bsuir.controller.notice;

import edu.bsuir.model.Notices;
import edu.bsuir.service.implementation.NoticesServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class NoticesREST {

    @Autowired
    private NoticesServiceImpl noticesService;

    @RequestMapping(value = "/notice",
            method = RequestMethod.POST,
            produces = { MediaType.APPLICATION_JSON_VALUE,
                    MediaType.APPLICATION_XML_VALUE })
    public Notices addNotice(@RequestBody Notices notice) {return noticesService.addNotices(notice);}
}

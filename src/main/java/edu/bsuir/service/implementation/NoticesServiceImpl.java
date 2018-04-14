package edu.bsuir.service.implementation;

import edu.bsuir.model.Notices;
import edu.bsuir.model.Users;
import edu.bsuir.repository.NoticesRepository;
import edu.bsuir.service.NoticesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class NoticesServiceImpl implements NoticesService{

    @Autowired
    private NoticesRepository noticesRepository;

    @Autowired
    private UsersServiceImpl usersService;

    @Override
    public Notices addNotices(Notices notice) {

        Users userForwarder = usersService.getUserByName(notice.getForwarder().getName());
        notice.setForwarder(userForwarder);

        return noticesRepository.saveAndFlush(notice);
    }
}

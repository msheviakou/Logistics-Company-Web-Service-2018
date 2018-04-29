package edu.bsuir.service.implementation;

import edu.bsuir.model.Notices;
import edu.bsuir.model.Users;
import edu.bsuir.repository.NoticesRepository;
import edu.bsuir.service.NoticesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class NoticesServiceImpl implements NoticesService{

    @Autowired
    private NoticesRepository noticesRepository;

    @Autowired
    private UsersServiceImpl usersService;

    @Override
    public Notices addNotices(Notices notice) {

        Users userForwarder = usersService.getUser(notice.getForwarder().getId());
        notice.setForwarder(userForwarder);

        return noticesRepository.saveAndFlush(notice);
    }

    @Override
    public List<Notices> getNotices() {
        return noticesRepository.findAll();
    }

    @Override
    public Notices getNotice(int id) {
        return noticesRepository.getOne(id);
    }

    @Override
    public void deleteNotice(int id) {
        noticesRepository.deleteById(id);
    }
}

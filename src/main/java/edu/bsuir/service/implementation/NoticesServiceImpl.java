package edu.bsuir.service.implementation;

import edu.bsuir.model.Notices;
import edu.bsuir.repository.NoticesRepository;
import edu.bsuir.service.NoticesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class NoticesServiceImpl implements NoticesService{

    @Autowired
    private NoticesRepository noticesRepository;

    @Override
    public Notices addNotices(Notices notice) { return noticesRepository.saveAndFlush(notice); }
}

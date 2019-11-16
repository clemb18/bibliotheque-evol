package com.openclassrooms.bibliotheque.service.impl;

import com.openclassrooms.bibliotheque.repository.WorkRepository;
import com.openclassrooms.bibliotheque.service.WorkService;
import com.openclassrooms.bibliotheque.models.Work;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public class WorkServiceImpl implements WorkService {

    private static Logger logger = LoggerFactory.getLogger(WorkServiceImpl.class);

    @Autowired
    WorkRepository workRepository;

    @Override
    public List<Work> getWorksByAuthor(String author) {

        return workRepository.findByAuthorIsContainingIgnoreCase(author);
    }

    @Override
    public List<Work> getWorksByPublicationDate(Integer publicationDate) {

        return workRepository.findByPublicationDate(publicationDate);

    }

    public Work saveNewWork(Work work) {
        logger.info("enregistrement d'uen nouvelle oeuvre: {}", work);

        return workRepository.save(work);
    }

    public Work deleteWork(Integer workId) {
        logger.info("suppression d'une oeuvre: {}", workId);

        return workRepository.delete(workId);
    }
}
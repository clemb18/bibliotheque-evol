package com.openclassrooms.bibliotheque.service;

import com.openclassrooms.projects.bibliot.User;

public interface UserService {

    User findByLoginAndPassword(String login, String password);
}


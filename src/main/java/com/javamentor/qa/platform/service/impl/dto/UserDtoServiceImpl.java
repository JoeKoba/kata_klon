package com.javamentor.qa.platform.service.impl.dto;

import com.javamentor.qa.platform.dao.abstracts.dto.UserDtoDao;
import com.javamentor.qa.platform.models.dto.user.UserDto;
import com.javamentor.qa.platform.service.abstracts.dto.UserDtoService;
import com.javamentor.qa.platform.webapp.controllers.util.UserNotFoundException;
import org.springframework.stereotype.Service;

@Service
public class UserDtoServiceImpl implements UserDtoService {

    private final UserDtoDao userDtoDao;

    public UserDtoServiceImpl(UserDtoDao userDtoDao) {
        this.userDtoDao = userDtoDao;
    }

    @Override
    public UserDto getById(long id) {
        return userDtoDao.getById(id).orElseThrow(UserNotFoundException::new);
    }
}

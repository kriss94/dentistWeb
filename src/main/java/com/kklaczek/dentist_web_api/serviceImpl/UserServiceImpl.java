package com.kklaczek.dentist_web_api.serviceImpl;

import com.kklaczek.dentist_web_api.dto.UserDto;
import com.kklaczek.dentist_web_api.entity.User;
import com.kklaczek.dentist_web_api.service.UserService;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl extends AbstractCrudService<User, UserDto> implements UserService {
}

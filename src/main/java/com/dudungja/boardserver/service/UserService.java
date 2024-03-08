package com.dudungja.boardserver.service;

import com.dudungja.boardserver.dto.UserDTO;

public interface UserServiceImpl {

    void register(UserDTO userProfile);

    UserDTO login(String id, String password);

    boolean isDuplicatedId(String id);

    UserDTO getUserInfo(String userId);

    void updatedPassword(String id, String beforePassword, String afterPassword);

    void deleteId(String id, String password);
}

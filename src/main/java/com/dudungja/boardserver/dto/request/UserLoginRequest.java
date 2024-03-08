package com.dudungja.boardserver.dto;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.time.LocalDateTime;

@AllArgsConstructor
@Data
public class UserDTO {
    private int id;

    private String userId;

    private String password;

    private String nickname;

    private boolean isAdmin;

    private LocalDateTime createdAt;

    private LocalDateTime updatedAt;

    private boolean isWithdraw;

    private Status status;

    public boolean hasNullDataBeforeRegister(UserDTO userDTO) {
        return userDTO.getUserId() == null || userDTO.getPassword() == null || userDTO.getNickname() == null;
    }

    public enum Status {
        DEFAULT, ADMIN, DELETED
    }
}

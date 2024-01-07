package com.toyboard.board_toy_project.dto.request;

import lombok.Data;

@Data
public class AddBoardReqDto {
    public int userId;
    public int categoryId;
    public String title;
    public String text;
}

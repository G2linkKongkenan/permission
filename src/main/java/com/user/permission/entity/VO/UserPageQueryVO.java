package com.user.permission.entity.VO;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @Auther: wb-kkn510564
 * @Date: 2019/3/19 18:05
 * @Description:
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class UserPageQueryVO {

    private String username;

    private Long groupId;
}

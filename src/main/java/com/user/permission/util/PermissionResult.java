package com.user.permission.util;

import lombok.Data;
import lombok.Builder;

/**
 * 权限系统全局返回结果实体对象
 * @Auther: wb-kkn510564
 * @Date: 2019/3/19 17:50
 * @Description:
 */
@Data
@Builder
public class PermissionResult {

    /**
     * 是否成功
     */
    private boolean success;

    /**
     * 错误描述
     */
    private String desc;

    /**
     * 返回结果
     */
    private Object obj;

    public PermissionResult(boolean success, String desc, Object obj) {
        this.success = success;
        this.desc = desc;
        this.obj = obj;
    }

    /**
     * 只返回成功与否
     * @return
     */
    public PermissionResult success() {
        return new PermissionResult(true, null, null);
    }

    /**
     * 返回成功状态和结果
     * @param obj
     * @return
     */
    public PermissionResult success(Object obj) {
        return new PermissionResult(true, null, obj);
    }

    /**
     * 返回成功状态、结果和描述
     * @param obj
     * @return
     */
    public PermissionResult success(String desc, Object obj) {
        return new PermissionResult(true, desc, obj);
    }

    /**
     * 只返回是否失败
     * @return
     */
    public PermissionResult fail() {
        return new PermissionResult(false, null, null);
    }

    /**
     * 返回失败和描述
     * @param desc
     * @return
     */
    public PermissionResult fail(String desc) {
        return new PermissionResult(false, desc, null);
    }

    /**
     * 返回失败、结果和描述
     * @param desc
     * @param obj
     * @return
     */
    public PermissionResult fail(String desc, Object obj) {
        return new PermissionResult(false, desc, obj);
    }
}

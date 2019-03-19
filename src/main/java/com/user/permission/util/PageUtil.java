package com.user.permission.util;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;

/**
 * 分页工具类
 * @Auther: wb-kkn510564
 * @Date: 2019/3/19 17:34
 * @Description:
 */
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class PageUtil<T> {

    private static final Long DEFAULT_PAGE_INDEX = 1L;
    private static final Long DEFAULT_PAGE_SIZE = 10L;
    /**
     * 分页索引
     */
    private Long pageIndex = DEFAULT_PAGE_INDEX;

    /**
     * 分页大小
     */
    private Long pageSize = DEFAULT_PAGE_SIZE;

    /**
     * 总记录数
     */
    private Long rows;

    /**
     * 总分页数
     */
    private Long pages;

    /**
     * 数据集合
     */
    private List<T> data;

    public Long getPageIndex() {
        if (this.pageIndex == null || this.pageIndex <= 0) {
            return DEFAULT_PAGE_INDEX;
        }
        return pageIndex;
    }

    public Long getPageSize() {
        if (this.pageSize == null || this.pageSize <= 0) {
            return DEFAULT_PAGE_SIZE;
        }
        return pageSize;
    }

    public Long getRows() {
        if (this.data == null || this.data.size() == 0) {
            return 0L;
        }
        return Long.valueOf(data.size());
    }

    public Long getPages() {
        if (this.pages == null || this.pages <= 0) {
            return 0L;
        }
        return (this.rows % this.pageSize == 0) ? (this.rows / this.pageSize) : (this.rows / this.pageSize + 1);
    }

    public List<T> getData() {
        return data;
    }
}

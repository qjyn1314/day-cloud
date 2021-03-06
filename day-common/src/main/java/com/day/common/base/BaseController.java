package com.day.common.base;

import com.baomidou.mybatisplus.core.metadata.IPage;
import org.springframework.web.bind.annotation.CrossOrigin;

import java.util.HashMap;
import java.util.Map;

/**
 * <p>
 * Explain:
 * </p >
 *
 * @author wangjunming
 * @CrossOrigin : 跨域支持
 * @since 2020-01-16 14:25
 * 60*60 分
 * 60*60*60 时
 * 60*60*60*24 天
 * 60*60*60*24*7 周
 * 60*60*60*24*30 月
 */
@CrossOrigin(origins = "*", maxAge = -1)
public abstract class BaseController {

    /**
     * 返回的分页列表
     *
     * @author wangjunming
     * @since 2020/3/23 16:29
     */
    protected Map<String, Object> getDataTable(IPage<?> pageInfo) {
        Map<String, Object> rspData = new HashMap<>(5);
        rspData.put("currentSize", pageInfo.getCurrent());
        rspData.put("pageSize", pageInfo.getSize());
        rspData.put("totalPage", ((pageInfo.getTotal() + pageInfo.getSize() - 1) / pageInfo.getSize()));
        rspData.put("totalRows", pageInfo.getTotal());
        rspData.put("rows", pageInfo.getRecords());
        return rspData;
    }

}

package com.day.today.consumer;

import com.day.api.config.DubboNacosGroup;
import com.day.api.provider.today.TodayProvider;
import com.day.today.persistence.service.IOrderService;
import org.apache.dubbo.config.annotation.DubboService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * <p>
 * explain:
 * </p>
 *
 * @author wangjunming
 * @since 2020/10/23 17:22
 */
@DubboService(group = DubboNacosGroup.TODAY_DUBBO_NACOS)
public class TodayProviderImpl implements TodayProvider {


    @Override
    public String getTodayDataTime() {
        return new SimpleDateFormat("yyyy-MM-dd HH:mm:ss.SSS").format(new Date());
    }
}

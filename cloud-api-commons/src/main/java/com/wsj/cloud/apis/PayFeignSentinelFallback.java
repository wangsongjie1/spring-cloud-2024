package com.wsj.cloud.apis;


import com.wsj.cloud.entities.PayDTO;
import com.wsj.cloud.util.Result;
import org.springframework.stereotype.Component;

@Component
public class PayFeignSentinelFallback implements PayFeignSentinelApi {
    @Override
    public Result<PayDTO> getPayByOrderNo(String orderNo) {
        return Result.fail("服务不可达");
    }
}

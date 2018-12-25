package com.itmuch.cloud.feign;

import com.itmuch.config.Configuration1;
import com.itmuch.config.Configuration2;
import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;


@FeignClient(name="xxx",url="http://localhost:8761/",configuration=Configuration2.class,fallback=HystrixClientFallback2.class)
public interface FeignClient2 {
    @RequestMapping(value="/eureka/apps/{serviceName}")
    public String findServiceInfoFromEurekaByServiceName(@PathVariable("serviceName") String serviceName);

}

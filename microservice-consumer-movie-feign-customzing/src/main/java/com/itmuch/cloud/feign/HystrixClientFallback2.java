package com.itmuch.cloud.feign;

public class HystrixClientFallback2 implements FeignClient2 {
    @Override
    public String findServiceInfoFromEurekaByServiceName(String serviceName) {
        return "jhkjhk";
    }
}

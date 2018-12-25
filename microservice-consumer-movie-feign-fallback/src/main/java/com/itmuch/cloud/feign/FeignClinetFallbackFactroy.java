package com.itmuch.cloud.feign;

import com.itmuch.cloud.entity.User;
import feign.hystrix.FallbackFactory;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.stereotype.Component;

@Component
public class FeignClinetFallbackFactroy implements FallbackFactory <UserFeignClient>{
    final  static Logger LOGGER= LoggerFactory.getLogger(FeignClinetFallbackFactroy.class);
    @Override
    public UserFeignClient create(Throwable throwable) {
        return new UserFeignWithFallBackFactoryClient() {
            @Override
            public User findById(Long id) {
                LOGGER.info("jkjkj{};uyuu{}", throwable.getMessage(),"45455");
                System.out.println("iojkjln");
                return null;
            }

            @Override
            public User postUser(User user) {
                return null;
            }

            @Override
            public User testUser(User user) {
                return null;
            }
        };
    }
}

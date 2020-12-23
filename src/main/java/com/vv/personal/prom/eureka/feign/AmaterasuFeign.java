package com.vv.personal.prom.eureka.feign;

import org.springframework.cloud.openfeign.FeignClient;

/**
 * @author Vivek
 * @since 23/12/20
 */
@FeignClient("prom-amaterasu-service")
public interface AmaterasuFeign {


}

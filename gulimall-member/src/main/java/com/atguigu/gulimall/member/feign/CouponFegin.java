package com.atguigu.gulimall.member.feign;

import com.atguigu.common.utils.PageUtils;
import com.atguigu.common.utils.R;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.Map;

/**
 * @Description:
 * @Author: ChengRG
 * @Date: 2022/1/19 13:42
 */
@FeignClient(value = "gulimall-coupon")
public interface CouponFegin {

    @RequestMapping("/coupon/coupon/member/list")
    public R memberCoupons();
}

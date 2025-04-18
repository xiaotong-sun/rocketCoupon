
package com.nageoffer.rocketCoupon.merchant.admin.service;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.service.IService;
import com.nageoffer.rocketCoupon.merchant.admin.dao.entity.CouponTemplateDO;
import com.nageoffer.rocketCoupon.merchant.admin.dto.req.CouponTemplateNumberReqDTO;
import com.nageoffer.rocketCoupon.merchant.admin.dto.req.CouponTemplatePageQueryReqDTO;
import com.nageoffer.rocketCoupon.merchant.admin.dto.req.CouponTemplateSaveReqDTO;
import com.nageoffer.rocketCoupon.merchant.admin.dto.resp.CouponTemplatePageQueryRespDTO;
import com.nageoffer.rocketCoupon.merchant.admin.dto.resp.CouponTemplateQueryRespDTO;

/**
 * 优惠券模板业务逻辑层
 */
public interface CouponTemplateService extends IService<CouponTemplateDO> {

    /**
     * 创建商家优惠券模板
     *
     * @param requestParam 请求参数
     */
    void createCouponTemplate(CouponTemplateSaveReqDTO requestParam);

    /**
     * 分页查询商家优惠券模板
     *
     * @param requestParam 请求参数
     * @return 商家优惠券模板分页数据
     */
    IPage<CouponTemplatePageQueryRespDTO> pageQueryCouponTemplate(CouponTemplatePageQueryReqDTO requestParam);

    /**
     * 查询优惠券模板详情
     * 后管接口并不存在并发，直接查询数据库即可
     *
     * @param couponTemplateId 优惠券模板 ID
     * @return 优惠券模板详情
     */
    CouponTemplateQueryRespDTO findCouponTemplateById(String couponTemplateId);

    /**
     * 结束优惠券模板
     *
     * @param couponTemplateId 优惠券模板 ID
     */
    void terminateCouponTemplate(String couponTemplateId);

    /**
     * 增加优惠券模板发行量
     *
     * @param requestParam 请求参数
     */
    void increaseNumberCouponTemplate(CouponTemplateNumberReqDTO requestParam);
}

package com.yang.mall.request;

/**
 * @ClassName InventoryCntDBUpdateRequest
 * @Description TODO
 * @Author YangC
 * @Date 2021/4/18 15:19
 **/
public class InventoryCntDBUpdateRequest implements Request {

    private Integer productId;
    private Long inventoryCnt;

    public InventoryCntDBUpdateRequest(Integer productId, Long inventoryCnt) {
        this.productId = productId;
        this.inventoryCnt = inventoryCnt;
    }

    @Override
    public void process() {

    }
}

package com.imooc.oa.biz;

import com.imooc.oa.entity.ClaimVoucher;
import com.imooc.oa.entity.ClaimVoucherItem;
import com.imooc.oa.entity.DealRecord;

import java.util.List;

public interface ClaimVoucherBiz {
    void save(ClaimVoucher claimVoucher, List<ClaimVoucherItem> items);

    ClaimVoucher get(int id);
    List<ClaimVoucherItem> getItems(int cvid);
    List<DealRecord> getRecords(int cvid);


    List<ClaimVoucher> getForSelf(String sn);//获取个人报销单
    List<ClaimVoucher> getForDeal(String sn);//获取待处理报销单

    void update(ClaimVoucher claimVoucher,List<ClaimVoucherItem> items);//修改报销单接口

    void submit(int id);

    void deal(DealRecord dealRecord);

}

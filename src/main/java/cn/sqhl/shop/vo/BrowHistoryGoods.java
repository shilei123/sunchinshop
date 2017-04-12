package cn.sqhl.shop.vo;

import java.util.Date;

import org.apache.commons.lang.StringUtils;

public class BrowHistoryGoods extends GoodsPrice{
    private String id;

    private String userId;

    private String goodsId;

    private String childGoodsId;

    private String createTime;

    public static BrowHistoryGoods newBrowHistoryGoods(BrowHistory gcp) throws InstantiationException, IllegalAccessException {
    	BrowHistoryGoods gp =BrowHistoryGoods.class.newInstance();
		gp.setId(gcp.getId());
		gp.setUserId(gcp.getUserId());
		gp.setGoodsId(gcp.getGoodsId());
		gp.setChildGoodsId(gcp.getChildGoodsId());
		gp.setCreateTime(gcp.getCreateTime());
    	
    	gp.setBrandId(gcp.getBrandId());
		gp.setTitle(gcp.getTitle());
		gp.setSubTitle(gcp.getSubTitle());
		gp.setGoodsName(gcp.getGoodsName());
		gp.setStopTime(gcp.getStopTime());
		gp.setGoodsCode(gcp.getGoodsCode());
		gp.setIsuse(gcp.getIsuse());
		gp.setEmptyStore(gcp.getEmptyStore());
		gp.setPutaway(gcp.getPutaway());
		gp.setVirtual(gcp.getVirtual());
		gp.setPurchasePrice(gcp.getPurchasePrice());
		gp.setGoodsNo(gcp.getGoodsNo());
		gp.setFlag(gcp.getFlag());
		gp.setBelong(gcp.getBelong());
		gp.setFreightType(gcp.getFreightType());
		gp.setFreightId(gcp.getFreightId());
		gp.setPublishType(gcp.getPublishType());
		gp.setPublishTime(gcp.getPublishTime());
		gp.setGoodsSts(gcp.getGoodsSts());
		gp.setAuditSts(gcp.getAuditSts());
		gp.setCateId(gcp.getCateId());
		if(StringUtils.isNotEmpty(gcp.getChildgoodsid())){
			if(gcp.getGoodsMprice() != null && StringUtils.isNotEmpty(gcp.getGoodsMprice()+"")){
				if(gcp.getGcMprice() !=null && StringUtils.isNotEmpty(gcp.getGcMprice()+"")){
					gp.setGoodsMprice(gcp.getGcMprice()+"");
				}
				if(gcp.getGcSprice() !=null && StringUtils.isNotEmpty(gcp.getGcSprice()+"")){
					gp.setGoodsSprice(gcp.getGcSprice()+"");
				}
				if(gcp.getGcPprice() !=null && StringUtils.isNotEmpty(gcp.getGcPprice()+"")){
					gp.setGoodsPprice(gcp.getGcPprice()+"");
				}
			}else{
				gp.setGoodsMprice(gcp.getGcMinMprice()+" ~ "+gcp.getGcMaxMprice());
				gp.setGoodsSprice(gcp.getGcMinSprice()+" ~ "+gcp.getGcMaxSprice());
				gp.setGoodsPprice(gcp.getGcMinPprice()+" ~ "+gcp.getGcMaxPprice());
			}
		}else{
			if(gcp.getGoodsMprice() !=null && StringUtils.isNotEmpty(gcp.getGoodsMprice()+"")){
				gp.setGoodsMprice(gcp.getGoodsMprice()+"");
			}
			if(gcp.getGoodsSprice() !=null && StringUtils.isNotEmpty(gcp.getGoodsSprice()+"")){
				gp.setGoodsSprice(gcp.getGoodsSprice()+"");
			}
			if(gcp.getGoodsPprice() !=null && StringUtils.isNotEmpty(gcp.getGoodsPprice()+"")){
				gp.setGoodsPprice(gcp.getGoodsPprice()+"");
			}
		}
		return gp;
	}
    
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id == null ? null : id.trim();
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId == null ? null : userId.trim();
    }

    public String getGoodsId() {
        return goodsId;
    }

    public void setGoodsId(String goodsId) {
        this.goodsId = goodsId == null ? null : goodsId.trim();
    }

    public String getChildGoodsId() {
        return childGoodsId;
    }

    public void setChildGoodsId(String childGoodsId) {
        this.childGoodsId = childGoodsId == null ? null : childGoodsId.trim();
    }

    public String getCreateTime() {
        return createTime;
    }

    public void setCreateTime(String createTime) {
        this.createTime = createTime;
    }
}
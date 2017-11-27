package com.goods.order.service;

import java.util.List;

import com.goods.common.utils.GoodsResult;
import com.goods.pojo.TbOrder;
import com.goods.pojo.TbOrderItem;
import com.goods.pojo.TbOrderShipping;

public interface OrderService {
	GoodsResult createOrder(TbOrder order, List<TbOrderItem> orderItemList, TbOrderShipping orderShopping);
}

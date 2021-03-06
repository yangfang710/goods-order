package com.goods.order.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.goods.common.utils.ExceptionUtil;
import com.goods.common.utils.GoodsResult;
import com.goods.order.pojo.Order;
import com.goods.order.service.OrderService;

@Controller
public class OrderController {
	@Autowired
	private OrderService orderService;

	@RequestMapping(value = "/create", method = RequestMethod.POST)
	@ResponseBody
	public GoodsResult createOrder(@RequestBody Order order) {
		try {
			GoodsResult result = orderService.createOrder(order, order.getOrderItems(), order.getOrderShipping());
			return result;
		} catch (Exception e) {
			e.printStackTrace();
			return GoodsResult.build(500, ExceptionUtil.getStackTrace(e));
		}
	}

}

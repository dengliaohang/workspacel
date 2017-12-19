package com.bbdj8.bus.controller;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.bbdj8.bus.entity.RandomEntity;
import com.bbdj8.bus.service.RandomService;
import com.bbdj8.sys.utils.PageUtils;
import com.bbdj8.sys.utils.R;


/**
 * 随机码表
 * 
 * @author liwenjun
 * @email 18623682292@163.com
 * @date 2017-03-04 11:28:13
 */
@RestController
@RequestMapping("random")
public class RandomController {
	@Autowired
	private RandomService randomService;
	
	/**
	 * 列表
	 */
	@RequestMapping("/list")
	//@RequiresPermissions("random:list")
	public R list(Integer page, Integer limit){
		Map<String, Object> map = new HashMap<>();
		map.put("offset", (page - 1) * limit);
		map.put("limit", limit);
		
		//查询列表数据
		List<RandomEntity> randomList = randomService.queryList(map);
		int total = randomService.queryTotal(map);
		
		PageUtils pageUtil = new PageUtils(randomList, total, limit, page);
		
		return R.ok().put("page", pageUtil);
	}
	
	
	/**
	 * 信息
	 */
	@RequestMapping("/info/{randomno}")
	//@RequiresPermissions("random:info")
	public R info(@PathVariable("randomno") String randomno){
		RandomEntity random = randomService.queryObject(randomno);
		
		return R.ok().put("random", random);
	}
	
	/**
	 * 保存
	 */
	@RequestMapping("/save")
	//@RequiresPermissions("random:save")
	public R save(@RequestBody RandomEntity random){
		randomService.save(random);
		
		return R.ok();
	}
	
	/**
	 * 获取一条
	 */
	@RequestMapping("/get")
	public R update() {
		RandomEntity random = randomService.queryList(null).get(0);
		return R.ok().put("code", random.getRandomno());
	}
	
	/**
	 * 删除
	 */
	@RequestMapping("/delete")
	//@RequiresPermissions("random:delete")
	public R delete(@RequestBody String[] randomnos){
		randomService.deleteBatch(randomnos);
		
		return R.ok();
	}
}

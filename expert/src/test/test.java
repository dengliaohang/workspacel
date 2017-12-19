package test;


import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.zzj.entity.DArea;
import com.zzj.entity.DRegion;
import com.zzj.entity.HistoryMessage;
import com.zzj.entity.Merchandise;
import com.zzj.entity.PTitle;
import com.zzj.service.DAreaService;
import com.zzj.service.DRegionService;
import com.zzj.service.HistoryMessageService;
import com.zzj.service.MerchandiseService;
import com.zzj.service.PTitleService;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration({ "classpath:spring.xml","classpath:springmvc.xml" })
public class test  {

	@Autowired
	private HistoryMessageService his;
	@Autowired
	private MerchandiseService merchandiseService;
	
	
	@Autowired
	private PTitleService pTitleService;
	
	@Autowired
	private DRegionService dRegionService;
	
	@Autowired
	private DAreaService areaService;
	@Test
	public void testone(){
		/*ConnectonidMatchUserid u=new ConnectonidMatchUserid();
		u.setConnectionid("1");
		u.setDatetime(new Date());
		u.setId(Integer.parseInt("1"));
		u.setUserid("1");
		int insert = conn.insert(u);
		System.out.println(insert);
		HistoryMessage hm = null;*/
		
/*		Map<String, Object> map = new HashMap<String, Object>();
		try {
			//map=merchandiseService.selectMerchandiseByType(1, 10, 1);
			//Merchandise selectByPrimaryKey = merchandiseService.selectByPrimaryKey(2);
			//Map<String, Object> selectMerchandiseByPTitle = merchandiseService.selectMerchandiseByPTitle(1, 10, "1", 1);
			Map<String, Object> selectMerchandiseByType = merchandiseService.selectMerchandiseByType(1, 10, 1);
			Map<String, Object> selectMerchandiseByDRegion = merchandiseService.selectMerchandiseByDRegion(1, 10, "1", 1);
			for(Map.Entry<String, Object> entry : selectMerchandiseByDRegion.entrySet())    
			{    
			    System.out.println(entry.getKey()+": "+entry.getValue().toString());    
			} 
			//System.out.println("查询到的数据======"+selectByPrimaryKey.getAreaid()+"=2=="+selectByPrimaryKey.getCode());
			//System.out.println("查询到的===="+selectMerchandiseByPTitle.size());
		} catch (Exception e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		*/
		
		
		/*try {
			PTitle selectByPrimaryKey = pTitleService.selectByPrimaryKey(3);
			//List<PTitle> selectPTitleByLevel = pTitleService.selectPTitleByLevel("0");
			System.out.println("======="+selectByPrimaryKey.getName()+selectByPrimaryKey.getLevel());
			//System.out.println("======"+selectPTitleByLevel.size());
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}*/
	/*	try {
			//List<DRegion> selectAllDRegionByFirstCode = dRegionService.selectAllDRegionByFirstCode("1", "1");
			
			//List<DRegion> selectAllDRegionBySecondCode = dRegionService.selectAllDRegionBySecondCode("11");
			
			//System.out.println("查询到的数量为=="+selectAllDRegionBySecondCode.size()+"neirong==="+selectAllDRegionBySecondCode.toString());
			
			
			List<PTitle> ptitles=pTitleService.selectPTitleByLevel("0");
			List<PTitle> ptitless=pTitleService.selectPTitleByCode("2","02");
			
			
			for (PTitle p : ptitles) {
				System.out.println(p.getName());
			}
			System.out.println("===============================");
			for (PTitle p : ptitless) {
				System.out.println(p.getName());
			}
		}catch (Exception e) {
			// TODO: handle exception
		}*/
			
			/*Map<String, Object> selectMerchandiseByDescription = merchandiseService.selectMerchandiseByDRegion(1, 10, "1105", 1);
			for(Map.Entry<String, Object> entry : selectMerchandiseByDescription.entrySet())    
			{    
			    System.out.println(entry.getKey()+": "+entry.getValue().toString());    
			} 
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}*/
		
	/*	try {
			int deleteByPrimaryKey = merchandiseService.deleteByPrimaryKey(1);
			System.out.println("删除结果======"+deleteByPrimaryKey);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		*/
		
	/*	Merchandise mer=new Merchandise();
		mer.setCreater("deng3");
		mer.setId(2);
		try {
			//int insert = merchandiseService.insert(mer);
			int updateByPrimaryKey = merchandiseService.updateByPrimaryKey(mer);
			System.out.println("添加结果======"+updateByPrimaryKey);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}*/
		
		/*try {
			Map<String, Object> selectMerchandiseByDescription = merchandiseService.selectMerchandiseByDescription(1, 5, 1, "好");
			for(Map.Entry<String, Object> entry : selectMerchandiseByDescription.entrySet())    
			{    
			    System.out.println(entry.getKey()+": "+entry.getValue().toString());    
			} 
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		*/
		
		
		try {
			List<DRegion> selectAllFirstDRegion = dRegionService.selectAllFirstDRegion();
			//List<DRegion> selectAllDRegionByFirstCode = dRegionService.selectAllDRegionByFirstCode("1", "1");
			
			//List<DRegion> selectAllDRegionBySecondCode = dRegionService.selectAllDRegionBySecondCode("1103");
			System.out.println("======"+selectAllFirstDRegion.get(0).getName());
			
		} catch (Exception e) {
			// TODO Auto-generated caatch block
			e.printStackTrace();
		}
		
		
		
		
		
		
		
		
		/*
		try {
			hm = his.selectByPrimaryKey(Integer.parseInt("00000001"));
		} catch (NumberFormatException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println(hm.toString());*/
	}

}

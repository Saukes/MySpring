package cn.mldn.MySpring.service.impl;

import org.springframework.stereotype.Service;

import cn.mldn.MySpring.service.IDeptService;
import cn.mldn.MySpring.vo.Dept;
@Service
public class DeptServiceImpl implements IDeptService {

	@Override
	public boolean add(Dept vo) {
		if (vo == null) {
			throw new RuntimeException("空对象无法进行业务处理操作。") ;
		}
		System.out.println("【DeptService】实现部门数据增加。");
		return false;
	}

}

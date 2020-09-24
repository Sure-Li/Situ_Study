package com.situ;

import java.util.HashMap;
import java.util.Map;

import cn.itcast.commons.CommonUtils;

public class CommonUntilsTest {
	// 测试Uuid
//	返回一个随机的32长度的字符串
//可以用来做id 或者激活码
	public static void testUuid() {
		String s = CommonUtils.uuid();
		System.out.println(s);
	}

	/**
	 * 作用：把一个Map的数据封装到Javabean中 要求： 1map中的key名称与Javabean中的属性名称相同
	 */
	public static void TestToBean() {
		/**
		 * 创建map
		 */
		Map<String, Object> map = new HashMap<String, Object>();
		map.put("pid", "123");
		map.put("pname", "wang");
		map.put("age", 23);
		map.put("xxx", "XXX");

//		通过map的数据 来创建Person类型的Javabean对象
		Person p = CommonUtils.toBean(map, Person.class);
		System.out.println(p);
	}

	public static void main(String[] args) {
		testUuid();
		TestToBean();
	}
//	此处一个map可以生成两个类 比如一个类使用前两个 另一个使用后两个
}

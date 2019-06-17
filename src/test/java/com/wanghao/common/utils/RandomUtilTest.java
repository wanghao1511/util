package com.wanghao.common.utils;

import org.junit.Test;

public class RandomUtilTest {
	/**
	 * 
	 * <br>
	 * Description:TODO max 和 min 之间的随机数 <br>
	 * Author:王昊(823865618@qq.com) <br>
	 * Date:2019年6月17日
	 */
	@Test
	public void testRandom() {
		System.out.println(RandomUtil.random(1, 8));
	}

	/**
	 * 
	 * <br>
	 * Description:TODO max 和 min 之间不重复的n个随机数 <br>
	 * Author:王昊(823865618@qq.com) <br>
	 * Date:2019年6月17日
	 */
	@Test
	public void test() {
		for (int i = 0; i < 5; i++) {
			System.out.println(RandomUtil.subRandom(2, 8, 2));
		}

	}
	
	/**
	 * Description:TODO 1个1-9,a-Z之间的随机字符 <br>
	 * Author:王昊(823865618@qq.com) <br>
	 * Date:2019年6月17日
	 */
	@Test 
	public void testCharat() {
		System.out.println(RandomUtil.randomCharacter());
	}

	/**
	 * 
	 * <br>
	 * Description:TODO 生成随机码 <br>
	 * Author:王昊(823865618@qq.com) <br>
	 * Date:2019年6月17日
	 */
	@Test
	public void testString() {
		System.out.println(RandomUtil.randomString(4));
	}


}

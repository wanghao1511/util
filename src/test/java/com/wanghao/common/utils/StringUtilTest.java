package com.wanghao.common.utils;

import org.junit.Test;

public class StringUtilTest {

	/**
	 * Description:TODO 判断源字符串是否有值，空引号(空白字符串)也算没值 <br>
	 * Author:王昊(823865618@qq.com) <br>
	 * Date:2019年6月17日
	 */
	@Test
	public void testHasLength() {
		System.out.println(StringUtil.hasLength("5"));
	}

	/**
	 * Description:TODO 判断源字符串是否有值，空引号(空白字符串)和空格也算没值 <br>
	 * Author:王昊(823865618@qq.com) <br>
	 * Date:2019年6月17日
	 */
	@Test
	public void testHastext() {
		System.out.println(StringUtil.hasText("541"));
	}


}

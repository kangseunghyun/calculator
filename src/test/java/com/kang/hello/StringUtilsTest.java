package com.kang.hello;

import static org.junit.Assert.*;

import org.junit.Test;


class StringUtilsTest {

	@Test
	void test() {
		assertEquals("1,000", StringUtils.comma(1000));
	}

}

package com.kang.hello;

import static org.junit.Assert.*;

import org.junit.Test;


public class StringUtilsTest {

	@Test
	public void test() {
		assertEquals("1,000", StringUtils.comma(1000));
	}

}

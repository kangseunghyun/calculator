package com.kang;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

import com.kang.calculator.CalculatorTest;
import com.kang.hello.HelloWorldTest;
import com.kang.hello.StringUtilsTest;


@RunWith(Suite.class)
@SuiteClasses({
	CalculatorTest.class,
	HelloWorldTest.class,
	StringUtilsTest.class,
	DateTest.class
})
public class AllTests {

}

package com.kang;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

import com.kang.calculator.Calculator;


@RunWith(Suite.class)
@SuiteClasses({
	Calculator.class
})
public class AllTests {

}

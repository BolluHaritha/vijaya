package com.app.JUnitDemo;
import org.junit.platform.suite.api.IncludeTags;
import org.junit.platform.suite.api.SelectClasses;
import org.junit.runner.RunWith;
import org.junit.platform.runner.JUnitPlatform;

@SuppressWarnings("deprecation")
@RunWith(JUnitPlatform.class)
//@SelectPackages({"my2junitTest","myjunitTest"})

//@SelectClasses(ParametrizedTest.class)
@SelectClasses({com.app.JUnitDemo.IncludeExcludeTags.class})
@IncludeTags({"prod"})


public class JUnit5runner {

}

DependencyTesterTest1 : UnitTest {
	test_check_classname {
		var result = DependencyTester.new;
		this.assert(result.class == DependencyTester);
	}
}


DependencyTesterTester {
	*new {
		^super.new.init();
	}

	init {
		DependencyTesterTest1.run;
	}
}

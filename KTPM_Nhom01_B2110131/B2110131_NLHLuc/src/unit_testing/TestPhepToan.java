package unit_testing;

import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import thuvien.tinhtoan.PhepTinh;

public class TestPhepToan {
	
	@Test(dataProvider="testCong")
	public void TestCong(int a,int b,int expected)
	{
		System.out.println("Before testcase");
		float reality=PhepTinh.Op('+',a,b);
		boolean testCase=(expected==reality);
		Assert.assertTrue(testCase, "Invalid credential");
		System.out.println(a+" + "+b+" = "+reality+" Niceee!!!");
		System.out.printf("After testcase\n====================\n");
	}
	
	@Test(dataProvider="testTru")
	public void TestTru(int a,int b,int expected)
	{
		System.out.println("Before testcase");
		float reality=PhepTinh.Op('-',a,b);
		boolean testCase=(expected==reality);
		Assert.assertTrue(testCase, "Invalid credential");
		System.out.println(a+" - "+b+" = "+reality+" Niceee!!!");
		System.out.printf("After testcase\n====================\n");
	}
	
	@Test(dataProvider="testNhan")
	public void TestNhan(float a,float b,float expected)
	{
		System.out.println("Before testcase");
		float reality=PhepTinh.Op('*',a,b);
		boolean testCase=(expected==reality);
		Assert.assertTrue(testCase, "Invalid credential");
		System.out.println(a+" * "+b+" = "+reality+" Niceee!!!");
		System.out.printf("After testcase\n====================\n");
	}
	
	
	@DataProvider(name = "testCong")
	public Object[][] testCongProvider() {
	    unit_testing.ReadExcelFile config = new unit_testing.ReadExcelFile("F:\\Document\\TestProjects\\TestData.xlsx");
	
	    int rows = config.getRowCount(0);
	    Object[][] credentials = new Object[rows][3];
	
	    for (int i = 0; i < rows; i++) {
	        credentials[i][0] = config.getData(0, i, 0);
	        credentials[i][1] = config.getData(0, i, 1);
	        credentials[i][2] = config.getData(0, i, 2);
	    }
	
	    return credentials;
	}
	
	@DataProvider(name = "testTru")
	public Object[][] testTruProvider() {
	    unit_testing.ReadExcelFile config = new unit_testing.ReadExcelFile("F:\\Document\\TestProjects\\TestData.xlsx");
	
	    int rows = config.getRowCount(1);
	    Object[][] credentials = new Object[rows][3];
	
	    for (int i = 0; i < rows; i++) {
	        credentials[i][0] = config.getData(1, i, 0);
	        credentials[i][1] = config.getData(1, i, 1);
	        credentials[i][2] = config.getData(1, i, 2);
	    }
	
	    return credentials;
	}
	
	@DataProvider(name = "testNhan")
	public Object[][] testNhanProvider() {
	    unit_testing.ReadExcelFile config = new unit_testing.ReadExcelFile("F:\\Document\\TestProjects\\TestData.xlsx");
	
	    int rows = config.getRowCount(2);
	    Object[][] credentials = new Object[rows][3];
	
	    for (int i = 0; i < rows; i++) {
	        credentials[i][0] = config.getDataFloat(2, i, 0);
	        credentials[i][1] = config.getDataFloat(2, i, 1);
	        credentials[i][1] = config.getDataFloat(2, i, 2);
	    }
	
	    return credentials;
	}
}

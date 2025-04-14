package Inheritance_Single_Inheritance;

public class TestCase2 extends CommonToAll {
    void runningTestCase2() {

        StartBrowser(); //using the function from parent - CommonToAll
        System.out.println("Running TC2");
        readExcelFile(); //using the function from parent - CommonToAll
        readDataBaseFile(); //using the function from parent - CommonToAll
        CloseBrowser(); //using the function from parent - CommonToAll


    }
}

package Inheritance_Single_Inheritance;

public class TestCase1  extends CommonToAll{
    void runningTestCase1() {

        StartBrowser(); //using the function from parent - CommonToAll
        System.out.println("Running TC1");
        CloseBrowser(); //using the function from parent - CommonToAll



    }
}

